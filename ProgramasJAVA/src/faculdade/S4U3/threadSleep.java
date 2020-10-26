package faculdade.S4U3;

public class threadSleep {

	public static void main(String[] args) {
		System.out.println("inicio");

		try {

		    System.out.println("inicio sleep");

		    Thread.sleep(5000); //valor em milissegundos

		    System.out.println("fim sleep");

		} catch (InterruptedException ex) {

		    System.out.println(ex);

		}

		System.out.println("fim");
	}

}
