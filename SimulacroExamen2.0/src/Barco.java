
public abstract class Barco  implements Capacidad{
	
	protected int id,velocidadMaxima;
	protected String nombre;


	public Barco(int id, int velocidadMaxima, String nombre)throws BarcoInvalidoException {
		if(id<0) {
			throw new BarcoInvalidoException("el id no puede ser negativo");	
		}
		
		if(velocidadMaxima <0) {
			throw new BarcoInvalidoException("la veloxidad maxima no puede ser negativo");	
		
		}
		
		if(nombre == null || nombre.isEmpty()) {
			throw new BarcoInvalidoException("el nombre no puede estar vacio");	
		}
			
		this.id = id;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}


	public void setVelocidadMaxima(int velocidadMaxima) {
		velocidadMaxima = velocidadMaxima;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		nombre = nombre;
	}

	public abstract void MostrarInformacion();
	
}
