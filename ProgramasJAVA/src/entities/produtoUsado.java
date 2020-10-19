package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class produtoUsado extends produto {

	
private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	private Date produtoData;

	public produtoUsado(String name, Double preco, Date produtoData) {
		super(name, preco);
		this.produtoData = produtoData;
	}

	public Date getProdutoData() {
		return produtoData;
	}

	public void setProdutoData(Date produtoData) {
		this.produtoData = produtoData;
	}

	@Override
	public String precoTag() {
		return getName() 
				+ " (used) $ " 
				+ String.format("%.2f", getPreco())
				+ " (Manufacture date: "
				+ sdf.format(produtoData)
				+ ")";
	}
	
	
	
}
