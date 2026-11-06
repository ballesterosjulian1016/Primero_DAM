package ejercicio4;

public class Principal {

	public static void main(String[] args) {
	 
		Control codigo= new Control();
		 try {
			 codigo.verificar("123456789");
			 System.out.println("datos correctos");
		
		}catch(TelefonoException e) {
			System.out.println("error " + e.getMessage());
		}

	}

}
