package POO.febrero06;

import java.awt.Color;

public class Persona {

	private int eEdad;
	private String sNombre;
	private double peso, estatura;
	private String sColor;
	private Color color1;
	private String sNacionalida;
	
	
	
	public Persona() {
		//super();
	}
	
	public Persona(int eEdad, String sNombre, double peso, double estatura, String sColor, Color color1, String sNacionalida) {
		super();
		this.eEdad = eEdad;
		this.sNombre = sNombre;
		this.peso = peso;
		this.estatura = estatura;
		this.sColor = sColor;
		this.color1 = color1;
		this.sNacionalida = sNacionalida;
	}

	
	public boolean dormir(boolean a) {
		
		if(a) {
			System.out.println("Esta dormido");
		} else {
			
			System.out.println("No estoy dormido");
		}
		
		return false;
	}
	
	public boolean respirar(boolean a) {
		
		if (a) {
			System.out.println("Respirando");
		} else {
			System.out.println("Muriendo");
		}
		return a;
	}
	

	@Override
	public String toString() {
		return "Persona [eEdad=" + eEdad + ", sNombre=" + sNombre + ", peso=" + peso + ", estatura=" + estatura
				+ ", sColor=" + sColor + ", color1=" + color1 + ", sNacionalida=" + sNacionalida + "]";
	}

	public int geteEdad() {
		return eEdad;
	}
	public void seteEdad(int eEdad) {
		this.eEdad = eEdad;
	}
	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public String getsColor() {
		return sColor;
	}
	public void setsColor(String sColor) {
		this.sColor = sColor;
	}
	public Color getColor1() {
		return color1;
	}
	public void setColor1(Color color1) {
		this.color1 = color1;
	}
	public String getsNacionalida() {
		return sNacionalida;
	}
	public void setsNacionalida(String sNacionalida) {
		this.sNacionalida = sNacionalida;
	}
	
	
}
