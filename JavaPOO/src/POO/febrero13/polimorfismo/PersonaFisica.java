package POO.febrero13.polimorfismo;

public class PersonaFisica extends Persona{

	private String estadoCivil, nacionalidad;
	
	
	
	public PersonaFisica() {
		super();
	}

	public PersonaFisica(String estadoCivil, String nacionalidad) {
		super();
		this.estadoCivil = estadoCivil;
		this.nacionalidad = nacionalidad;
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Come fisicamente");
	}

	@Override
	public void dormir() {
		System.out.println("Duerme fisicamente");

	}

	@Override
	public String toString() {
		return "PersonaFisica [estadoCivil=" + estadoCivil + ", nacionalidad=" + nacionalidad + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", genero="
				+ genero + "]";
	}

	
	

	
}
