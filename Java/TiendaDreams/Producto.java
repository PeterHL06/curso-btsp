import java.text.DecimalFormat;

public class Producto {
    private String nombre;
    private double precio;
    private String categoria;
    private int stock;

    public Producto(String nombre, double precio, String categoria, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public String getCategoria() { return categoria; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public void disminuirStock(int cantidad) {
        if (stock >= cantidad) stock -= cantidad;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#0.00");
        return nombre + " | $" + df.format(precio) + " | Stock: " + stock;
    }
}
