package Control;

public class Principal {

	public static void main(String[] args) {
		
			ComprobarCodigo codigo = new ComprobarCodigo();
			
			try {
				codigo.verificar("2804");
				System.out.println("codigo postal correcto: ");
				
				
		} catch (ExcepcionPropia e) {
			System.out.println("codigo postal incorrecto " + e.getMessage());
		}

	}

}
