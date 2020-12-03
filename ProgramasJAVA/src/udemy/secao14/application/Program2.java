package udemy.secao14.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import udemy.secao14.entities.Pessoa;
import udemy.secao14.entities.Pfisica;
import udemy.secao14.entities.Pjuridica;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<Pessoa>();

		System.out.print("Enter the number of taxpayers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Tax player #%d data: \n", i);
			System.out.print("Individual or company (i/c)?");
			char tipo = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			double renda = sc.nextDouble();

			if (tipo == 'i') {
				System.out.print("Health expenditures: ");
				double gastos = sc.nextDouble();
				Pfisica x = new Pfisica(nome, renda, gastos);
				list.add(x);
			} else {
				System.out.print("Number of employees: ");
				int empregados = sc.nextInt();
				list.add(new Pjuridica(nome, renda, empregados));
			}
		}
		System.out.println();
		System.out.println("TEXT PAID:");

		for (Pessoa p : list) {
			System.out.println(p.getNome() + ": $ " + String.format("%.2f", p.IR()));
		}
		System.out.println();
		double soma = 0;
		for (Pessoa p : list) {
			soma += p.IR();
		}

		System.out.printf("TOTAL TAXES: $ %.2f", soma);

		sc.close();
	}

}
