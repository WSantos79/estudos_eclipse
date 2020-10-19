package Faculdade;
// teste
public class Robo {
    String nome;
    String cor;
    float velocidadeMax;
    int nivelBateriaAtual;
    float pesoCargaMax;
    String tipoTracao;
    boolean TemAntena;
    
    
public void printStatus(){
    	
    System.out.println("-------------------------------");
	
    System.out.println("Meu nome: " + nome);
	
    System.out.println("Cor do Robô: " + cor);
	
    System.out.println("Velocidade Max: " + velocidadeMax);
	
    System.out.println("Bateria: " + nivelBateriaAtual);
	
    System.out.println("Carga Max: " + pesoCargaMax);
	
    System.out.println("Tipo de Tração: " + tipoTracao);
	
    System.out.println("Tem Antena: " + TemAntena);
	
    System.out.println("-------------------------------");
	
    }   
    
    public static void main(String [] args) {
    	
    	Robo obj1 = new Robo();
    	obj1.nome = "R-801";
    	obj1.cor = "azul";
    	obj1.velocidadeMax = 6;
    	obj1.nivelBateriaAtual =  78;
    	obj1.pesoCargaMax = 10;
    	obj1.tipoTracao = "esteira";
    	obj1.TemAntena = true;
    	obj1.printStatus();  	
    	
        Robo objeto2 = new Robo();    	
        objeto2.nome = "R-701";	
        objeto2.cor = "laranja";	
        objeto2.velocidadeMax = 3;	
        objeto2.nivelBateriaAtual = 51;	
        objeto2.pesoCargaMax = 15;	
        objeto2.tipoTracao = "esteira";	
        objeto2.TemAntena = false;	
        objeto2.printStatus();
    }
	
}
