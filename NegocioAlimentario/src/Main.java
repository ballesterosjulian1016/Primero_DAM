import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		 ControlTemperaturaDAO dao = new ControlTemperaturaDAO();

	        try {
	            // 1. Creamos un control de temperatura de prueba
	            ControlTemperatura nuevo = new ControlTemperatura("LOTE-001", LocalDateTime.now(), 4.5);

	            // 2. Lo guardamos en la base de datos
	            dao.guardar(nuevo);
	            System.out.println("Guardado con éxito. Id asignado: " + nuevo.getId());

	            // 3. Consultamos todos los controles guardados
	            List<ControlTemperatura> lista = dao.listarTodos();
	            System.out.println("Controles de temperatura en la base de datos:");
	            for (ControlTemperatura c : lista) {
	                System.out.println(c);
	            }

	        } catch (SQLException e) {
	            System.out.println("Error al conectar o trabajar con la base de datos:");
	            e.printStackTrace();
	        }
	    }
	}


