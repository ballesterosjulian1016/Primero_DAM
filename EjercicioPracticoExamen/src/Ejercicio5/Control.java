package Ejercicio5;

public class Control {
	
	public void verificar(String nombre)throws nombreException {
		
		if(nombre==null || nombre.isEmpty()) {
			throw new nombreException("datos incorrectos ");
		}
		System.out.println("datos validos puede continuar");
	}

}
