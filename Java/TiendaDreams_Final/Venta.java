import java.util.ArrayList;
import java.util.List;

public class Venta {
    private Cliente cliente;
    private List<Producto> productos;
    private double total;

    public Venta(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0.0;
        cliente.agregarVenta(this);
    }

    public Cliente getCliente() { return cliente; }
    public List<Producto> getProductos() { return productos; }

    public void agregarProducto(Producto p, int cantidad) {
        if (p.getStock() >= cantidad) {
            p.disminuirStock(cantidad);
            for (int i = 0; i < cantidad; i++) {
                productos.add(p);
            }
        } else {
            System.out.println("❌ Stock insuficiente para " + p.getNombre());
        }
    }

    public void calcularTotal() {
        total = productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public void mostrarFactura() {
        System.out.println("\n=== Factura ===");
        System.out.println("Cliente: " + cliente);
        for (Producto p : productos) {
            System.out.println("- " + p.getNombre() + " $" + p.getPrecio());
        }
        System.out.println("Total: $" + total);
        System.out.println("===============");
    }
}
