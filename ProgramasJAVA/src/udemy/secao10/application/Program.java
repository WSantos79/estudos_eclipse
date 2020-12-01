package udemy.secao10.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import udemy.secao10.entities.Empregado;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Empregado> list = new ArrayList<>();

		System.out.println();
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Emplyoee # " + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();

			while (hasid(list, id)) {
				System.out.print("ID already taken. Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salary: ");
			Double salario = sc.nextDouble();

			list.add(new Empregado(id, nome, salario));
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();

		Empregado emp = list.stream().filter(x -> x.getid() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println();
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double porcentagem = sc.nextDouble();
			emp.addSalario(porcentagem);
		}

		System.out.println();
		System.out.println("List of employess:");
		for (Empregado x : list) {
			System.out.println(x);
		}
		sc.close();
	}

	public static boolean hasid(List<Empregado> list, int id) {
		Empregado emp = list.stream().filter(x -> x.getid() == id).findFirst().orElse(null);
		return emp != null;
	}

}
