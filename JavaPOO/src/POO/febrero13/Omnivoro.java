package POO.febrero13;

public class Omnivoro extends Animal{

	protected String tipoPlanta;
	protected Long cantCarne;
	
	public Omnivoro() {
		
	}
	
	public Omnivoro(String especie, String nombre, float peso, float tamanio, String tipoPlanta, Long cantCarne) {
		super(especie, nombre, peso, tamanio);
		this.tipoPlanta = tipoPlanta;
		this.cantCarne = cantCarne;
	}

	
	
	public String getTipoPlanta() {
		return tipoPlanta;
	}

	public void setTipoPlanta(String tipoPlanta) {
		this.tipoPlanta = tipoPlanta;
	}

	public Long getCantCarne() {
		return cantCarne;
	}

	public void setCantCarne(Long cantCarne) {
		this.cantCarne = cantCarne;
	}
	

	@Override
	public String toString() {
		return "Omnivoro [tipoPlanta=" + tipoPlanta + ", cantCarne=" + cantCarne + ", especie=" + especie + ", nombre="
				+ nombre + ", peso=" + peso + ", tamanio=" + tamanio + "]";
	}
		
	
}
