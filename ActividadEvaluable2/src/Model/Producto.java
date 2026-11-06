package Model;

public abstract class  Producto {
	// atributos
	protected int idProducto;
	protected String numSerie;
	protected String marca;
	protected String modelo;
	protected double precio;
	
	// constructor
	public Producto(int idProducto, String numSerie, String marca, String modelo, double precio) {
		this.idProducto = idProducto;
		this.numSerie = numSerie;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	// getters and setters
	public int getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}


	public String getNumSerie() {
		return numSerie;
	}


	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	// tosString
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", numSerie=" + numSerie + ", marca=" + marca + ", modelo="
				+ modelo + ", precio=" + precio + "]";
	}
	
	

}
