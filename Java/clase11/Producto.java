public class Producto {
    String nombre, categoria;
    Double precio;
    int stock;

    public Producto(String n, String c, double p, int s){
        this.nombre = n;
        this.categoria = c;
        this.precio = p;
        this.stock = s;
    }

    public void mostrarDetalles(){
        System.out.println(this.nombre +"\n"+ this.categoria +"\n"+ this.precio +"\n"+ this.stock);
    }

    public void actualizarStock(int s){
        // el parametro s puede ser positivo o negativo (añadir o eliminar stock)
        this.stock = this.stock + s;
    }

    public int getStock(){
        return this.stock;
    }

}

