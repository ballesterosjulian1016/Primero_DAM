package ejercicio1;

public  abstract class Vehiculo implements Transportable  {
	protected int id,velocidadMaxima;
	protected String marca;
	
	
	public Vehiculo(int id, int velocidadMaxima, String marca)throws VehiculoInvalidoException {
		
		if(id<0) {
			throw new VehiculoInvalidoException("el numero no puede ser negativo");
		}
			if(velocidadMaxima<0) {
				throw new VehiculoInvalidoException("el numero no puede ser negativo");
			
		}
			if(marca == null || marca.isEmpty()) {
				throw new VehiculoInvalidoException("la marca no puede estar vacia");
			}
		
		this.id = id;
		this.velocidadMaxima = velocidadMaxima;
		this.marca = marca;

	}
	public abstract void mostrarInformacion();
}
