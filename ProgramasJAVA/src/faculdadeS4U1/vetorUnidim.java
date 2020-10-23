package faculdadeS4U1;

// Arrays unidimensionais: Vetores

public class vetorUnidim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	int vet[] = {1, 5, 3, 4};
		//  int[] vet = {1, 5, 3, 4};
		// int, double, char ...
		
		int vet[] = new int[11];
		
		for (int i = 0; i < vet.length; i++) {
			
			vet[i] = (i+1) * 2;
			System.out.println("Array(vetor)[" + i + "]: " + vet[i]);
		}
				
		

	}

}
