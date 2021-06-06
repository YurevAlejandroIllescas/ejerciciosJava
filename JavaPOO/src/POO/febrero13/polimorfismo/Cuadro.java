package POO.febrero13.polimorfismo;

public class Cuadro extends Figura{
	
	private String tipoCuadro;
	
	
	public Cuadro() {
		super();
	}
	
	

	public Cuadro(String tipoCuadro) {
		super();
		this.tipoCuadro = tipoCuadro;
	}



	@Override
	public float area() {
		
		return base * altura;
	}

	@Override
	public float perimetro() {
		
		return base * altura;
	}



	public String getTipoCuadro() {
		return tipoCuadro;
	}



	public void setTipoCuadro(String tipoCuadro) {
		this.tipoCuadro = tipoCuadro;
	}



	@Override
	public String toString() {
		return "Cuadro [tipoCuadro=" + tipoCuadro + ", altura=" + altura + ", base=" + base + "]";
	}
	
	
	

}
