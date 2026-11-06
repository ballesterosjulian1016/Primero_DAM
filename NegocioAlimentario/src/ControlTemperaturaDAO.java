import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ControlTemperaturaDAO {
	
	 // Guardar un nuevo control de temperatura en la base de datos
    public void guardar(ControlTemperatura control) throws SQLException {
        String sql = "INSERT INTO control_temperatura (lote, fecha, valor) VALUES (?, ?, ?)";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, control.getLote());
            stmt.setTimestamp(2, Timestamp.valueOf(control.getFecha()));
            stmt.setDouble(3, control.getValor());

            stmt.executeUpdate();

            // Recuperamos el id que ha generado MySQL automáticamente
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    control.setId(rs.getInt(1));
                }
            }
        }
    }

    // Listar todos los controles de temperatura
    public List<ControlTemperatura> listarTodos() throws SQLException {
        List<ControlTemperatura> lista = new ArrayList<>();
        String sql = "SELECT id, lote, fecha, valor FROM control_temperatura";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                ControlTemperatura control = new ControlTemperatura();
                control.setId(rs.getInt("id"));
                control.setLote(rs.getString("lote"));
                control.setFecha(rs.getTimestamp("fecha").toLocalDateTime());
                control.setValor(rs.getDouble("valor"));
                lista.add(control);
            }
        }

        return lista;
    }
	
	

}
