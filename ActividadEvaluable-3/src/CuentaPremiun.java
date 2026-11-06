
public class CuentaPremiun extends CuentaUsuario implements OperacionesCuentas {
	
	private boolean conAnuncios;

	public CuentaPremiun(String nombreUsuario, String email, String telefono, int edad) throws TelefonoInvalido, EdadInvalida {
		super(nombreUsuario, email, telefono, edad);
		actualizarPerfil(email,telefono);
		this.conAnuncios = false;
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("usuario: " + nombreUsuario);
		System.out.println("tipo: Premium");
		System.out.println("con anuncios " + (conAnuncios ? "si" : "no"));
		
	}

	@Override
	public void actualizarPerfil(String email,String telefono) {
		if (!email.contains("@")) {
			
		}else {
			this.email=email;
			this.telefono=telefono;
			System.out.println("perfil actualizado(Premium)");
		}
		
	}

	@Override
	public void publicarMensaje(String mensaje) {
		System.out.println("mensaje: cuenta premiun sin anuncios" + mensaje);
		
	}
	
	

}
