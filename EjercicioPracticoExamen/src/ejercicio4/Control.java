package ejercicio4;

public class Control{
	 
	public void verificar(String telefono) throws TelefonoException {
		 if(telefono.length()!=9) {
			 System.out.println("error debe tener 9 caracteres");
		 }
		 System.out.println("datos validos");
	}
}
