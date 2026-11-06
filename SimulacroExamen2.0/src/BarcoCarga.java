
public class BarcoCarga extends Barco {
	
	protected int capacidadPorBodega,numBodega;

	public BarcoCarga(int id, int velocidadMaxima, String nombre, int capacidadPorBodega, int numBodega) throws BarcoInvalidoException {
		if(capacidadPorBodega<0) {
			throw new BarcoInvalidoException("la capacidad de bodegas  no puede ser negativo");
		}
		
		if(numBodega<0) {
			throw new BarcoInvalidoException("el numero de bodegas  no puede ser negativo");
		}
		
		
		super(id, velocidadMaxima, nombre);
		this.capacidadPorBodega = capacidadPorBodega;
		this.numBodega = numBodega;
	}

	@Override
	public int CalcularCapacidad() {
		return capacidadPorBodega * numBodega;
	}

	@Override
	public void MostrarInformacion() {
		System.out.println("ID " + id);
		System.out.println("velocidad maxima " + velocidadMaxima);
		System.out.println("nombre " + nombre);
		System.out.println("numero de camarotes " + capacidadPorBodega);
		System.out.println("numero de pasajeros por camarote " + numBodega);
		System.out.println("capacidad total " + CalcularCapacidad());
		
		
	}
	

}
