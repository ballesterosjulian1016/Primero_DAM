import java.util.Scanner;

public class ejercicioNumero6 {

	public static void main(String[] args) {
		
		double nota;
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero entre 0 & 10:");
		nota=sc.nextDouble();
		
		if (nota>=0 && nota<=4) {
			System.out.println("insuficiente");
		}
		else if (nota==5) {
			System.out.println("suficiente");
		}
		else if (nota==6) {
			System.out.println("bien");
		}
		else if (nota>=7 && nota<=8) {
			System.out.println("notable");
		}
		else if (nota==9) {
			System.out.println("sobresaliente");
		}
		else if (nota==10) {
			System.out.println("matricula de honor");
		}
		}
		
			
		}

	


