package POO.febrero13;

public class Carnivoro extends Animal{

	protected Long cantCarne;

	public Carnivoro() {
		// TODO Auto-generated constructor stub
	}
	
	public Carnivoro(Long cantCarne) {
		super();
		this.cantCarne = cantCarne;
		// TODO Auto-generated constructor stub
	}

	public Carnivoro(String especie, String nombre, float peso, float tamanio, Long cantCarne) {
		super(especie, nombre, peso, tamanio);
		this.cantCarne = cantCarne;
		// TODO Auto-generated constructor stub
	}

	public Long getCantCarne() {
		return cantCarne;
	}

	public void setCantCarne(Long cantCarne) {
		this.cantCarne = cantCarne;
	}

	@Override
	public String toString() {
		return "Carnivoro [cantCarne=" + cantCarne + ", especie=" + especie + ", nombre=" + nombre + ", peso=" + peso
				+ ", tamanio=" + tamanio + "]";
	}
	
	
	
	
}
