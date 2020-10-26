package faculdade.S4U3.SP.core;

/**
 * Classe abstrata que modela a ideia de rob�.
 * @author Jesimar da Silva Arantes
 * C�digo 4.14
 */
public abstract class RoboIdeia {
    protected float posicaoX;
    protected float posicaoY;
    protected Orientacao orientacao;
    protected String nome;
    protected float peso;
    
    /**
     * Assinatura do m�todo que move o rob�.
     * @param posX posi��o x em que o rob� ser� movido.
     * @param posY posi��o y em que o rob� ser� movido.
     */
    public abstract void move(float posX, float posY);
    
    /**
     * Assinatura do m�todo que move o rob� ao longo do eixo x.
     * @param dist dist�ncia a partir da posi��o atual no eixo x que ser� movido o rob�. 
     */
    public abstract void moveX(float dist);
    
    /**
     * Assinatura do m�todo que move o rob� ao longo do eixo y.
     * @param dist dist�ncia a partir da posi��o atual no eixo y que ser� movido o rob�.
     */
    public abstract void moveY(float dist);
}
