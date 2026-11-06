package ejercicio1;

public abstract class  Animal implements Alimentacion {
	protected int id,edad;
	protected String nombre;
	
	
	public Animal(int id, int edad, String nombre) throws AnimalInvalidoException {
		
		if(id<0||edad<0|| nombre == null|| nombre.isEmpty()){
			throw new AnimalInvalidoException(" los datos son incorrectos");
		}
		
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
	}
	
	public abstract void mostrarInformacion();

}
