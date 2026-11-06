package ejercicio1;

public class MaquinaPeso extends Maquina{
	protected int numSeries;
	protected int repeticionesPorSerie;
	
	public MaquinaPeso(String id, String nombre, double pesoMaximo, int numSeries, int repeticionesPorSerie) throws MaquinaInvalidaException {
		super(id, nombre, pesoMaximo);
		this.numSeries = numSeries;
		this.repeticionesPorSerie = repeticionesPorSerie;
	}


	@Override
	public double calcularUso() {
		return numSeries * repeticionesPorSerie;
	
		
	}


	@Override
	public void mostrarInformacion() {
	System.out.println("MaquinaPeso [numSeries=" + numSeries + ", repeticionesPorSerie=" + repeticionesPorSerie + ", id=" + id
				+ ", nombre=" + nombre + ", pesoMaximo=" + pesoMaximo + "]");
	}


	


	
	
	

}
