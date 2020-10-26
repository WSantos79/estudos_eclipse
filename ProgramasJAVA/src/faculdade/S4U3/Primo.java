package faculdade.S4U3;

public class Primo implements Runnable { /// ou public class Primo extends Thread

    private final int inicio;

    private final int fim;

    public Primo(int inicio, int fim) {

        this.inicio = inicio;

        this.fim = fim;

    }

    public boolean isPrime(int n) {

        if (n < 2) {

            return false;

        }

        for (int i = 2; i < (int)(Math.sqrt(n) + 1); i++) {

            if (n % i == 0) {

                return false;

            }

        }

        return true;

    }

    @Override

    public void run() {

        for (int i = inicio; i < fim; i++) {

            boolean ehPrimo = isPrime(i);

            if (ehPrimo) {

                System.out.println("� primo: " + i);
                Thread thFluxo = Thread.currentThread();

                System.out.printf("Nome Thread: %s%n", thFluxo.getName());
            }

        }

    }

}