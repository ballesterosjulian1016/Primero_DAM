package ejercicio3;

public class Control {
	
	public void verificar(int nota)throws NotaInvalidaExceptio {
		if(nota < 0 || nota > 10) {
			throw new NotaInvalidaExceptio("nota invalida");
			
		}
		System.out.println("resultado " + nota + " nota correcta");
		
		
		
	}

}
