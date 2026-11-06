import java.util.*;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<CuentaUsuario>cuentas = new ArrayList<>();
		ControlArchivos fichero = new ControlArchivos();
		
		int opcion;
		do {
			System.out.println("\n1. crear cuenta ");
			System.out.println("2. mostrar cuentas");
			System.out.println("3. publicar mensaje");
			System.out.println("4. guardar en fichero");
			System.out.println("5. leer fichero");
			System.out.println("6. salir");
			opcion=sc.nextInt();
			sc.nextLine();
			
			try {
				
				switch(opcion) {
				case 1:
						System.out.println("1 cuentabasica 2. cuentapremiun");
						int tipo=sc.nextInt();
						sc.nextLine();
						
						System.out.println("dime tu nombre");
						String nombre=sc.nextLine();
						
						String email="";
						while(true) {
							System.out.println("dime tu email");
							 email=sc.nextLine();
							if(email.contains("@")) {
								break;
							}else {
								System.out.println("error email incorrecto (debe tener el @)");
							}
						}
						String telefono="";
						while(true) {
							System.out.println("dime el telefono(10 digitos)");
							 telefono=sc.nextLine();
							if(telefono.length()==10) {
								break;
							}else {
								System.out.println("error telefono incorrecto (debe contener 10 digitos)");
							}
						}
						
						
						
						System.out.println("dime la edad");
						int edad=sc.nextInt();
						sc.nextLine();
						
						CuentaUsuario cuenta;
						if(tipo==1) {
							cuenta= new CuentaBasica(nombre,email,telefono,edad);
						}else {
							cuenta = new CuentaPremiun(nombre,email,telefono,edad);
						}
						cuentas.add(cuenta);
						System.out.println("cuenta creada con exito");
						break;
				case 2:
					for(CuentaUsuario c : cuentas) {
						c.mostrarInformacion();
						System.out.println("________");
					}
					break;
				case 3:
					System.out.println("escribe el mensaje");
					String mensaje= sc.nextLine();
					
					for(CuentaUsuario u : cuentas) {
						u.publicarMensaje( mensaje );
					}
					break;
				case 4:
					fichero.guardarDatos(cuentas);
					break;
				case 5 :
					fichero.mostrarDatos();
					break;
				case 6 :
					System.out.println("saliendo del programa-- hasta pronto");
					break;
				
				}
				
			}catch(TelefonoInvalido e) {
				System.out.println("error telefono incorrecto :" + e.getMessage());
				
			}catch(EdadInvalida i) {
				System.out.println("edad incorrecta :" + i.getMessage());
			}
			
		}while(opcion != 6);

	}

}
