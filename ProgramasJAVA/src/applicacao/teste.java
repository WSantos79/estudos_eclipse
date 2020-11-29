package applicacao;

public class teste {

	public static void main(String[] args) {

		int i = 0;

		do {
			// System.out.println(i);
			
			if (i % 3 == 1) {

				System.out.println(i);

			}else{
				
				System.out.println("nao");
			}
			i += 100;

		}while (i != 10000);

	}
}
