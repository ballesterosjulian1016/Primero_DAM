
public class EmpleadoTiempoCompleto extends Empleados {
	
	private double SalarioMensual;

	public EmpleadoTiempoCompleto(String nombre, String ciudad, int idEmpleado, double salarioMensual) {
		super(nombre, ciudad, idEmpleado);
		SalarioMensual = salarioMensual;
	}

	public double Calculo () {
		return SalarioMensual;
	}
	
	@Override
	public void CalcularSueldo() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	

	
	
	


	
	

}
