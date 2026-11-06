
public abstract class Barco {
	
	// atributos
	
	 protected int id, velocidadMaxima;
	 protected String nombre;
	
	 
	 
	 //constructores
	 public Barco(int id, int velocidadMaxima, String nombre) throws BarcoInvalidoException {
		 
		 if (id<0) {
			 throw new BarcoInvalidoException("el id no puede ser negativo");
		 }
		 if  (velocidadMaxima<0) {
			 throw new BarcoInvalidoException("la velocidad no puede ser negativa");
		 }
		 if (nombre == null || nombre.isEmpty()) {
			 throw new BarcoInvalidoException("el nombre no puede estar vacio");
		 }
		 
			
			this.id = id;
			this.velocidadMaxima = velocidadMaxima;
			this.nombre = nombre;
		 }



	
	 
	//getter and setter
	 
	 public int getId() {
		 return id;
	 }



	 public void setId(int id) {
		 this.id = id;
	 }



	 public int getVelocidadMaxima() {
		 return velocidadMaxima;
	 }



	 public void setVelocidadMaxima(int velocidadMaxima) {
		 this.velocidadMaxima = velocidadMaxima;
	 }



	 public String getNombre() {
		 return nombre;
	 }



	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }
	 
	 
	 //metodo abstract
	 public abstract void  mostrarInformacion(); 
	 

}
