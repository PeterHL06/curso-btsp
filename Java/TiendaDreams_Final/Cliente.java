import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String correo;
    private List<Venta> ventas;

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.ventas = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
    public List<Venta> getVentas() { return ventas; }

    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    @Override
    public String toString() {
        return nombre + " (" + correo + ")";
    }
}
