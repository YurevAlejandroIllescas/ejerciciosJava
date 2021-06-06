package POO.febrero06;

public class Animal {

	public String sEspecie;
	public char cSexo;
	public String sTamaño;
	public int ePatas;

	public Animal() {

	}

	public Animal(String sEspecie, char cSexo, String sTamaño, int ePatas) {
		super();
		this.sEspecie = sEspecie;
		this.cSexo = cSexo;
		this.sTamaño = sTamaño;
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

	public String getsTamaño() {
		return sTamaño;
	}

	public void setsTamaño(String sTamaño) {
		this.sTamaño = sTamaño;
	}

	public int getePatas() {
		return ePatas;
	}

	public void setePatas(int ePatas) {
		this.ePatas = ePatas;
	}

	@Override
	public String toString() {
		return "Animal [sEspecie=" + sEspecie + ", cSexo=" + cSexo + ", sTamaño=" + sTamaño + ", ePatas=" + ePatas
				+ "]";
	}

}
