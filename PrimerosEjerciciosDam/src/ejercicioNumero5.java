import java.util.Scanner;

public class ejercicioNumero5 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("dime un número para saber si es par o impar");
		a=sc.nextInt();
		
		if(a % 2==0) {
			System.out.println("el numero es par");
		}
		else {
			System.out.println("el numero es impar");
		}

	}

}
