package faculdade.S4U3.SP.core;

/**
 * Classe que modela a entidade Caixa.
 * @author Jesimar S. Arantes
 * C�digo 4.14
 */
public class Caixa extends CaixaIdeia {
    
    public String nomeItem;
    public int qtdItem;
    
    /**
     * Construtor da caixa.
     * @param nomeItem nome do item que est� na caixa.
     * @param qtdItem quantidade de itens que est� na caixa.
     * @param posX posi��o x da caixa.
     * @param posY posi��o y da caixa.
     * @param peso valor do peso da caixa.
     * @param comprimento valor do comprimento da caixa.
     * @param largura valor da largura da caixa.
     * @param altura valor da altura da caixa.
     */
    public Caixa(String nomeItem, int qtdItem, int posX, int posY, float peso, 
            float comprimento, float largura, float altura) {
        super(posX, posY, peso, comprimento, largura, altura);
        this.nomeItem = nomeItem;
        this.qtdItem = qtdItem;
    }

    /**
     * M�todo que imprime o estado do objeto.
     * @return retorna uma string que representa o estado do objeto.
     */
    @Override
    public String toString() {
        return "Caixa{" + "nomeItem=" + nomeItem + ", qtdItem=" + qtdItem + '}';
    }
}