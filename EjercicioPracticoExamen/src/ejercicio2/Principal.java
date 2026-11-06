package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		Control tele = new Control();
		
		try {
			tele.verficiar("123456789");
			System.out.println("telefono correcto");
			
		}catch(TelefonoInvalidoException e){
			System.out.println("dato incorrecto " + e.getMessage());
			
		}

	}

}
