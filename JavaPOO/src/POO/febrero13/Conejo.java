package POO.febrero13;

public class Conejo extends Herbivoro{
	
	
	private String sRaza;
	
	public Conejo() {
		// TODO Auto-generated constructor stub
	}
	
	public Conejo(String especie, String nombre, float peso, float tamanio, String tipoPlanta, String sRaza) {
		super(especie, nombre, peso, tamanio, tipoPlanta);
		this.sRaza = sRaza;
		// TODO Auto-generated constructor stub
	}

	public Conejo(String tipoPlanta) {
		super(tipoPlanta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Conejo [tipoPlanta=" + tipoPlanta + ", especie=" + especie + ", nombre=" + nombre + ", peso=" + peso
				+ ", tamanio=" + tamanio + "]";
	}

	public String getsRaza() {
		return sRaza;
	}

	public void setsRaza(String sRaza) {
		this.sRaza = sRaza;
	}

	
}
