import java.util.Scanner;

public class ejercicioMenu {

	public static void main(String[] args) {
		
		int opciones, num;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("--- MENU DE OPCIONES");
		System.out.println("1. par o impar");
		System.out.println("2. calcular sueldo trabajador");
		System.out.println("3. precio final producto");
		System.out.println("4. salir");
		System.out.println(" indique una opcion");
		opciones = sc.nextInt();
		
		switch (opciones) {
			case 1:System.out.println(" Dime un numero final");
							num = sc.nextInt();
							if (num %2==0) System.out.println(" es par");
							else System.out.println(" es impar");
			   break;
			case 2:System.out.println("--- indique la clase a la que pertenece---");
								System.out.println("1. clase A");
								System.out.println("2. clase B");
								System.out.println("3. clase C");
								System.out.println("4. clase D");
								System.out.println(" indique una opcion");
							int clase = sc.nextInt();
							int pagohora = 0;
							switch (clase) {
							case 1: pagohora = 25;
								break;
							case 2: pagohora = 20;
								break;
							case 3: pagohora = 15;
								break;
							case 4: pagohora = 10;
								break;
							default: System.out.println("clase incorrecta");
							
							}
							  System.out.print("Ingrese las horas trabajadas: ");
						        int horas = sc.nextInt();

						        int sueldo = pagohora * horas;

						        System.out.println("El sueldo total es: " + sueldo + " euros");
				break;					

			case 3:			System.out.println("base imponible");
							double base = sc.nextDouble();
							sc.nextLine();
							System.out.println("escriba y elija el tipo de iva: general, reducido o superreducido");
							String tipoiva = sc.nextLine();
							System.out.println("escriba y elija el código promocional: nopro, mitad, meno5 o 5porc ");
							String promo = sc.nextLine();
							double iva = 0;
							 		switch (tipoiva) {
							 		case "general": iva = 0.21;
									break;
							 		case "reducido": iva = 0.10;
									break;
							 		case "superreducido": iva = 0.04;
									break;
							 		default:System.out.println("tipo de iva incorrecto");	
							 		}
							double precioiva = base*(1+iva);
							double preciofinal =  precioiva;
									switch (promo) {
									case "nopro":
									break;
									case "mitad":preciofinal= precioiva/2;
									break;
									case "meno5":preciofinal= precioiva-5;
									break;
									case "5porc":preciofinal= precioiva*0.95;
									break;
									default: System.out.println(" codigo de promocion no valido");
									}
							
							System.out.println("base imponible " + base);
							System.out.println("iva aplicado " + iva*100);
							System.out.println("precio con iva " + precioiva);
							System.out.println("codigo aplicado " + promo);
							System.out.println("precio final " + preciofinal);
				break;
			case 4:
				System.out.println("Saliendo hasta pronto");
				break;
			default: System.out.println("Opcion incorrecta");
				break;
			
		
		
		}
		}while (opciones!=4);
	}

}
