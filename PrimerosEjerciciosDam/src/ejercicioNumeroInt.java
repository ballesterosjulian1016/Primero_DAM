import java.util.Scanner;

public class ejercicioNumeroInt {

	public static void main(String[] args) {
		String nombre;
		int nota, nota2, nota3, media;
		
		 Scanner sc = new Scanner(System.in); 
		 
		
			System.out.print( "Dime tu nombre: ");
			nombre=sc.nextLine();
			
			System.out.print( "Dime la nota: ");
			nota=sc.nextInt();
			
			System.out.print( "Dime la 2º nota: ");
			nota2=sc.nextInt();
			
			System.out.print( "Dime la 3º nota: ");
			nota3=sc.nextInt();
			
			media = (nota+nota2+nota3)/3;
			System.out.print("bienvenido " +  nombre );
			System.out.print(": tu nota es " +  media );
		

	}

}
