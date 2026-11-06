package ejercicio1;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Animal> listaAnimal = new ArrayList<>();
		
		try {
			listaAnimal.add(new Mamiferos(1,8,"foca",5));
			listaAnimal.add(new Ave(6,-1,"pajaro",5,2));
			
			for(Animal a: listaAnimal) {
				a.mostrarInformacion();
				System.out.println();
			}
		}catch(AnimalInvalidoException e) {
			System.out.println("datos incorrectos " + e.getMessage());
		}

	}

}
