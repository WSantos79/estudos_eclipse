package applicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.produto;
import entities.produtoImportado;
import entities.produtoUsado;

public class polimorf_her2 {

public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Numero de produtos: ");
		int n = sc.nextInt();
		
		List<produto> list = new ArrayList <>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Usado, Importado ou Comum (c,u,i)?");
			sc.nextLine();
			char ch = sc.next().charAt(0);
			
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Preço: ");
			Double preco = sc.nextDouble();
			
			 if (ch == 'i') {
				 System.out.println("Taxa da Alfandega: ");
				 Double taxaAlfandega = sc.nextDouble();	
				 
				 list.add(new produtoImportado(name, preco, taxaAlfandega));
			 }
			 else if (ch == 'u') {
				 System.out.println("Data de fabricação (DD/MM/AAAA): ");	
				 Date produtoData = sdf.parse(sc.next());
				 
				 list.add(new produtoUsado(name, preco, produtoData));
			 }
			 else {
				 list.add(new produto(name, preco));
			 }
			 
		}
		
		System.out.println("");
		System.out.println("Preços: ");
		for (produto prod : list) {
			System.out.println(prod.precoTag());
		}
		
		
sc.close();
	}
}
