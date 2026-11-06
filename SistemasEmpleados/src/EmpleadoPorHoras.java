
public class EmpleadoPorHoras extends Empleados {
	
	private int HorasTrabajadas;
	private double PagoHoras;
	
	
	
	public EmpleadoPorHoras(String nombre, String ciudad, int idEmpleado, int horasTrabajadas, double pagoHoras) {
		super(nombre, ciudad, idEmpleado);
		HorasTrabajadas = horasTrabajadas;
		PagoHoras = pagoHoras;
	}
	public double Calculo () {
		return HorasTrabajadas * PagoHoras;
	}


	@Override
	public void CalcularSueldo() {
		// TODO Auto-generated method stub
		
	}




	
	
	

}
