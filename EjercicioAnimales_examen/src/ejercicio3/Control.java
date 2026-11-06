package ejercicio3;

public class Control {
	
	
	public void verificar(int edad) throws EdadIncorrectaException {
		
		if(edad<18) {
			throw new EdadIncorrectaException(" incorrecta");
		}
		
		System.out.println("datos correctos");
	}

}
