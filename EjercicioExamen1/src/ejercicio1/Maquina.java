package ejercicio1;

public abstract class Maquina implements Calculable {
	protected  String id;
	protected String nombre;
	protected double pesoMaximo;
	
	
	
	public Maquina(String id, String nombre, double pesoMaximo)
			throws MaquinaInvalidaException {
		
		if(id == null || id.isEmpty() || nombre.isEmpty()|| pesoMaximo<0) {
			throw new MaquinaInvalidaException("datos incorrectos");
		}
		
		this.id = id;
		this.nombre = nombre;
		this.pesoMaximo = pesoMaximo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPesoMaximo() {
		return pesoMaximo;
	}
	public void setPesoMaximo(double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}
	
	public abstract void mostrarInformacion();
}
