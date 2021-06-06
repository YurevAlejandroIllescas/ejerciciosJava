package POO.Trabajador;

public class Trabajador {
	
	private String nombre;
	private String departamento;
	private float sueldo;
	private float sueldoM;
	private float diasT;
	private float horasE;
	private float salarioT;
	
	
	
	public Trabajador() {
		super();
	}
	
	public Trabajador(String nombre, String departamento, float sueldo, float sueldoM, float diasT, float horasE,
			float salarioT) {
		super();
		this.nombre = nombre;
		this.departamento = departamento;
		this.sueldo = sueldo;
		this.sueldoM = sueldoM;
		this.diasT = diasT;
		this.horasE = horasE;
		this.salarioT = salarioT;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public float getSueldoM() {
		return sueldoM;
	}
	public void setSueldoM(float sueldoM) {
		this.sueldoM = sueldoM;
	}
	public float getDiasT() {
		return diasT;
	}
	public void setDiasT(float diasT) {
		this.diasT = diasT;
	}
	public float getHorasE() {
		return horasE;
	}
	public void setHorasE(float horasE) {
		this.horasE = horasE;
	}
	public float getSalarioT() {
		return salarioT;
	}
	public void setSalarioT(float salarioT) {
		this.salarioT = salarioT;
	}

	@Override
	public String toString() {
		return "\tTrabajador" + "\nNombre = " + nombre + "\nDepartamento = " + departamento + "\nSueldo = " + sueldo
				+ "\nSueldo Mensual = " + sueldoM + "\nDias Trabajados = " + diasT + "\nHoras Extra = " + horasE + "\n Salario Total = " + salarioT + "\n";
	}
	
	
}
