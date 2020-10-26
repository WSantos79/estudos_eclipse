package faculdade.S4U3;

public class thread {

    public static void main(String[] args) {

        Thread thFluxo = Thread.currentThread();

        System.out.printf("Nome Thread: %s%n", thFluxo.getName()); // imprime "main"

    }

} 