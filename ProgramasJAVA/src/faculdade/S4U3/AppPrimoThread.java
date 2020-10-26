package faculdade.S4U3;

public class AppPrimoThread {

    public static void main(String[] args) {

        Thread thr1 = new Thread(new Primo(0, 1000000));
        
        thr1.start();
        
        Thread thr2 = new Thread(new Primo(1000001, 2000000));

        thr2.start();

        Thread thr3 = new Thread(new Primo(2000001, 3000000));

        thr3.start();

        Thread thr4 = new Thread(new Primo(3000001, 4000000));

        thr4.start();
        
        Thread thr5 = new Thread(new Primo(4000001, 5000000));

        thr5.start();
        
        Thread thr6 = new Thread(new Primo(5000001, 6000000));

        thr6.start();
        
        Thread thr7 = new Thread(new Primo(6000001, 7000000));

        thr7.start();
        
        Thread thr8 = new Thread(new Primo(7000001, 8000000));

        thr8.start();

    }

} 