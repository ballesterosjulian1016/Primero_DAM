
public class Leon extends Animal {
	protected String gruñe;

	public Leon(String domestico, String salvaje, String gruñe) {
		super(domestico, salvaje);
		this.gruñe = gruñe;
	}




	@Override
	public String mostrarSonido() {
		
		return salvaje;
	}




	@Override
	public void mostrarInfomracion() {
		System.out.println("domestico " + domestico);
		System.out.println("salvaje " + salvaje);
		System.out.println("sonido " + gruñe);
		
	}
	

}
