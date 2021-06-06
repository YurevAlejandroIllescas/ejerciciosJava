package POO.febrero13;

public class Hiena extends Carnivoro{
	
	private int numMotes;
	
	public Hiena() {
		// TODO Auto-generated constructor stub
	}
	
	public Hiena(Long cantCarne) {
		super(cantCarne);
		// TODO Auto-generated constructor stub
	}

	public Hiena(String especie, String nombre, float peso, float tamanio, Long cantCarne, int motes) {
		super(especie, nombre, peso, tamanio, cantCarne);
		this.numMotes = motes;
		// TODO Auto-generated constructor stub
	}

	public int getNumMotes() {
		return numMotes;
	}

	public void setNumMotes(int numMotes) {
		this.numMotes = numMotes;
	}

	@Override
	public String toString() {
		return "Hiena [numMotes=" + numMotes + ", cantCarne=" + cantCarne + ", especie=" + especie + ", nombre="
				+ nombre + ", peso=" + peso + ", tamanio=" + tamanio + "]";
	}
	
	
	
}
