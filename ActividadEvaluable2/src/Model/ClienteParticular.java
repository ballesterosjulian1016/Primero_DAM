package Model;

public class ClienteParticular extends Persona {
	// atributo
	private boolean genero;
	private String apellido;
	
	
	
	// costructor
	
	public ClienteParticular(int idCliente, String nombre, String documento, String direccion, String sexo,String apellido) {
		super(idCliente, nombre, documento, direccion);
		this.genero = mostrarGenero(sexo);
		this.apellido = apellido;
	}
	public boolean mostrarGenero(String sexo) {
		if(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("Masculino")) {
			return true;
		}else {
			return false;
		}
	}
	


	
	
	// tosString
	
	@Override
	public String toString() {
		return "ClienteParticular [genero=" + genero +(genero ? "MASCULINO" : "FEMENINO" )+ ", apellido=" + apellido + ", idCliente=" + idCliente
				+ ", nombre=" + nombre + ", documento=" + documento + ", direccion=" + direccion + ", identificador="+  "]";
	}
	

}
