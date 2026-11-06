package ejercicio2;

public class Control {
	public void ComprobarEmail(String email) throws ExcepcionPersonalizada {
		
		if(!email.contains("@")) {
			throw  new ExcepcionPersonalizada("el email debe tener el @");
		}
		System.out.println("email " + email + "email correcto");
	}

}
