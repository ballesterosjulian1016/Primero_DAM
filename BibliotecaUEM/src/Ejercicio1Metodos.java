import java.util.Scanner;

public class Ejercicio1Metodos {

		public static void main(String[] args) {
				int opcion;
				Scanner sc= new Scanner(System.in);	
				do {
				 menuPrincipal();	
				 opcion = sc.nextInt();
				menuopciones(opcion,sc);
				
					
				
				}while(opcion!=6);	
		 
	}
		public static void menuopciones(int opcion,Scanner sc) {
			String arrayinsertarlibro [][] = new String [100][3];
				switch(opcion) {
				case 1: insertar(sc, arrayinsertarlibro);
									
					break;
				case 2: eliminar(sc);
					break;
				case 3: modificar(sc);
					break;
				case 4: alquilar(sc);
					break;
				case 5: devolver(sc);
					break;
				case 6: System.out.println(" saliendo del programa ");
					break;
				default: System.out.println(" opcion incorrecta ");
					break;
				
				}
	}
		public static void menuPrincipal() {
				System.out.println("bienvenido al menu de la biblioteca");
				System.out.println("elige una opcion:");
				System.out.println("== MENU DE OPCIONES==");
				System.out.println(" 1. -- insertar--");
				System.out.println(" 2. -- eliminar--");
				System.out.println(" 3. -- modificar--");
				System.out.println(" 4. -- alquilar-");                        
				System.out.println(" 5. -- devolver--");
				System.out.println(" 6. -- salir--");
				
		}
		public static void insertar(Scanner sc, String arrayinsertarlibro [][]) { 
	        String titulo,autor,año;  
	        
			for(int i=0;i<arrayinsertarlibro.length;i++) {
				if(arrayinsertarlibro[i][0]==null) {
					System.out.println("dime el titulo del libro : ");
					arrayinsertarlibro [i][0] = sc.nextLine();
					System.out.println("dime el autor del libro : ");
					arrayinsertarlibro [i][1] = sc.nextLine();
					
					System.out.println("dime el año de la publicacion del libro : ");
					arrayinsertarlibro [i][2]  = sc.nextLine();
					
					
				}
			}
				
				
				
				
				
					}
				
			
		
		public static void eliminar(Scanner sc) {
			System.out.println(" has elegido eliminar un libro");
			
			
		}
		public static void modificar(Scanner sc) {
			System.out.println(" has elegido modificar un libro");
		}
		public static void alquilar(Scanner sc) {
			System.out.println(" has elegido alquilar un libro");
		}
		public static void devolver(Scanner sc) {
			System.out.println(" has elegido devolver un libro");
		}
		
}
