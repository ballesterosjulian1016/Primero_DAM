import java.util.Scanner;

public class ejercicioNumero3 {

	public static void main(String[] args) {
		double num1, num2, iguales ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "dime el primer numero: ");
		num1=sc.nextDouble();
		
		System.out.println( "dime el segundo numero:");
		num2=sc.nextDouble();
		
	
		 if(num1>num2) {
			 System.out.println("el mayor es:" + num1);
			 System.out.println("el menor es:" + num2);
		 }
		 else if(num2>num1) {
			 System.out.println("el mayor es  "+ num2);
			 System.out.println("el menor es  "+ num1);
			 }
		 else {
			 System.out.println("los dos son iguales ");
		 }
		
			 
		 }
		 }
		 
			 
			 
			 
			 
		

	


