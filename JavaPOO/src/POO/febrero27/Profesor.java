package POO.febrero27;

public class Profesor extends Mago {
	
	private String materia;
	private int experiencia;
	private boolean hechizo;
	
	public Profesor(String materia, int experiencia, boolean hechizo) {
		super();
		this.materia = materia;
		this.experiencia = experiencia;
		this.hechizo = hechizo;
	}

	public Profesor() {
	
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public boolean isHechizo() {
		return hechizo;
	}

	public void setHechizo(boolean hechizo) {
		this.hechizo = hechizo;
	}

	@Override
	public String toString() {
		return "Profesor [materia=" + materia + ", experiencia=" + experiencia + ", hechizo=" + hechizo
				+ ", tipoVarita=" + tipoVarita + ", casa=" + casa + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	
	
	
	
	
	

}
