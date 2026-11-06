package Ejercicio2;

public class Triangulo extends Figura2D {
	protected double lado1,lado2,lado3;

	public Triangulo(String nombre, double lado1, double lado2, double lado3) {
		super(nombre);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	
	@Override
	public double calcularPerimetro() {
		
		return lado1+lado2+lado3;
	}

	@Override
	public String toString() {
		return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", nombre=" + nombre + "]";
	}
	
	
	

}
