package POO.febrero13;

public class Leon extends Carnivoro{
	
	private String sRaza;

	public Leon() {
		// TODO Auto-generated constructor stub
	}
	
	public Leon(String especie, String nombre, float peso, float tamanio, Long cantCarne, String raza) {
		super(especie, nombre, peso, tamanio, cantCarne);
		this.sRaza = raza;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Leon [cantCarne=" + cantCarne + ", especie=" + especie + ", nombre=" + nombre + ", peso=" + peso
				+ ", tamanio=" + tamanio + "]";
	}

	public String getsRaza() {
		return sRaza;
	}

	public void setsRaza(String sRaza) {
		this.sRaza = sRaza;
	}
	
			
}
