package POO.febrero13;

public class Cerdo extends Omnivoro {

	private String raza;
	

	public Cerdo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cerdo(String especie, String nombre, float peso, float tamanio, String tipoPlanta, Long cantCarne, String raza) {
		super(especie, nombre, peso, tamanio, tipoPlanta, cantCarne);
		this.raza = raza;
		// TODO Auto-generated constructor stub
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Cerdo [raza=" + raza + ", tipoPlanta=" + tipoPlanta + ", cantCarne=" + cantCarne + ", especie="
				+ especie + ", nombre=" + nombre + ", peso=" + peso + ", tamanio=" + tamanio + "]";
	}	
	
	
	
}
