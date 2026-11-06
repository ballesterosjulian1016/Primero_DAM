
public class BarcoPasajero extends Barco implements Capacidad{
	
	//atributos
	private int numCamarotes, pasajerosPorCamarote;

   
	
	// constructores
	
	public BarcoPasajero(int id, int velocidadMaxima, String nombre, int numCamarotes, int pasajerosPorCamarote) throws BarcoInvalidoException  {
		
		if (numCamarotes<0) {
			throw new BarcoInvalidoException ("el numero de camarotes no puede ser negativa");
			
		}
		if (pasajerosPorCamarote<0) {
			throw new BarcoInvalidoException ("el numero de pasajeros por camarote no puede ser negativa");
		}
		
		
		super(id, velocidadMaxima, nombre);
		this.numCamarotes = numCamarotes;
		this.pasajerosPorCamarote = pasajerosPorCamarote;
	}


	public int calcularCapacidad() {
		return numCamarotes * pasajerosPorCamarote;
		
		
	}
	
	
	
	@Override
	public void mostrarInformacion() {
		System.out.println("ID " + id);
		System.out.println("velocidad maxima " + velocidadMaxima);
		System.out.println("numero de camarotes " + numCamarotes);
		System.out.println("numero de pasajeros por camarote " + pasajerosPorCamarote);
		System.out.println("capacidad total " + calcularCapacidad());
	}
	
	
	
	
	
	
	

}
