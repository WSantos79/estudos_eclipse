package entities;

public class Tercerizado extends Empregado {

	private Double cargaADD;

	public Tercerizado() {
		super ();
	}
	
public Tercerizado(String name, Integer horas, Double v_p_hora, Double cargaADD) {
		super(name, horas, v_p_hora);
		this.cargaADD = cargaADD;
	}

	public Double getCargaADD() {
		return cargaADD;
	}

	public void setCargaADD(Double cargaADD) {
		this.cargaADD = cargaADD;
	}

	
	@Override
	
	public double pagamentos () {
		return super.pagamentos() + cargaADD * 1.1 ;
		
	}
	
	
}
