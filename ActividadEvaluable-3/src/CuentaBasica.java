
public class CuentaBasica extends CuentaUsuario implements OperacionesCuentas {
	
	private boolean conAnuncios;

	public CuentaBasica(String nombreUsuario, String email, String telefono, int edad)throws TelefonoInvalido, EdadInvalida {
		super(nombreUsuario, email, telefono, edad);
		this.conAnuncios = true;
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("usuario: " + nombreUsuario);
		System.out.println("tipo:basica");
		System.out.println("con anuncios " + (conAnuncios ? "si" : "no"));		
	}

	@Override
	public void actualizarPerfil(String email, String telefono) {
		this.email=email;
		this.telefono=telefono;
		System.out.println("perfil actualizado(basica)");
	}

	@Override
	public void publicarMensaje(String mensaje) {
		if (mensaje.length()>20) {
			System.out.println("error: maximo 20 caracteres");
		}else {
			System.out.println("mensaje : " + mensaje);
		}
		
	}
	
	
	

}
