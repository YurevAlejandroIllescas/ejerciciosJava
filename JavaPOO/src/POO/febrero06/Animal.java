package POO.febrero06;

public class Animal {

	public String sEspecie;
	public char cSexo;
	public String sTama�o;
	public int ePatas;

	public Animal() {

	}

	public Animal(String sEspecie, char cSexo, String sTama�o, int ePatas) {
		super();
		this.sEspecie = sEspecie;
		this.cSexo = cSexo;
		this.sTama�o = sTama�o;
		this.ePatas = ePatas;
	}

	public Animal(String sEspecie, int ePatas) {
		super();
		this.sEspecie = sEspecie;
		this.ePatas = ePatas;
	}

	public void dormir() {
		System.out.println("EL " + getsEspecie() + " ESTA DORMIDO NO HAGAN RUIDO");
	}

	public void comer() {
		System.out.println("EL " + getsEspecie() + " ESTA COMIENDO");
	}

	public void caminar() {

		if (getePatas() > 0) {

			System.out.println("EL " + getsEspecie() + " CAMINA CON: " + getePatas() + " PATAS");

		} else {

			System.out.println("EL " + getsEspecie() + " NO CAMINA, EL NADA");
		}
	}

	public String getsEspecie() {
		return sEspecie;
	}

	public void setsEspecie(String sEspecie) {
		this.sEspecie = sEspecie;
	}

	public char getcSexo() {
		return cSexo;
	}

	public void setcSexo(char cSexo) {
		this.cSexo = cSexo;
	}

	public String getsTama�o() {
		return sTama�o;
	}

	public void setsTama�o(String sTama�o) {
		this.sTama�o = sTama�o;
	}

	public int getePatas() {
		return ePatas;
	}

	public void setePatas(int ePatas) {
		this.ePatas = ePatas;
	}

	@Override
	public String toString() {
		return "Animal [sEspecie=" + sEspecie + ", cSexo=" + cSexo + ", sTama�o=" + sTama�o + ", ePatas=" + ePatas
				+ "]";
	}

}
