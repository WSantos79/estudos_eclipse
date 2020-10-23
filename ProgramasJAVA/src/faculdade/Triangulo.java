package faculdade;

public class Triangulo {

	double ladoA;
	double ladoB;
	double ladoC;

	public Triangulo(double lado) {
		this.ladoA = lado;
		this.ladoB = lado;
		this.ladoC = lado;
	}

	public Triangulo(double ladoA, double ladoB, double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	
    @Override

    public String toString() {

        return String.format("a: %.2f\nb: %.2f\nc: %.2f", 

                      this.ladoA, this.ladoB, this.ladoC);

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangulo trianIsosceles = new Triangulo(5);

		Triangulo trianEscaleno = new Triangulo(3, 25, 26);

		System.out.println(trianIsosceles);

		System.out.println(trianEscaleno);

	}

}
