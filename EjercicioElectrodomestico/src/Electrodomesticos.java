/*
 * 
Los métodos que implementara serán:
Métodos get de todos los atributos.
comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra por defecto. Se invocara al crear el objeto y no sera visible.
comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por defecto. Se invocara al crear el objeto y no sera visible.
precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista de precios:
 */
public class Electrodomesticos {
	
	protected double precio_base,peso;
	protected String color;
	protected char consumo_energetico;
	protected final double PRECIOBASE=100, PESO=5;
	protected final String COLOR="blanco";
	protected final char CONSUMOENERGETICO='F';
	
	
	public Electrodomesticos() {
		color= COLOR;
		consumo_energetico = CONSUMOENERGETICO;
		precio_base = PRECIOBASE;
		peso = PESO;
			
		
	}


	public Electrodomesticos(double precio_base, double peso) {
		this.precio_base = precio_base;
		this.peso = peso;
		color= COLOR;
		consumo_energetico = CONSUMOENERGETICO;
	}


	public Electrodomesticos(double precio_base, double peso, String color, char consumo_energetico) {
		this.precio_base = precio_base;
		this.peso = peso;
		this.color = color;
		comprobarConsumoEnergetico(consumo_energetico);
	}


	public double getPrecio_base() {
		return precio_base;
	}


	public double getPeso() {
		return peso;
	}


	public String getColor() {
		return color;
	}


	public char getConsumo_energetico() {
		return consumo_energetico;
	}
	
	private void comprobarConsumoEnergetico(char letra) {
		switch(letra) {
		case 'A': this.consumo_energetico='A';
		break;
		case 'B': this.consumo_energetico='B';
		break;
		case 'C': this.consumo_energetico='C';
		break;
		case 'D': this.consumo_energetico='D';
		break;
		case 'E': this.consumo_energetico='E';
		break;
		case 'F': this.consumo_energetico='F';
		break;
		default: this.consumo_energetico='F';
		}
	}
	
	private void comprobarColor(String color) {
		
	}

}
