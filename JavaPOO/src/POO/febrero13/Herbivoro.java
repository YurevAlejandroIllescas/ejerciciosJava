package POO.febrero13;

public class Herbivoro extends Animal {

	protected String tipoPlanta;
	
	public Herbivoro() {
		// TODO Auto-generated constructor stub
	}
	
	public Herbivoro(String tipoPlanta) {
		super();
		this.tipoPlanta = tipoPlanta;
	}

	public Herbivoro(String especie, String nombre, float peso, float tamanio, String tipoPlanta) {
		super(especie, nombre, peso, tamanio);
		this.tipoPlanta = tipoPlanta;
	}

	public String getTipoPlanta() {
		return tipoPlanta;
	}

	public void setTipoPlanta(String tipoPlanta) {
		this.tipoPlanta = tipoPlanta;
	}

	@Override
	public String toString() {
		return "Herbivoro [tipoPlanta=" + tipoPlanta + ", especie=" + especie + ", nombre=" + nombre + ", peso=" + peso
				+ ", tamanio=" + tamanio + "]";
	}
	
	
	
	
}
