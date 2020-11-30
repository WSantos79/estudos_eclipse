package udemy.secao10.entities;

public class empregado {
	
	private Integer id;
	private String nome;	
	private Double salario;

	public empregado() {}
		

	public empregado(Integer id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;		
		this.salario = salario;
	}


	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public Double getsalario() {
		return salario; 
	}

	public void setsalario(Double salario) {
		this.salario = salario;
	}
	
	public void addSalario(double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
	
	
	}


