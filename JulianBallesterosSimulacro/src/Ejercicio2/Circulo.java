package Ejercicio2;

public class Circulo extends Figura2D {
	 protected double radio;

	 public Circulo(String nombre, double radio) {
		super(nombre);
		this.radio = radio;
	 }



	 @Override
	 public double calcularPerimetro() {
		
		return 2 * Math.PI * radio;
	 }

	 @Override
	 public String toString() {
		return "Circulo [radio=" + radio + ", nombre=" + nombre + "]";
	 }
	 
	 
	 
	 
}
