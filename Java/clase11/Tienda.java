
import java.util.ArrayList;
import java.util.List;

public class Tienda {

    public void vender(Producto producto, int cantidad, String cliente){
        //1. Revisar stock del producto
            if (producto.stock <=  cantidad){
                System.err.println("Sola hay " + producto.stock + " unidades disponibles.");
            } else {

            }
        //2. Sí hay stock suficiente => crear venta
            // 
    }


}
