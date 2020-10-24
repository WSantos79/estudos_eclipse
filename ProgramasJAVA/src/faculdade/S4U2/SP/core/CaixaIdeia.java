package faculdade.S4U2.SP.core;

/**
 * Classe abstrata que modela a ideia de caixa.
 * @author Jesimar S. Arantes
 * C�digo 4.14
 */
public abstract class CaixaIdeia {
    protected int posX;
    protected int posY;
    protected float peso;
    protected final float comprimento;
    protected final float largura;
    protected final float altura;
    
    /**
     * Contrutor da Caixa Ideia.
     * @param posX coordenada x da caixa.
     * @param posY coordenada y da caixa.
     * @param peso valor do peso da caixa.
     * @param comprimento valor do comprimento da caixa.
     * @param largura valor da largura da caixa.
     * @param altura valor da altura da caixa.
     */
    public CaixaIdeia(int posX, int posY, float peso, 
            float comprimento, float largura, float altura) {
        this.posX = posX;
        this.posY = posY;
        this.peso = peso;
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    /**
     * Obt�m a posi��o x da caixa
     * @return retorna a posi��o x da caixa
     */
    public int getPosX() {
        return posX;
    }

    /**
     * Define o valor da posi��o no eixo x da da caixa
     * @param posX valor da posi��o x da caixa
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * Obt�m a posi��o y da caixa
     * @return retorna a posi��o y da caixa
     */
    public int getPosY() {
        return posY;
    }

    /**
     * Define o valor da posi��o no eixo y da da caixa
     * @param posY valor da posi��o y da caixa
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * Obt�m o peso da caixa
     * @return retorna o peso da caixa
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Define o peso da caixa
     * @param peso valor do peso da caixa
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }
}
