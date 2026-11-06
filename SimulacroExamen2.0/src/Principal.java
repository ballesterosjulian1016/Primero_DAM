import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		try {
			ArrayList <Barco> ListaBarcos = new ArrayList<>();
			
			ListaBarcos.add(new BarcoPasajeros(1,200,"jose",15,2));
			ListaBarcos.add(new BarcoCarga(5,-500,"julian",15,3));
			
			for(Barco b: ListaBarcos) {
				b.MostrarInformacion();
				System.out.println();
			}
			
			
		}catch(BarcoInvalidoException e ) {
			System.out.println("error al ingresar los datos " + e.getMessage());
			
		}
		
		
		

	}

}
