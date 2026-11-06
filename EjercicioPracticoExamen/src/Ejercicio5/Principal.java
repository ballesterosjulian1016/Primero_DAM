package Ejercicio5;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Control codigo = new Control();
			
			try {
				codigo.verificar("amor");
				System.out.println("hasta pronto");
				
				
			}catch(nombreException e) {
				System.out.println("el nombre no es correcto " + e.getMessage());
			}
				
			
				
			}
	}


