package ejercicio1;

public class Ave extends Animal {
	
	protected double gramosPorComida,numComidas;

	public Ave(int id, int edad, String nombre, double gramosPorComida, double numComidas) throws AnimalInvalidoException {
		super(id, edad, nombre);
		this.gramosPorComida = gramosPorComida;
		this.numComidas = numComidas;
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("Ave [gramosPorComida=" + gramosPorComida + ", numComidas=" + numComidas + ", id=" + id + ", edad="
				+ edad + ", nombre=" + nombre + "]");
	}

	@Override
	public double calcularComidaDiaria() {
		// TODO Auto-generated method stub
		return gramosPorComida * numComidas;
	}

	
	
	

}
