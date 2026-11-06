import java.util.Scanner;

public class ejercicioNumero4 {

	public static void main(String[] args) {
	
		int a, b, c;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "dime el primer numero: ");
		a=sc.nextInt();
		System.out.println( "dime el segundo numero:");
		b=sc.nextInt();
		System.out.println( " dime el tercer numero:");
		c=sc.nextInt();
		
		
		if(a>=b && a>=c) {
			 System.out.println("el mayor es:"+ a);
			
		 }
		else if (b>=a && b>=c) {
			System.out.println("el mayor es:"+ b);
		}
		else {
			System.out.println("el mayor es:"+ c);
			
		}
		if (a<=b && a<=c) {
			System.out.println("el menor es:"+ a);
		}
		else if (b<=a && b<=c) {
			System.out.println("el menor es:"+ b);
		}
		else {
			System.out.println("el menor es:"+ c);
			
		}
		System.out.println("en orden descendente:");		
		}
		}
			
			
			
		
			
			
			
		

	


