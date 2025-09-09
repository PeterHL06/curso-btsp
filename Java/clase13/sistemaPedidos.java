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

class Pedido{}

class Facturador{
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

class NotificadorPorSMS implements ServicioDeNotificacion {

    @Override
    public void notificar(Pedido pedido){
        System.out.println("El cliente ha sido notificado por SMS.");
    }
    
}

class procesadorDePedidos {
    private final Facturador facturador;
    private final Enviador enviador;
    private final ServicioDeNotificacion notificador;

    public procesadorDePedidos(Facturador facturador, Enviador enviador, ServicioDeNotificacion notificador){
        this.facturador=facturador;
        this.enviador=enviador;
        this.notificador=notificador;
        }

    public void procesar(Pedido pedido){
        facturador.facturar(pedido);
        enviador.Enviar(pedido);
        notificador.notificar(pedido);
    }
}

public class sistemaPedidos {
    
    public static void main(String[] args) {
        Pedido pedido=new Pedido();

        Facturador facturador=new Facturador();
        Enviador enviador=new Enviador();

        ServicioDeNotificacion notificadorEmail = new NotificadorPorEmail();
        ServicioDeNotificacion notificadorSMS = new NotificadorPorSMS();

        procesadorDePedidos procesador1 =new procesadorDePedidos(facturador, enviador, notificadorEmail);
        procesador1.procesar(pedido);
        
        System.out.println("---------");

        procesadorDePedidos procesador2 = new procesadorDePedidos(facturador, enviador, notificadorSMS);
        procesador2.procesar(pedido);

    }
}
