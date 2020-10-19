package entities;

public class Empregado {


		private String name;
		private Integer horas;
		private Double v_p_hora;
		
public Empregado() {}
		
public Empregado(String name, Integer horas, Double v_p_hora) {
			super();
			this.name = name;
			this.horas = horas;
			this.v_p_hora = v_p_hora;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getHoras() {
			return horas;
		}

		public void setHoras(Integer horas) {
			this.horas = horas;
		}

		public Double getV_p_hora() {
			return v_p_hora;
		}

		public void setV_p_hora(Double v_p_hora) {
			this.v_p_hora = v_p_hora;
		}
		
		
		public double pagamentos () {
			return horas * v_p_hora;
			
		}
		
	}


