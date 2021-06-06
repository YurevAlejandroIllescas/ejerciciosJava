package operaciones;


/**
 * 
 * @author yurev
 *
 */

public class Perimetros {
	
	public float pTriangulo(float a, float b, float c) {
		
		return a + b + c;
	}
	
	public float pRectangulo(float a, float b) {
		float suma;
		
		suma = (a*2) + (b*2);
		
		return suma;
	}
	
	public float pCirculo(float a) {
		float suma;
		
		suma = (float) (3.1416) * a;
		
		return suma;
	}
	
	public float aTriangulo(float a, float b) {
		float area;
		
		area = (a * b)/2;
		
		return area;
	}
	
	public float aRectangulo(float a, float b) {
		float area;
		
		area = b * a;
		
		return area;
	}
	
	public float aCirculo(float a) {
		float area;
		
		area = (float) 3.1416 * (a*a);
		
		return area;		
	}
	
	
}
