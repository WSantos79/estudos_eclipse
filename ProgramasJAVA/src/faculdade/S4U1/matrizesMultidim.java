package faculdade.S4U1;

// Arrays multidimensionais: Matrizes

public class matrizesMultidim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double matriz[][] = {{1.5, 5.2}, {3.6, 4.9}, {2.4, 8.1}};
		
		for (int i = 0; i < matriz.length; i++) {
		    for (int j = 0; j < matriz[i].length; j++) {
		    	System.out.println("M[" +i+ "][" +j+ "]: " + matriz[i][j]);
		}

	}
		
		System.out.printf("%n---------------------------------------------%n");
		System.out.println();
		
		int mat[][] = {{2, 4, 7}, {6, 3}, {5, 1, 9, 0}};
		
		for (int i = 0; i < mat.length; i++) {

		    for (int j = 0; j < mat[i].length; j++) {

		        System.out.println("M["+i+"]["+j+"]="+mat[i][j]);
		        	
		    }

		}
	
	




	}}
