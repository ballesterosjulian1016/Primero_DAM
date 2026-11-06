package ejercicio2;

public class Control {
	
	public void verificar(String matricula) throws MatriculaIncorrectaException {
		
		if(matricula == null || matricula.isEmpty () ) {
		throw new MatriculaIncorrectaException("la matricula no puede estar vacia");
		}
		if( matricula.length()!=7) {
			throw new MatriculaIncorrectaException("la matricula debe tener 7 digitos");
		}
		
		System.out.println("datos validos");
	}
	

}
