package POO.febrero13.polimorfismo;

public class PersonaMoral extends Persona{

	private int numPersonas;
	private boolean lucro;
	
	
	public PersonaMoral() {
		super();
	}
	

	public PersonaMoral(int numPersonas, boolean lucro) {
		super();
		this.numPersonas = numPersonas;
		this.lucro = lucro;
	}


	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Come moralmente");
	}

	@Override
	public void dormir() {
		
		System.out.println("Duerme moralmete");
		// TODO Auto-generated method stub
		
	}


	public int getNumPersonas() {
		return numPersonas;
	}


	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}


	public boolean isLucro() {
		return lucro;
	}


	public void setLucro(boolean lucro) {
		this.lucro = lucro;
	}


	@Override
	public String toString() {
		return "PersonaMoral [numPersonas=" + numPersonas + ", lucro=" + lucro + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", genero=" + genero + "]";
	}
	
	
	
	
}
