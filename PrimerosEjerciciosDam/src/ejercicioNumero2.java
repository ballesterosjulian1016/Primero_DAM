import java.util.Scanner;

public class ejercicioNumero2 {

	public static void main(String[] args) {
		
		int num1, num2, opcion;
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Dime el primer numero");
		num1=sc.nextInt();
		System.out.println ("Dime el segundo numero");
		num2=sc.nextInt();
      
        System.out.println("la suma es "+(num1+num2));
        if(num1>num2) {
        	 System.out.println("la resta es "+(num1-num2));
        }
        else {
        	System.out.println("la resta es "+(num2-num1));
        	
        }
        
        System.out.println("la multiplicacion es "+(num1*num2));
        
        if(num2==0) {
        	System.out.println("la division no se puede hacer");
        
        }
        else {
        	 System.out.println("la divicion es "+(num1/num2));
        }
      
  
        if(num2==0) {
        	System.out.println("el no se puede hacer");
        }
				
        else {
        	System.out.println("la resto es "+(num1%num2));
        }
        
        	
        }

	}


