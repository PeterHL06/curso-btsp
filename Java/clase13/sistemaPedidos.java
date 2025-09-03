package Java.clase13;

/*class procesadorDePedidos{
    public void procesadorDePedidos(Pedido pedido){
        //Logica de facturación
        System.out.println("Pedido facturado.");
        //Logica de envio
        System.out.println("Pedido enviado por paqueteria.");
        //Logica de notificacion
        System.out.println("El cliente ha sido notificado por email.");
    }
}*/

public class Facturador{
    public void facturar(Pedido pedido){
        //Todo el codigo de la logica de facturación
        System.out.println("Pedido Facturado.");
    }  
}
class Enviador{

    public void Enviar(Pedido pedido){
        //Todo el codigo de la logica de envio
        System.out.println("Pedido enviado por paqueteria.");
    }
}

/* class Notificador{

    public void Notificar(Pedido pedido){
        //Todo el codigo de la logica de notificación
        System.out.println("El cliente ha sido notificado por email.");
    }
} */

interface ServicioDeNotificacion {

    void notificar(Pedido pedido);    
}

class NotificadorPorEmail implements ServicioDeNotificacion {

    @Override
    public void notificar(Pedido pedido){
        System.out.println("El cliente ha sido notificado por email.");
    }
}

public class NotificadorPorSMS implements ServicioDeNotificacion {

    @Override
    public void notificar(Pedido pedido){
        System.out.println("El cliente ha sido notificado por SMS.");
    }
    
}

class procesadorDePedidos {
    private final facturador facturador;
    private final Enviador enviador;

    
}

public class sistemaPedidos {
    
    public static void main(String[] args) {
        
    }
}
