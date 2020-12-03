package udemy.secao14.entities;

public class Pjuridica extends Pessoa {

	private Integer Nfuncionarios;

	public Pjuridica() {
	}

	public Pjuridica(String nome, Double rendAnual, Integer nfuncionarios) {
		super(nome, rendAnual);
		Nfuncionarios = nfuncionarios;
	}

	public Integer getNfuncionarios() {
		return Nfuncionarios;
	}

	public void setNfuncionarios(Integer nfuncionarios) {
		Nfuncionarios = nfuncionarios;
	}

	@Override
	public double IR() {		
		if (Nfuncionarios > 10) {
			return getRendAnual() * 0.14;
		} else {
			return getRendAnual() * 0.16;
		}
		
	}
}
