package faculdadeS4U1;

import java.util.Arrays;

public class vetorOrdenar {

	public static void main(String[] args) {

		int vetor[] = { 6, 3, 7, 4, 2, 5, 1, 9, 0, 8 };

		System.out.println("Vetor antes de ordenar:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
		}
		System.out.println("\n\nVetor apos ordenar:");
		Arrays.sort(vetor);
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
		}

	}

}
