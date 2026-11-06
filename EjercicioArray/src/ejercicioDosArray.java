import java.util.Scanner;

public class ejercicioDosArray {

	public static void main(String[] args) {
		
		int personas = 0, alturasTotales = 0, superior=0, inferior=0;
		double mediaAlturas;
		boolean correcto = false;
		Scanner sc= new Scanner(System.in);
		int alturas [];
		while(!correcto) {
			System.out.println(" dime el numero de personas:");
			personas= sc.nextInt();
			if (personas<=0) System.out.println("valor incorrecto");
			else correcto = true;
			
		}
		alturas = new int [personas];
		
		// bucle para guardar las alturas
		
		for(int i=0;i<alturas.length;i++) {
			System.out.print("dime la altura:");
			alturas[i]= sc.nextInt();
		}
		// bucle para calcular la media
		for ( int i=0; i<alturas.length;i++) {
			alturasTotales+=alturas[i];
		}
		mediaAlturas=alturasTotales/alturas.length;
		
		// bucle para contar superior e inferior
		for ( int i=0; i<alturas.length;i++) {
			if (alturas[i]>mediaAlturas)superior++;
			if (alturas[i]<mediaAlturas)inferior++;
		}
		System.out.println("la altura media es "+mediaAlturas);
		System.out.println("las personas superiores "+superior);
		System.out.println("las personas inferiores "+inferior);
	}

}
