package Service;
import java.util.ArrayList;
import Model.*;
import java.util.Scanner;
import Interface.*;

public class ServiceTablet  implements GestionTablets {

	

	public ArrayList<Persona>listapersona=new ArrayList<>();
	public ArrayList<Producto>listaproducto=new ArrayList<>();
	public ArrayList<Ventas>listaventas=new ArrayList<>();
	Scanner sc = new Scanner (System.in);
	
	// metodos que utilizo para hacer el llamado en el main , utilice el override  que es lo que implementa los metodos
	@Override
	public void venderTablet(int idVenta, Persona p, Producto pro) {
		Ventas VentaNueva = new Ventas(idVenta, p, pro);
		listaventas.add(VentaNueva);
		listaproducto.remove(pro);
		System.out.println("venta realizada");
		System.out.println(VentaNueva.toString());
		
	}
	
	
	@Override
	public void mostrarStock() {
		for(Producto prolista: listaproducto) {
			if(listaproducto.isEmpty()) {
				System.out.println(" SIN STOCK");
				
			}else {
				System.out.println(prolista.toString());
				System.out.println("");
			}
			
			
		}
		
	}
	
	@Override
	public void historialCliente(Persona p) {
		System.out.println(" historial del cliente");
		System.out.println("cliente ="+ p.getNombre());
		System.out.println("hisorial de compras");
		for(Ventas ventasbuscadas : listaventas) {
			if(ventasbuscadas.getClienteCompra().getIdCliente()== p.getIdCliente());
			System.out.println("Serie: " + ventasbuscadas.getProductoVendido().getNumSerie() +
					", Modelo: "+ ventasbuscadas.getProductoVendido().getModelo() + ", Marca: " + ventasbuscadas.getProductoVendido().getMarca() +
					", Precio: " + ventasbuscadas.getProductoVendido().getPrecio());
		}
	}
	@Override
	public void darAltaTablet(Producto pro) {
		listaproducto.add(pro);
		System.out.println("Alta realizada");
		System.out.println(pro.toString());
	}
	@Override
	public void darAltaCliente(Persona p) {
		listapersona.add(p);
		System.out.println("Cliente dado de alta");
		System.out.println(p.toString());
		
	}
		// utilizare metodos auxiliares para para listar a los clientes y a los productos, 
		//tambien para buscar los productos y los clientes

	public void listacliente() {
		for(Persona plista: listapersona) {
			System.out.println(plista.toString());
			System.out.println("");
		}
		
	}
	
	public void listaproductos() {
		for(Producto prolista:listaproducto) {
			System.out.println(prolista.toString());
			System.out.println("");
		}
	}
	
	public Persona buscarIdPersona(int IdPersona) {
		for(Persona buscarIdp:listapersona) {
			if(buscarIdp.getIdCliente() == IdPersona) {
				return buscarIdp;
			}
		}
		return null; 
	}
	
	public Producto buscarIdProducto(int IdProducto) {
		for(Producto buscarIdpro:listaproducto) {
			if(buscarIdpro.getIdProducto() == IdProducto) {
				return buscarIdpro;
			}
		}
		return null;
	}
	
	}

