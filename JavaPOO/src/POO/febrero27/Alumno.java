package POO.febrero27;

public class Alumno extends Mago{
	
	private String mascota;
	private float promedio;
	private boolean jugador;
	
	public Alumno(String mascota, float promedio, boolean jugador) {
		super();
		this.mascota = mascota;
		this.promedio = promedio;
		this.jugador = jugador;
	}

	public Alumno() {
		
	}

	public String getMascota() {
		return mascota;
	}

	public void setMascota(String mascota) {
		this.mascota = mascota;
	}

	public float getPromedio() {
		return promedio;
	}

	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}

	public boolean isJugador() {
		return jugador;
	}

	public void setJugador(boolean jugador) {
		this.jugador = jugador;
	}

	@Override
	public String toString() {
		return "Alumno [mascota=" + mascota + ", promedio=" + promedio + ", jugador=" + jugador + ", tipoVarita="
				+ tipoVarita + ", casa=" + casa + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
}
