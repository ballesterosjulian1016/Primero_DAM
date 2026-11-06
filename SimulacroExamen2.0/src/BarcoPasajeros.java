
public class BarcoPasajeros extends Barco   {
	
	protected int numCamarotes,pasajerosPorCamarote;
	
	public BarcoPasajeros(int id, int velocidadMaxima, String nombre, int numCamarotes, int pasajerosPorCamarote) throws BarcoInvalidoException {
		
		if(numCamarotes<0) {
			throw new BarcoInvalidoException("el numero de camarotes no puede ser negativo");
		}
		
		if(pasajerosPorCamarote<0) {
			throw new BarcoInvalidoException("el numero de pasajeros por camarotes no puede ser negativo");
		}
		
		super(id, velocidadMaxima, nombre);
		this.numCamarotes = numCamarotes;
		this.pasajerosPorCamarote = pasajerosPorCamarote;
	}

	@Override
	public int CalcularCapacidad() {
		return numCamarotes * pasajerosPorCamarote;
	}

	@Override
	public void MostrarInformacion() {
		System.out.println("ID " + id);
		System.out.println("velocidad maxima " + velocidadMaxima);
		System.out.println("nombre " + nombre);
		System.out.println("numero de camarotes " + numCamarotes);
		System.out.println("numero de pasajeros por camarote " + pasajerosPorCamarote);
		System.out.println("capacidad total " + CalcularCapacidad());
		
	}
	
	
	

}
