package Ejercicio2;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		ArrayList<Figura2D>lista =new ArrayList<>();
		
		lista.add(new Circulo("circulo",12.5));
		lista.add(new Rectangulo("rectangulo", 5,6));
		lista.add(new Triangulo("triangulo",5,9,7));
		
		for(Figura2D f: lista) {
			System.out.println(f.toString());
			System.out.println("perimetro: " + f.calcularPerimetro());
		}

	}

}
