package ejercicio2;

public class Control {
	
	public void verficiar(String telefono)throws TelefonoInvalidoException {
		if(telefono == null || telefono.length()!=9){
			throw new TelefonoInvalidoException("dato incorrecto debe ser 9 digitos ");
		}
		System.out.println("tel: " + telefono + " validacion correcta");
	}
	
}
