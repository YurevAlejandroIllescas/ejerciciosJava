package POO.febrero13.polimorfismo;

public class Triangulo extends Figura{

	float ladoU, ladoD, ladoT;
	
	public Triangulo(float ladoU, float ladoD, float ladoT) {
		super();
		this.ladoU = ladoU;
		this.ladoD = ladoD;
		this.ladoT = ladoT;
	}

	
	public Triangulo() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public float area() {
		return (base*altura)/2;
	}

	@Override
	public float perimetro() {
		
		return ladoU + ladoD + ladoT;
	}


	public float getLadoU() {
		return ladoU;
	}


	public void setLadoU(float ladoU) {
		this.ladoU = ladoU;
	}


	public float getLadoD() {
		return ladoD;
	}


	public void setLadoD(float ladoD) {
		this.ladoD = ladoD;
	}


	public float getLadoT() {
		return ladoT;
	}


	public void setLadoT(float ladoT) {
		this.ladoT = ladoT;
	}


	@Override
	public String toString() {
		return "Triangulo [ladoU=" + ladoU + ", ladoD=" + ladoD + ", ladoT=" + ladoT + ", altura=" + altura + ", base="
				+ base + "]";
	}

	
	
	
	
	
}
