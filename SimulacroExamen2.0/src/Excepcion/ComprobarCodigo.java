package Excepcion;

public class ComprobarCodigo {
	
	public void verificar(String CodigoPostal)throws ExcepcionPropia {
		if(CodigoPostal == null || CodigoPostal.length()!=5) {
			throw new ExcepcionPropia("el codigo postal debe de ser de 5 digitos");
		}
		System.out.println("cp:" + CodigoPostal + " validacion con exito");
	}
	
	

}
