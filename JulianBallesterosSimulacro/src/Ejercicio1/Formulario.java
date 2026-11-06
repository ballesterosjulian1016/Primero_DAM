package Ejercicio1;

import java.util.Scanner;

public class Formulario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		String nombre = null;
		String apellidos= null;
		String dni = null;
		String email = null;
		Boolean datosCorrectos = false;
		
		do {
			System.out.println("1. ingrese su nombre ");
			System.out.println("2. ingrese su apellido");
			System.out.println("3. ingrese su dni");
			System.out.println("4. ingrese su email");
			System.out.println("5. salir");
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch(opcion) {
			case 1:
				System.out.println("introdusca tu nombre");
				nombre=sc.nextLine();
				break;
			case 2:
				System.out.println("introdusca tu apellido");
				apellidos=sc.nextLine();
				break;
			case 3:
				System.out.println("introdusca tu dni");
				dni=sc.nextLine();
				break;
			case 4:
				System.out.println("introdusca tu email");
				email=sc.nextLine();
				break;
			case 5:
				if(nombre==null|| nombre.isEmpty()|| apellidos==null|| apellidos.isEmpty()||dni==null|| dni.isEmpty()||email==null|| email.isEmpty())
					datosCorrectos=false;
				System.out.println("datos imcompletos");
				
				
				break;
			
				
			}
			

		}while(!datosCorrectos);
		
		

	}

}
