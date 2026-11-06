
public class Perro extends Animal {
	protected String ladra;

	public Perro(String domestico, String salvaje, String ladra) {
		super(domestico, salvaje);
		this.ladra = ladra;
	}

	@Override
	public void mostrarInfomracion() {
		System.out.println("domestico " + domestico);
		System.out.println("salvaje " + salvaje);
		System.out.println("sonido " + ladra);
	}

	@Override
	public String mostrarSonido() {
		
		return domestico;
	}
	
	
	

}
