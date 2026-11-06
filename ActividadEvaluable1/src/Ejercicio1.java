import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	// calcular el area y perimetro del circulo,cuadrado,rectangulo,triangulo
		
		double area, perimetro;
		int opcion;
		
		Scanner sc = new Scanner(System.in);
		
		// hacemos un bucle en mi caso eleji el  do while
		 do {
			System.out.println("Elige una opcion");
			System.out.println ("== MENU DE OPCIONES==");
			System.out.println ("1.-circulo");
			System.out.println ("2.-cuadrado");
			System.out.println ("3.-rectangulo");
			System.out.println ("4.-triangulo");
			System.out.println ("5.-salir");
			opcion = sc.nextInt();
			
			// Hago un menu de opciones con la funcion switch para que el usuario elija
			
			switch (opcion) {
			 case 1: 
				System.out.println(" Has elegido el circulo: " );   //aqui calculamos el area y perimetro del circulo
				System.out.println(" Dime el radio: ");
				double radio = sc.nextDouble();
				area = Math.PI * radio * radio;
				perimetro = 2 * Math.PI * radio;
				System.out.println(" area : " + area);
				System.out.println(" perimetro : " + perimetro);
				break;
			 case 2: 
				 System.out.println(" Has elegido el cuadrado:" );    //aqui calculamos el area y perimetro del cuadrado
				 System.out.println(" Dime el lado:");
				 double lado = sc.nextDouble();
				 area = lado * lado;
				 perimetro = lado + lado + lado + lado;
				 System.out.println(" area : " + area);
				 System.out.println(" perimetro: " + perimetro);
				 break;
			 case 3: 
				 System.out.println(" Has elegido rectangulo: " );    //aqui calculamos el area y perimetro del rectangulo
				 System.out.println(" Dime la base: " );
				 double base = sc.nextDouble();
				 System.out.println(" Dime la altura: " );
				 double altura = sc.nextDouble();
				 area = base * altura;
				 perimetro = 2 * ( base  + altura);
				 System.out.println(" area : " + area);
				 System.out.println(" perimetro: " + perimetro);
				 break;
			 case 4 :
				 System.out.println(" Has elegido el triangulo:" );    //aqui calculamos el area y perimetro del triangulo
				 System.out.println(" Dime la base1: ");
				 double base1 = sc.nextDouble();
				 System.out.println(" Dime la altura1");
				 double altura1 = sc.nextDouble();
				 area = base1 * altura1 / 2;
				 System.out.println(" Dime el lado1:" );
				 double lado1 = sc.nextDouble();
				 System.out.println(" Dime el lado2:" );
				 double lado2 = sc.nextDouble();
				 System.out.println(" Dime el lado3:" );
				 double lado3 = sc.nextDouble();
				 perimetro = lado1 + lado2 + lado3;
				 System.out.println(" area : " + area);
				 System.out.println(" perimetro: " + perimetro);
				 break;
			 case 5:
				 System.out.println(" Saliendo hasta pronto");
				 break;
				 
				 default: System.out.println(" Opcion incorrecta");
				 break;
	

	}
		 }while (opcion!=5);		// aqui termino mi programa

}
}
