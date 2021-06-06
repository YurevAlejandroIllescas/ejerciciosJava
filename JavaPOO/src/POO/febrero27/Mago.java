package POO.febrero27;

public class Mago {
	
	protected String tipoVarita;
	protected String casa;
	protected String nombre;
	protected int edad;
	
	
	public Mago() {
		
	}


	public Mago(String tipoVarita, String casa, String nombre, int edad) {
		this.tipoVarita = tipoVarita;
		this.casa = casa;
		this.nombre = nombre;
		this.edad = edad;
	}


	public String getTipoVarita() {
		return tipoVarita;
	}


	public void setTipoVarita(String tipoVarita) {
		this.tipoVarita = tipoVarita;
	}


	public String getCasa() {
		return casa;
	}


	public void setCasa(String casa) {
		this.casa = casa;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	

}
