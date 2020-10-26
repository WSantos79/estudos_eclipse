package faculdade.S4U3.SP.core;

/**
 * Classe que modela a entidade rob�
 * @author Jesimar da Silva Arantes
 * C�digo 4.14
 */
public class Robo extends RoboIdeia {
    
    private float velocidade = 1;
    private final float velocidadeMax = 5;
    private final float pesoCargaMax = 20;
    private final String tipoTracao = "esteira";
    private final int altura = 60;
    private final int largura = 64;

    /**
     * Construtor padr�o da aplica��o.
     */
    public Robo() {
        super.nome = "R-ATM";
        super.peso = 70;
        super.posicaoX = 50;
        super.posicaoY = 50;
    }

    /**
     * Construtor da classe rob�
     * @param nome nome do rob�.
     */
    public Robo(String nome) {
        super.nome = nome;
        super.peso = 70;
        super.posicaoX = 50;
        super.posicaoY = 50;
    }

    /**
     * Construtor da classe rob�
     * @param nome nome do rob�.
     * @param peso valor do peso do rob�.
     */
    public Robo(String nome, float peso) {
        super.nome = nome;
        super.peso = peso;
        super.posicaoX = 50;
        super.posicaoY = 50;
    }
    
    /**
     * Construtor da classe rob�
     * @param posX valor da posi��o x inicial do rob�.
     * @param posY valor da posi��o y inicial do rob�.
     */
    public Robo(float posX, float posY) {
        super.nome = "R-ATM";
        super.peso = 70;
        super.posicaoX = posX;
        super.posicaoY = posY;
    }

    /**
     * Construtor da classe rob�
     * @param nome nome do rob�.
     * @param peso valor do peso do rob�.
     * @param posX valor da posi��o x inicial do rob�.
     * @param posY valor da posi��o y inicial do rob�.
     */
    public Robo(String nome, float peso, float posX, float posY) {
        super.nome = nome;
        super.peso = peso;
        super.posicaoX = posX;
        super.posicaoY = posY;
    }

    /**
     * Move o rob� para a posi��o x e y.
     * @param posX posi��o x em que o rob� ser� movido.
     * @param posY posi��o y em que o rob� ser� movido.
     * @throws IllegalArgumentException exce��o lan�ada quando o argumento for NaN ou infinita
     */
    @Override
    public void move(float posX, float posY) {
        if (Float.isNaN(posX) || Float.isNaN(posY)
                || Float.isInfinite(posX) || Float.isInfinite(posY)) {
            throw new IllegalArgumentException("Argumentos n�o v�lidos");
        }
        super.posicaoX = posX;
        super.posicaoY = posY;
    }

