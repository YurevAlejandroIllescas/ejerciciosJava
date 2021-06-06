package POO.febrero13.polimorfismo;

public abstract class Figura {
	
	protected float altura, base;
	
	abstract public float area();
	abstract public float perimetro();
	
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Figura [altura=" + altura + ", base=" + base + "]";
	}
	
	
	
}
