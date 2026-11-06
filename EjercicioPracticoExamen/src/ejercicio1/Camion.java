package ejercicio1;

public class Camion extends Vehiculo {
	
	protected int capacidadToneladas,numEjes;

	
	public Camion(int id, int velocidadMaxima, String marca, int capacidadToneladas, int numEjes)throws VehiculoInvalidoException {
		super(id, velocidadMaxima, marca);
		this.capacidadToneladas = capacidadToneladas;
		this.numEjes = numEjes;
	}

	

	@Override
	public void mostrarInformacion() {
		System.out.println("Camion [capacidadToneladas=" + capacidadToneladas + ", numEjes=" + numEjes + ", id=" + id
				+ ", velocidadMaxima=" + velocidadMaxima + ", marca=" + marca + "]");
		
	}

	@Override
	public int calcularCapacidad() {
		
		return capacidadToneladas*numEjes;
	}



	
	

}
