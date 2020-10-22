package Faculdade;

/**
 *
 *
 *
 *
 *
 *
 * @author WSantos
 *
 *
 *
 *
 */

public class Livro implements Comparable<Livro> {

	public String nome;

	public double custo;

	public Livro(String nome, double custo) {

		this.nome = nome;

		this.custo = custo;

	}

	@Override

	public int compareTo(Livro livro) {

		if (Math.abs(custo - livro.custo) < 0.001) {

			return 0;

		} else if (custo > livro.custo) {

			return 1;

		} else {

			return -1;

		}

	}

	public static void main(String[] args) {

		Livro l1 = new Livro("Alice no País das Maravilhas", 38);

		Livro l2 = new Livro("O Senhor dos Anéis", 44);

		Livro l3 = new Livro("Harry Potter", 38);

		int compL1L2 = l1.compareTo(l2);

		int compL1L3 = l1.compareTo(l3);

		int compL2L3 = l2.compareTo(l3);

		System.out.println("Comparação l1 e l2: " + compL1L2);

		System.out.println("Comparação l1 e l3: " + compL1L3);

		System.out.println("Comparação l2 e l3: " + compL2L3);

	}
}
