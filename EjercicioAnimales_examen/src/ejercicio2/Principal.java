package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		Control codigo = new Control();
		
		try {
			codigo.verificar("kzk9430");
			System.out.println("matricula correcta");
			
			
		}catch(MatriculaIncorrectaException e) {
			System.out.println("error " + e.getMessage());
		}
	}

}
