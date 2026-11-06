package ejercicio1;

public class Autobus extends Vehiculo {
	protected int numAsiento,pisos;
	

	public Autobus(int id, int velocidadMaxima, String marca, int numAsiento, int pisos) throws VehiculoInvalidoException{
		super(id, velocidadMaxima, marca);
		this.numAsiento = numAsiento;
		this.pisos = pisos;
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("Autobus [numAsiento=" + numAsiento + ", pisos=" + pisos + ", id=" + id + ", velocidadMaxima="
				+ velocidadMaxima + ", marca=" + marca + "]");
		
	}

	@Override
	public int calcularCapacidad() {
		
		return numAsiento*pisos;
	}

	
	
	
	

}
