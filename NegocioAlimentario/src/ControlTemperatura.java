
import java.time.LocalDateTime;

public class ControlTemperatura {
	
	private int id;
    private String lote;
    private LocalDateTime fecha;
    private double valor;

    // Constructor vacío
    public ControlTemperatura() {
    }

    // Constructor con los datos (sin id, porque lo genera la base de datos)
    public ControlTemperatura(String lote, LocalDateTime fecha, double valor) {
        this.lote = lote;
        this.fecha = fecha;
        this.valor = valor;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ControlTemperatura [id=" + id + ", lote=" + lote + ", fecha=" + fecha + ", valor=" + valor + "]";
    }

}
