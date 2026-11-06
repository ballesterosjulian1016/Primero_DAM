package Model;

public class TabletPremiun extends Producto{
	// atributos
	private boolean protector;
	
	
	//constructor
	public TabletPremiun(int idProducto, String numSerie, String marca, String modelo, double precio,	String protectorElegido) {
		super(idProducto, numSerie, marca, modelo, precio);
		this.protector = verificarProtector(protectorElegido);
	}
		
		
		
	//metodo propio para verificar si quiere protector o no 
		
		
	private boolean verificarProtector(String protectorElegido) {
		if(protectorElegido.equalsIgnoreCase("si")|| protectorElegido.equalsIgnoreCase("s")) {
			return true;
						
		}else {
			return false;
		}
	}
	
	//tosString
		public String toString() {
			return "T Premium [idProducto=" + idProducto + ", numSerie=" + numSerie + ", marca=" + marca + ", modelo="
					+ modelo + ", precio=" + precio + ", protector:"+(protector?"si":"no")+"]";
		}
	
	

}
