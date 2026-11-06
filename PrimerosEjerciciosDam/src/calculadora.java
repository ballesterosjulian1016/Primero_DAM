import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		int num1, num2, opcion;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println(" Hola bienvenido a la calculadora:");
		System.out.println ("Dime el primer numero");
		num1=sc.nextInt();
		System.out.println ("Dime el segundo numero");
		num2=sc.nextInt();
		
		System.out.println("Elige una opcion");
		System.out.println ("== MENU DE OPCIONES==");
		System.out.println ("1.-Sumar");
		System.out.println ("2.-Restar");
		System.out.println ("3.-Multiplicar");
		System.out.println ("4.-Dividir");
		System.out.println ("5.-Resto");
		System.out.println ("6.-Salir");
		opcion=sc.nextInt();
		
		switch(opcion) {
		
		   case 1: opcion =(num1+ num2);
			  break;
		   case 2: opcion =(num1- num2);
			  break;
		   case 3: opcion =(num1* num2);
			  break;
		   case 4: opcion =(num1/ num2);
			  break;
		   case 5: opcion =(num1% num2);
			  break;
		   case 6:System.out.println ("Hasta pronto");
		      break;
		      
			 default:System.out.println("Opcion incorrecta");
			  break;
		
		}
		System.out.println("__________________________");
		System.out.println("el resultado es " + opcion);
		
		}while (opcion!=6);
		
		}
		
		
		
	}


