package Model;

public class TabletBasica extends Producto {
	// atributos
	private int almacenamiento;
    
	// constructor
	public TabletBasica(int idProducto, String numSerie, String marca, String modelo, double precio,
			int almacenamiento) {
		super(idProducto, numSerie, marca, modelo, precio);
		this.almacenamiento = almacenamiento;
	}
	// tosString
	public String toString() {
		return "T Basica [idProducto=" + idProducto + ", numSerie=" + numSerie + ", marca=" + marca + ", modelo="
				+ modelo + ", precio=" + precio + ",almacenamiento:"+ almacenamiento +"]";
	}
	
	// para que lo puedas diferenciar al imprimir XD
	
}
