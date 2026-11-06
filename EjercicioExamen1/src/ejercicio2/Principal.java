package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		Control comprobar = new Control ();
		
		try {
			comprobar.ComprobarEmail("julian@gmail.com");
			System.out.println("email correcto");
			
		}catch(ExcepcionPersonalizada e) {
			System.out.println("datos incorrectos " + e.getMessage());
		}

	}

}
