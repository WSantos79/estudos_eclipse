package Faculdade.S3U2;



import javax.sound.midi.MidiUnavailableException;

/**
 * @author Wellington Santos - WSantos79
 * Código 3.21
 */
public class Main {

    public static void main(String[] args) throws MidiUnavailableException {
        System.out.println("Tocando a melodia no piano velocidade normal");
        Melodia melodiaNormal = new Melodia(1.00);
        Piano piano = new Piano();
        piano.setVolume(75);
        piano.tocar(melodiaNormal);
        
        System.out.println("Tocando a melodia no violancelo velocidade rápida");
        Melodia melodiaRapida = new Melodia(1.25);
        Violoncelo violoncelo = new Violoncelo();
        violoncelo.setVolume(100);
        violoncelo.tocar(melodiaRapida);
        
        System.out.println("Tocando a melodia no violão velocidade lenta");
        Melodia melodiaLenta = new Melodia(0.75);
        Violao violao = new Violao();
        violao.setVolume(50);
        violao.tocar(melodiaLenta);
    }
}