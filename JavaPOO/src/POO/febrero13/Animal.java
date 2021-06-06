package POO.febrero13;

public class Animal {

	protected String especie, nombre;
	protected float peso, tamanio;
	
	public Animal() {
		
	}

	public Animal(String especie, String nombre, float peso, float tamanio) {
		super();
		this.especie = especie;
		this.nombre = nombre;
		this.peso = peso;
		this.tamanio = tamanio;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getTamanio() {
		return tamanio;
	}

	public void setTamanio(float tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", nombre=" + nombre + ", peso=" + peso + ", tamanio=" + tamanio + "]";
	}
	
	
}
