package ejercicio1;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		
		try {
			ArrayList<Vehiculo> listavehiculos = new ArrayList<>();
			
			listavehiculos.add(new Autobus(-5,6,"nissan",8,2));
			listavehiculos.add(new Camion(5,7,"toyota",8,2));
			
			for(Vehiculo v: listavehiculos) {
				v.mostrarInformacion();
				System.out.println();
			}
			
			
			
		}catch(VehiculoInvalidoException e) {
			System.out.println("error datos invalidos" + e.getMessage());
			
		}

	}

}
