package Interface;
import Model.*;

public interface GestionTablets {
	void darAltaTablet(Producto pro);
	void darAltaCliente(Persona p);
	void venderTablet( int idVenta,Persona p,Producto pro);
	void mostrarStock();
	void historialCliente(Persona p);

}
