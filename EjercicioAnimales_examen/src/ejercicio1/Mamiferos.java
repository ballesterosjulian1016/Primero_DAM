package ejercicio1;

public class Mamiferos extends  Animal{
	 protected double kgComida;

	 public Mamiferos(int id, int edad, String nombre, double kgComida)throws AnimalInvalidoException {
		super(id, edad, nombre);
		this.kgComida = kgComida;
	 }

	 @Override
	 public void mostrarInformacion() {
		 System.out.println("Mamiferos [kgComida=" + kgComida + ", id=" + id + ", edad=" + edad + ", nombre=" + nombre + "]");
	 }

	 @Override
	 public double calcularComidaDiaria() {
		// TODO Auto-generated method stub
		return kgComida;
	 }

	 
	 
	 

}
