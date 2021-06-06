package POO.febrero13.polimorfismo;

public class Rectangulo extends Figura{

	private String tipoRectangulo;
	
	public Rectangulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangulo(String tipoRectangulo) {
		super();
		this.tipoRectangulo = tipoRectangulo;
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return base * altura;
	}

	@Override
	public float perimetro() {
		
		return base * altura;
	}

	public String getTipoRectangulo() {
		return tipoRectangulo;
	}

	public void setTipoRectangulo(String tipoRectangulo) {
		this.tipoRectangulo = tipoRectangulo;
	}

	@Override
	public String toString() {
		return "Rectangulo [tipoRectangulo=" + tipoRectangulo + ", altura=" + altura + ", base=" + base + "]";
	}
	
	
	

}
