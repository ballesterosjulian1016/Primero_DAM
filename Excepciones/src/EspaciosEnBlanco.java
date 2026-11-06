import java.util.Scanner;

public class EspaciosEnBlanco {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String texto = "";
		boolean valido = false;
		ValidadorDatos validador = new ValidadorDatos();
		
		while(!valido) {
			try {
				System.out.println("ingrese un texto");
				texto = sc.nextLine();
				
				validador.ValidarTexto(texto);
				valido = true;
				System.out.println("texto ingresado saliendo del programa");
				
			}catch(TextoInvalido e) {
				System.out.println(e.getMessage());
				
			}
			
			
			
		}

	}

}
			