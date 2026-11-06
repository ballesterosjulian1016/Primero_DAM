import java.util.Scanner;

public class ArrayUnidimensional {

	public static void main(String[] args) {
		
	
		//variables
		final int COLUMNAS=10;
		int positivo=0, negativo=0, cero=0;
		Scanner sc = new Scanner(System.in);
		int[] arrayNUMEROS = new int[COLUMNAS];
			
		// bucle para guardar los numeros
		for (int i=0; i<arrayNUMEROS.length;i++) {
			System.out.println("dime el numero a guardar:");
			arrayNUMEROS[i]= sc.nextInt();
			
		}
		
		for (int i=0; i<arrayNUMEROS.length; i++) {
			if (arrayNUMEROS[i]>0) positivo++;
			else if (arrayNUMEROS[i]==0) cero++;
			else  negativo++;
		}
		
		System.out.println("cantidad de numeros positivos:"+ positivo);
		System.out.println("cantidad de numeros negativos:"+ negativo);
		System.out.println("cantidad de numeros cero:"+ cero);
		
		
		

	}

}
