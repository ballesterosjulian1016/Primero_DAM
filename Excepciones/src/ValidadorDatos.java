
public class ValidadorDatos {
	
	public  void ValidarTexto(String texto) throws TextoInvalido{
		
		if (texto.equals("")) {
			throw new TextoInvalido ("el campo no puede estar vacio");
		}
		boolean espacios = true;
		 for(int i = 0;i < texto.length(); i++) {
			 if (texto.charAt(i) != ' ') {
				 espacios = false;
				 break;
			 }
		 }
		if(espacios) {
			throw new TextoInvalido (" no se permite solo espacios");
			
		}
		
		
	}
	

}
	


