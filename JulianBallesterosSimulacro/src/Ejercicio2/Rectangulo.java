package Ejercicio2;

public class Rectangulo extends Figura2D {
	protected double base;
	protected double altura;
	
	
	public Rectangulo(String nombre, double base, double altura) {
		super(nombre);
		this.base = base;
		this.altura = altura;
	}


	


	@Override
	public double calcularPerimetro() {
		
		return 2*(base+altura);
	}


	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", nombre=" + nombre + "]";
	}
	
	
	

}
