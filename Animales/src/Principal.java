import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Animal> listaAnimales= new ArrayList<>();
		listaAnimales.add(new Perro("leo","hola","lora"));
		listaAnimales.add(new Leon("leo","hola","lora"));
		
		for(Animal a: listaAnimales) {
			a.mostrarInfomracion();
			System.out.println();
	
			
		}
		

	}

}
