package faculdade.S4U3;

public class ProgramaLoopSemThread {

    public static void main(String[] args) {

        ProgramaLoopSemThread p = new ProgramaLoopSemThread();

        p.programa();

    }

    public void programa() {

        System.out.println("inicio");

        while (true) {

            if (1 % 2 == 2) break;   //artimanha p/ compilar o c�digo // 1 % 2 == 2 ; d� false
            
            System.out.println("loop infinito");

        }

        System.out.println("passou do primeiro loop");

        for (long i = 0; i < 1000000000000l; i++) {

            System.out.println("loop super pesado");

        }

        System.out.println("passou do segundo loop");

        boolean condicaoLoop = true;

        do {

            System.out.println("loop condi��o complexa");

        } while (condicaoLoop);        

        System.out.println("fim");

    }

} 