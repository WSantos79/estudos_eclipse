package Faculdade;



import java.util.Scanner;

public class del {

	public static void main(String[] args) {
		// vari�veis
		float altura, peso_ideal;
		String sexo;
		Scanner teclado = new Scanner(System.in);
		
		// Entrada
		System.out.println("Informe sua altura: ");
		altura = Float.parseFloat(teclado.nextLine());

		System.out.println("Informe o sexo m/f: ");
		sexo = teclado.nextLine();
		sexo = sexo.toUpperCase();
		sexo = sexo.substring(0, 1);

		// Processamento
		// if(sexo.toUpperCase().equals("M")) {
		if (sexo.equals("M")) {
			peso_ideal = (float) (72.7 * altura) - 58;// cast
			System.out.printf("Seu peso ideal � %.2f", peso_ideal);
			// }else if(sexo.toUpperCase().equals("F")) {
		} else if (sexo.equals("F")) {
			peso_ideal = (float) (62.1 * altura) - (float) 44.7;
			System.out.printf("Seu peso ideal � %.2f", peso_ideal);
		} else  {
			// }else if(sexo != "M" && sexo != "F") {
			System.out.println("Sexo n�o reconhecido.");
			peso_ideal = 0;
		}

		teclado.close();
	}

}