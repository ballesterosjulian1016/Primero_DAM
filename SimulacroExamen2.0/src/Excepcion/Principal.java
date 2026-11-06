package Excepcion;

public class Principal {

	public static void main(String[] args) {
		 ComprobarCodigo codigo = new ComprobarCodigo();
		 try {
			 codigo.verificar("28044");
			 System.out.println("codigo postal correcto");
			 
			 
		 }catch(ExcepcionPropia e) {
			 System.out.println("error al ingresar el codigo postal " + e.getMessage());
		 }

	}

}
