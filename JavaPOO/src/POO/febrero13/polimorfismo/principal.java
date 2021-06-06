package POO.febrero13.polimorfismo;

public class principal {

	public static void main(String[] args) {
		PersonaFisica perFi = new PersonaFisica();
		PersonaMoral perMoral = new PersonaMoral();
		
		perFi.setNombre("Yurev");
		
		System.out.println(perFi);
		System.out.println();
		System.out.println(perMoral);
		
		
	}
}
