
public abstract class Empleados {
	
	
	protected String nombre;
	protected String ciudad;
	protected int IdEmpleado;
	
	
	
	public Empleados(String nombre, String ciudad, int idEmpleado) {
		
		this.nombre = nombre;
		this.ciudad = ciudad;
		IdEmpleado = idEmpleado;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getCiudad() {
		return ciudad;
	}



	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}



	public int getIdEmpleado() {
		return IdEmpleado;
	}



	public void setIdEmpleado(int idEmpleado) {
		IdEmpleado = idEmpleado;
	}
	
	public abstract void CalcularSueldo();

	
	
	
	
	
	
	
	
	
	

}
