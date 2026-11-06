
import java.io.*;
import java.util.*;
public class ControlArchivos {
	
	File rutaFichero = new File ("src/mi_fichero.txt");
	
	
	public void crearFichero() {
		try {
			if(!rutaFichero.exists()) {
				rutaFichero.createNewFile();
				System.out.println("Creando Fichero");
			}else {
				System.out.println("Guardando Datos");
			}
		}catch(IOException e){
			System.out.println("ERROR AL CREAR EL FICHERO");
		}
	}
	
	
	public void guardarDatos(ArrayList<CuentaUsuario> listaUsuarios) {
		crearFichero();
		try(FileWriter fw = new FileWriter(rutaFichero,true);
			BufferedWriter bw = new BufferedWriter(fw);) 
		{
			for (CuentaUsuario cuentaUsuario : listaUsuarios) {
				String tipoCuenta;
				String nombreUsuario = cuentaUsuario.getNombreUsuario();
				String email = cuentaUsuario.getEmail();
				String telefono = cuentaUsuario.getTelefono();
				String edad = String.valueOf(cuentaUsuario.getEdad());
				if(cuentaUsuario instanceof CuentaBasica newBasica) {
					tipoCuenta = "CuentaBasica";
					bw.write(tipoCuenta+","+nombreUsuario+","+ email+","+telefono+","+edad + "\n");
					
				} 
				if(cuentaUsuario instanceof CuentaPremiun newPremium) {
					tipoCuenta = "CuentaPremiun";
					bw.write(tipoCuenta+","+nombreUsuario+","+ email+","+telefono+","+edad + "\n");
				}
			}
		} catch (IOException e) {
			System.out.println("Error al guardar los datos");
		}
	}
	
	public void mostrarDatos() {
		try(FileReader fr = new FileReader(rutaFichero);
			BufferedReader br = new BufferedReader(fr)){
			String linea;
			
			while((linea = br.readLine())!= null) {
				
				String [] partes = linea.split(",",-1);
				
				String tipoCuenta = partes[0];
				String nombre = partes[1];
				String email = partes[2];
				String telefono = partes[3];
				String edad = partes[4];
				
				System.out.println(tipoCuenta + "NOMBRE: " + nombre +"EMAIL: " + email + "TELEFONO: " + telefono + "EDAD: " + edad + "\n");
				
			}
			
		} catch (IOException e) {
			System.out.println("Error al leer los datos");
		}
	}
}
