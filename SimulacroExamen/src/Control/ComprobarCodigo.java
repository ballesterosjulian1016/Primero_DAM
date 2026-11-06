package Control;

public class ComprobarCodigo {
	
	public void verificar(String codigoPostal)throws ExcepcionPropia {
			if (codigoPostal == null || codigoPostal.length()!=5) {
				throw new ExcepcionPropia(" el codigo postal debe tener 5 digitos");
			}
			System.out.println("CP: " + codigoPostal + " validacion con exito");
	}
	
}
	
	

