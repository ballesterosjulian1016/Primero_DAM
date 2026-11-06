package ejercicio1;

public class MaquinaCardio extends Maquina {
	protected int velocidadMaxima;
	protected int minutosUso;
	
	
	public MaquinaCardio(String id, String nombre, double pesoMaximo, int velocidadMaxima, int minutosUso)throws MaquinaInvalidaException {
		super(id, nombre, pesoMaximo);
		this.velocidadMaxima = velocidadMaxima;
		this.minutosUso = minutosUso;
	}
	@Override
	public double calcularUso() {
		return velocidadMaxima * minutosUso * 0.1;
		
		
	}
	@Override
	public void mostrarInformacion() {
		System.out.println("MaquinaCardio [velocidadMaxima=" + velocidadMaxima + ", minutosUso=" + minutosUso + ", id=" + id
				+ ", nombre=" + nombre + ", pesoMaximo=" + pesoMaximo + "]");
		
	}
	
	
	
	

}
