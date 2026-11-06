package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		Control notas = new Control();
		try {
			
			notas.verificar(8);
			System.out.println(" nota valida");
			
		}catch(NotaInvalidaExceptio e) {
			System.out.println("error " + e.getMessage());
		}
		
		

	}

}
