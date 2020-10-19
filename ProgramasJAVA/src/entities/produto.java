package entities;

public class produto {
	
	private String name;
	private Double preco;
	
	
public produto(String name, Double preco) {
		super();
		this.name = name;
		this.preco = preco;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String precoTag() {
		return name
				+ " $ "
				+ String.format("%.2f", preco);
	}
	

}
