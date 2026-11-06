package Model;

public class Ventas {
	private int idVenta;
	private Persona clienteCompra;
	private Producto productoVendido;
	
	
	public Ventas(int idVenta, Persona clienteCompra, Producto productoVendido) {
		super();
		this.idVenta = idVenta;
		this.clienteCompra = clienteCompra;
		this.productoVendido = productoVendido;
		
	}


	public int getIdVenta() {
		return idVenta;
	}


	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}


	public Persona getClienteCompra() {
		return clienteCompra;
	}


	public void setClienteCompra(Persona clienteCompra) {
		this.clienteCompra = clienteCompra;
	}


	public Producto getProductoVendido() {
		return productoVendido;
	}


	public void setProductoVendido(Producto productoVendido) {
		this.productoVendido = productoVendido;
	}


	@Override
	public String toString() {
		return "Ventas [idVenta=" + idVenta + ", clienteCompra=" + clienteCompra + ", productoVendido="
				+ productoVendido + "]";
	}
	
	

}
