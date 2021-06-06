package POO.febrero06;

/**
 * 
 * @author yurev
 * 
 */

public class Calculadora {

	private float eNum1, eNum2;

	public Calculadora() {
		super();
	}

	public void setNum1(float num) {
		this.eNum1 = num;
	}

	public void setNum2(float num) {
		this.eNum2 = num;
	}

	public float getNum1() {
		return eNum1;
	}

	public float getNum2() {
		return eNum2;
	}

	public float Sumar() {
		float sumar;

		sumar = eNum1 + eNum2;

		return sumar;

	}

	public float Restar() {
		float restar;

		restar = eNum1 - eNum2;

		return restar;
	}

	public float Multiplicar() {
		float multiplicar;

		multiplicar = eNum1 * eNum2;

		return multiplicar;
	}

	public float Dividir() {
		float fDiv;

		if (eNum2 != 0) {

			fDiv = eNum1 / eNum2;
		} else {

			fDiv = -1;
		}

		return fDiv;
	}

}
