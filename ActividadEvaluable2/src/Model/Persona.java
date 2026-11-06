package Model;

public abstract class Persona {
	// Aqui coloco los Atributos
	
	protected int idCliente;
	protected String nombre;
	protected String documento;
	protected String direccion;
	
		
	// aqui hago los Constructores
	
	public  Persona (int idCliente, String nombre, String documento, String direccion) {
		
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.documento = documento;
		this.direccion = direccion;
		
	}
		
		
	
	// hago mis GETTERS AND SETTERS

	public int getIdCliente() {
		return idCliente;
	}

	

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

	
	

	
	
	// aqui hago mi toString
	
	@Override
	public String toString() {
		return "Persona [idCliente=" + idCliente + ", nombre=" + nombre + ", documento=" + documento + ", direccion="
				+ direccion +  "]";
	}

	
	}
	
	
	


