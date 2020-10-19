package Faculdade;

public class Sobrecarga {

    static int mult(int a, int b){

        return a * b;

    }

    static double mult(double a, double b){

        return a * b;

    }

    static double mult(double a, double b, double c){

        return a * b * c;

    }

    public static void main(String[] args) {

       System.out.println("Mult: " + Sobrecarga.mult(5, 3));

       System.out.println("Mult: " + Sobrecarga.mult(3.2, 4.1));

       System.out.println("Mult: " + Sobrecarga.mult(1.4, 2));

       System.out.println("Mult: " + Sobrecarga.mult(2, 3.5));

       System.out.println("Mult: " + Sobrecarga.mult(4.5, 5.2, 2));

    }

} 