
public abstract class CuentaUsuario implements OperacionesCuentas{
	
	protected String nombreUsuario;
	protected String email;
	protected String telefono;
	protected int edad;
	
	
	public CuentaUsuario(String nombreUsuario, String email, String telefono, int edad) throws TelefonoInvalido, EdadInvalida {
		if(telefono.length() !=10) {
			throw new TelefonoInvalido("el telefono debe tener almenos 10 digitos");
			
		}
		if(edad<16) {
			throw new EdadInvalida("debes ser mayor de 16 años");
		}
		
		
		
		
		this.nombreUsuario = nombreUsuario;
		this.email = email;
		this.telefono = telefono;
		this.edad = edad;
		
		
		
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	public abstract void mostrarInformacion();
	
	
	
	

}
