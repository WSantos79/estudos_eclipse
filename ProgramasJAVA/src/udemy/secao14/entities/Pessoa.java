package udemy.secao14.entities;

public abstract class Pessoa {

	private String nome;
	private Double rendAnual;

	public Pessoa() {
	}

	public Pessoa(String nome, Double rendAnual) {
		super();
		this.nome = nome;
		this.rendAnual = rendAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendAnual() {
		return rendAnual;
	}

	public void setRendAnual(Double rendAnual) {
		this.rendAnual = rendAnual;
	}

	public abstract double IR();

}
