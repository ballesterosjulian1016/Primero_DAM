package Main;
import java.util.Scanner;
import Service.*;
import Model.*;


public class Aplicacion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ServiceTablet servicio= new ServiceTablet();
		
		int opcionMenu =0;
		
		System.out.println("Bienvenido al Menu de Opciones");
		
		do {
			System.out.println("Que desea realizar el dia de hoy?");
	        System.out.println("1. Dar de alta una tablet");
	        System.out.println("2. Dar de alta un cliente");
	        System.out.println("3. Vender una tablet");
	        System.out.println("4. Mostrar Tablet disponible");
	        System.out.println("5. Ver historial de un cliente");
	        System.out.println("6. Salir");
	        System.out.print("Ingrese una opcion: ");
	        
	        opcionMenu= Integer.parseInt(sc.nextLine());
	        
	        switch(opcionMenu) {
	        case 1:
	        	System.out.println("\n Dar de alta una tablet");
	    		int idProducto = servicio.listaproducto.size()+1;
	    		System.out.print("Ingrese el numero de Serie: ");
	    		String numSerie = sc.nextLine();
	    		System.out.print("Ingrese la marca: ");
	    		String marca = sc.nextLine();
	    		System.out.print("Ingrese el modelo: ");
	    		String modelo = sc.nextLine();
	    		System.out.print("Ingrese el precio: ");
	    		double precio = Double.parseDouble(sc.nextLine());
	    		System.out.println("Que tipo de tablet es: \n 1.Premiun \n 2.Basica \n");
	    		System.out.print("Ingrese una opcion: ");

	    		int opcionTablet = Integer.parseInt(sc.nextLine());
	    		switch(opcionTablet){
	    			case 1:
	    				System.out.println("tiene protector (s/n):");
	    				String protector = sc.nextLine();
	    				servicio.darAltaTablet(new TabletPremiun(idProducto,numSerie,marca,modelo,precio,protector));
	    					
	    				break;
	    			case 2 :
	    				System.out.println("que capacidad tiene de almacenamiento");
	    				int almacenamiento = Integer.parseInt(sc.nextLine());
	    				servicio.darAltaTablet(new TabletBasica(idProducto,numSerie,marca,modelo,precio,almacenamiento));
	    				break;
	    				default:
	    					break;
	    		}
	        	break;
	        case 2:
	        	System.out.println("/n Dar de alta un cliente");
	        	int idCliente = servicio.listapersona.size()+1;
	        	System.out.println("ingrese el nombre del cliente");
	        	String nombre = sc.nextLine();
	        	System.out.println("ingrese su documento NIE/DNI/CIF");
	        	String documento = sc.nextLine();
	        	System.out.println("ingrese su direccion");
	        	String direccion = sc.nextLine();
	        	System.out.println("que tipo de cliente es: /n 1:empresa /n 2:particular: ");
	        	System.out.println("ingrese una opcion");
	        	
	        	int opcionCliente = Integer.parseInt(sc.nextLine());
	        	switch(opcionCliente) {
	        	case 1:
	        		System.out.println("ingrese su razon social");
	        		String razonSocial = sc.nextLine();
	        		System.out.println("ingrese su representante legal");
	        		String representanteLegal = sc.nextLine();
	        		servicio.darAltaCliente(new ClienteEmpresa(idCliente,nombre,documento,direccion,razonSocial,representanteLegal));
	        		break;
	        	case 2:
	        		System.out.println("ingrese su genero");
	        		String genero = sc.nextLine();
	        		System.out.println("ingrese su apellido");
	        		String apellido = sc.nextLine();
	        		servicio.darAltaCliente(new ClienteEmpresa(idCliente,nombre,documento,direccion,genero,apellido));
	        		break;
	        	}
	        	break;
	        case 3:
	        	System.out.println("vender una tablet");
	        	int idVenta = servicio.listaventas.size()+1;
	        	System.out.println("lista de clientes");
	        	servicio.listacliente();
	        	System.out.println(" ingrese el id del cliente");
	        	int IdPersona = Integer.parseInt(sc.nextLine());
	        	Persona p1 = servicio.buscarIdPersona(IdPersona);
	        	System.out.println("lista de productos");
	        	servicio.listaproductos();
	        	System.out.println(" ingrese el id del producto");
	        	int IdProducto = Integer.parseInt(sc.nextLine());
	        	Producto pro1 = servicio.buscarIdProducto(IdProducto);
	        	servicio.venderTablet(idVenta, p1, pro1);
	        	break;
	        case 4:
	        	servicio.mostrarStock();
	        	break;
	        case 5:
	        	System.out.println("lista de clientes");
	        	servicio.listacliente();
	        	System.out.println("ingrese el id del cliente para consultar");
	        	int idBuscadoCliente = Integer.parseInt(sc.nextLine());
	        	Persona personaEncontrada = servicio.buscarIdPersona(idBuscadoCliente);
	        	servicio.historialCliente(personaEncontrada);
	        	break;
	        case 6:
	        	System.out.println(" hasta pronto");
	        	break;
	        default:	
	        	System.out.println("opcion incorrecta");
	        		
	        	
	        
	        }
		}while(opcionMenu !=6);
		

	}

}