    /**
     * Move o rob� ao longo do eixo x.
     * @param dist dist�ncia a partir da posi��o atual no eixo x que ser� movido o rob�. 
     * @throws IllegalArgumentException exce��o lan�ada quando o argumento for NaN ou infinito
     */
    @Override
    public void moveX(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Argumento n�o v�lido");
        }
        super.posicaoX += dist;
    }

    /**
     * Move o rob� ao longo do eixo y.
     * @param dist dist�ncia a partir da posi��o atual no eixo y que ser� movido o rob�.
     * @throws IllegalArgumentException exce��o lan�ada quando o argumento for NaN ou infinito
     */
    @Override
    public void moveY(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Argumento n�o v�lido");
        }
        super.posicaoY += dist;
    }

    /**
     * M�todo que define a orienta��o do rob� e tamb�m efetua o movimento na 
     * dire��o da orienta��o que a tecla foi precionada.
     * @param tecla char representando a tecla que foi precionada.
     */
    public void setOrientacao(char tecla) {
        if (tecla == 'w') {
            super.orientacao = Orientacao.FRENTE;
            moveY(velocidade);
        } else if (tecla == 's') {
            super.orientacao = Orientacao.ATRAS;
            moveY(-velocidade);
        } else if (tecla == 'a') {
            super.orientacao = Orientacao.ESQUERDA;
            moveX(-velocidade);
        } else if (tecla == 'd') {
            super.orientacao = Orientacao.DIREITA;
            moveX(velocidade);
        } else {
            throw new IllegalArgumentException("Argumento n�o v�lido");
        }
    }
    
    public void movimentosAgendados(String... moves){
        for (String tecla : moves){
            if ((!tecla.equals("--move") && !tecla.equals("-m"))){
                System.out.println("Tecla: " + tecla);
                System.out.println("Descri��o: " + descricaoDoMovimento(tecla.charAt(0)));
                setOrientacao(tecla.charAt(0));
                printPos();
            }
        }
    }
    
    public String descricaoDoMovimento(char tecla){
        if (tecla == 'w'){
            return "Movendo para frente";
        } else if (tecla == 'a'){
            return "Movendo para esquerda";
        } else if (tecla == 's'){
            return "Movendo para baixo";
        } else if (tecla == 'd'){
            return "Movendo para direita";
        } else {
            return "";
        }
    }
    
    public boolean avaliaPosicao(int posX, int posY){
        posX = posX + largura/2;
        posY = posY + altura/2;
        if (posX < 40 || posX > 560 || posY < 30 || posY > 360){
            return false;//delimita�ao da fronteira da sala/galpao
        }
        if ((posX >= 170 && posX <= 430) && (posY >= 240 && posY <= 400)){
            return false;//delimita�ao da regiao de opera�ao de maquinas
        }
        if ((posX >= 0 && posX <= 100) && (posY >= 0 && posY <= 200)){
            return false;//delimita�ao da regiao de caixas com livros 
        }
        if ((posX >= 500 && posX <= 600) && (posY >= 0 && posY <= 200)){
            return false;//delimita�ao da regiao de caixas com impressoras
        }
        if ((posX >= 170 && posX <= 430) && (posY >= 0 && posY <= 90)){
            return false;//delimita�ao da regiao de caixas com HDs acima
        }
        if ((posX >= 170 && posX <= 430) && (posY >= 120 && posY <= 200)){
            return false;//delimita�ao da regiao de caixas com HDs abaixo
        }
        return true;
    }
    
    /**
     * M�todo que imprime todos os estados internos do objeto. 
     */
    public void printStatus() {
        System.out.println("-----------Info R-ATM----------");
        System.out.println("Nome do Rob�: " + nome);
        System.out.println("Peso do Rob�: " + peso);
        System.out.println("Velocidade Max: " + velocidadeMax);
        System.out.println("Carga Max do Rob�: " + pesoCargaMax);
        System.out.println("Tipo Tra��o do Rob�: " + tipoTracao);
        System.out.println("Posi��o X do Rob�: " + posicaoX);
        System.out.println("Posi��o Y do Rob�: " + posicaoY);
        System.out.println("-------------------------------");
    }

    /**
     * M�todo que imprime a posi��o corrente do objeto.
     */
    public void printPos() {
        System.out.println("(x, y) = (" + posicaoX + ", " + posicaoY + ")");
    }

    /**
     * M�todo que imprime o estado do objeto.
     * @return retorna uma string que representa o estado do objeto.
     */
    @Override
    public String toString() {
        return "Robo{" + "posicaoX=" + posicaoX + ", posicaoY=" + posicaoY
                + ", orientacao=" + orientacao + '}';
    }

    /**
     * M�todo que compara dois objetos.
     * @param obj objeto a ser comparado.
     * @return retorna true se os dois objetos s�o iguais e retorna false se forem diferentes.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Robo) {
            Robo robo = (Robo) obj;
            return super.nome.equals(robo.nome);
        } else {
            return false;
        }
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }   
    
    public int getPosicaoX() {
        return (int)this.posicaoX;
    }

    public int getPosicaoY() {
        return (int)this.posicaoY;
    }

    public void setPosicaoX(float posicaoX) {
        this.posicaoX = posicaoX;
    }

    public void setPosicaoY(float posicaoY) {
        this.posicaoY = posicaoY;
    }
    
}