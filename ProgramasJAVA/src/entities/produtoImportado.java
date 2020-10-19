package entities;

public class produtoImportado extends produto{

	private Double taxaAlfandega;

public produtoImportado(String name, Double preco, Double taxaAlfandega) {
		super(name, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public Double precoTotal() {
		
		return getPreco() + taxaAlfandega;
	}
	
	@Override
	public String precoTag() {
		return getName()
				+ " $ "
				+ String.format("%.2f", precoTotal())
				+ " (Taxa Alfandega: $ " 
				+ String.format("%.2f", taxaAlfandega)
				+ ")";
	}
	
	
}
