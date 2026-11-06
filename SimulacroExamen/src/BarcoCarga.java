
public class BarcoCarga extends Barco implements Capacidad{
	
	//atributos
	private int capacidadPorBodega,numBodegas;

	
	
	//constructores
	
	public BarcoCarga(int id, int velocidadMaxima, String nombre, int capacidadPorBodega, int numBodegas) throws BarcoInvalidoException {
		
		if (capacidadPorBodega<0) {
			throw new BarcoInvalidoException (" la capcidad no puede ser negativa");
			
		}
		if (numBodegas<0) {
			throw new BarcoInvalidoException ("el numero de bodegas no puede ser negativa");
		}
		
		super(id, velocidadMaxima, nombre);
		this.capacidadPorBodega = capacidadPorBodega;
		this.numBodegas = numBodegas;
	}

	public int calcularCapacidad() {
		return capacidadPorBodega * numBodegas;
	}
	
	
	
	@Override
	public void mostrarInformacion() {
		System.out.println("ID " + id);
		System.out.println("velocidad maxima " + velocidadMaxima);
		System.out.println("numero de camarotes " + capacidadPorBodega);
		System.out.println("numero de pasajeros por camarote " + numBodegas);
		System.out.println("capacidad total " + calcularCapacidad());
		
	}
	
	
	

}
