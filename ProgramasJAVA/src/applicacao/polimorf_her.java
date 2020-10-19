package applicacao;

	     
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;
import entities.Tercerizado;

public class polimorf_her {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Empregado> list = new ArrayList <>();	
		
		System.out.print("Digite a quantidade dos funcionarios: ");
		int n = sc.nextInt();
		
		for (int i =1 ; i <=n; i++) {
		System.out.println("Dados do funcionario numero " +i + ": ");
		System.out.println("Ele é tercerizado S/N ? ");
		char ch = sc.next().charAt(0);
		
		System.out.println("Nome: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Horas: ");
		int horas = sc.nextInt();
		
		System.out.println("Valor por horas: ");
		Double v_p_hora = sc.nextDouble();
		
		 if (ch == 's') {
			 System.out.println("Taxa adcional: ");
			 double taxa = sc.nextDouble();
			 
			 
			 list.add(new Tercerizado(name, horas, v_p_hora, taxa));
			 
		 }else {
		
			 list.add(new Empregado(name, horas, v_p_hora));
			 
		 }}
		 
		System.out.println(" ");
		System.out.println("Pagamentos: ");
		
		for (Empregado emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.pagamentos()));
			
			
		}
		
		sc.close();
	}

}
