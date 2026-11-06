
public abstract class Animal implements Sonidos {
	protected String domestico,salvaje;

	public Animal(String domestico, String salvaje) {
		
		this.domestico = domestico;
		this.salvaje = salvaje;
	}

	public String getDomestico() {
		return domestico;
	}

	public void setDomestico(String domestico) {
		this.domestico = domestico;
	}

	public String getSalvaje() {
		return salvaje;
	}

	public void setSalvaje(String salvaje) {
		this.salvaje = salvaje;
	}
	
	
	public abstract void mostrarInfomracion();

	
		
	
	
	

}
