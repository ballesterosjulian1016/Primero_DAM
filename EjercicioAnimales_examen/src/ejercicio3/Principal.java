package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		
		Control codigo = new Control();
		
		try {
			codigo.verificar(8);
			System.out.println("edad correcta");
			
			
		}catch(EdadIncorrectaException e) {
			System.out.println("edad : " + e.getMessage());
		}
	}

}
