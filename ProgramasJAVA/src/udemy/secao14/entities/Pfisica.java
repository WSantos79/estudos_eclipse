package udemy.secao14.entities;

public class Pfisica extends Pessoa {

	private Double gastSaude;

	public Pfisica() {
	}

	public Pfisica(String nome, Double rendAnual, Double gastSaude) {
		super(nome, rendAnual);
		this.gastSaude = gastSaude;
	}

	public Double getGastSaude() {
		return gastSaude;
	}

	public void setGastSaude(Double gastSaude) {
		this.gastSaude = gastSaude;
	}

	@Override
	public double IR() {
		double IR = 0;
		if (getRendAnual() < 20000.00) {
			IR = getRendAnual() * 0.15;
		} else {
			IR = getRendAnual() * 0.25;
		}
		IR -= (gastSaude * 0.5);
		if (gastSaude < 0 || IR < 0) {
			IR = 0.0;
			
		}
		return IR;
	}
}
