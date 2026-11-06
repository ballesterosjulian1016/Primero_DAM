package ejercicio1;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		 try{
			 ArrayList<Maquina> listaMaquinas = new ArrayList<>();
				
				listaMaquinas.add(new MaquinaCardio("1","bicicleta",45,20,6));
				listaMaquinas.add(new MaquinaPeso("1"," banca",45,20,6));
				
				for(Maquina m : listaMaquinas) {
					m.mostrarInformacion();
					System.out.println();
				}
			
		}catch(MaquinaInvalidaException e) {
			System.out.println("error al ingresar los datos " + e.getMessage());
		}
		

	}

}
