import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
	try {	
	ArrayList<Barco> listaBarcos = new ArrayList<>();

	
		listaBarcos.add (new BarcoPasajero(1,300,"raul",5,2));
		listaBarcos.add (new BarcoCarga(2,-200,"jose",8,3));
		
	
		for (Barco b : listaBarcos) {
			b.mostrarInformacion();
			System.out.println();
		}
	} catch(BarcoInvalidoException e) {
		System.out.println("error al ingresar los datos " + e.getMessage());
	}
		
	}

}
