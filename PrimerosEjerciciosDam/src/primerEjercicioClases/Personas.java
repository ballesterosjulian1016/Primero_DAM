package primerEjercicioClases;

public class Personas {
	
	
	protected final char SEXO = 'H';
	protected final int PESO_BAJO = -1;
	protected final int PESO_NORMAL = 0;
	protected final int SOBREPESO= 1;
	
	// atributos
	protected String  nombre,DNI;
	protected char sexo;
	protected double altura,peso;
	protected int edad;
	
	// constructores
	protected Personas() {
		
	}


	protected Personas(String nombre, char sexo, int edad) {
		
		this.nombre = nombre;
		this.sexo = SEXO;
		this.edad = edad;
		
	}


	protected Personas(String nombre, String dNI, char sexo, double altura, double peso, int edad) {
		
		this.nombre = nombre;
		DNI = dNI;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
		this.edad = edad;
	}


	protected String getNombre() {
		return nombre;
	}


	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	protected char getSexo() {
		return sexo;
	}


	protected void setSexo(char sexo) {
		this.sexo = sexo;
	}


	protected double getAltura() {
		return altura;
	}


	protected void setAltura(double altura) {
		this.altura = altura;
	}


	protected double getPeso() {
		return peso;
	}


	protected void setPeso(double peso) {
		this.peso = peso;
	}


	protected int getEdad() {
		return edad;
	}


	protected void setEdad(int edad) {
		this.edad = edad;
	}


	
	
	
	
	
}
