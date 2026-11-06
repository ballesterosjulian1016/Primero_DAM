package Model;

public class ClienteEmpresa extends Persona  {
	// atributo
	private String razonSocial;
	private String representanteLegal;
	
	
	// constructor
	
	public ClienteEmpresa(int idCliente, String nombre, String documento, String direccion, String razonSocial,
			String representanteLegal) {
		super(idCliente,  nombre, documento, direccion);
		this.razonSocial = razonSocial;
		this.representanteLegal = representanteLegal;
	}


	@Override
	public String toString() {
		return "ClienteEmpresa [razonSocial=" + razonSocial + ", representanteLegal=" + representanteLegal
				+ ", idCliente=" + idCliente + ", nombre=" + nombre + ", documento=" + documento + ", direccion="
				+ direccion + "]";
	}


}
