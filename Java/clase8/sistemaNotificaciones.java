import java.util.ArrayList;
import java.util.List;

abstract class Notificacion {

    protected String destinatario;
    protected String mensaje;

    //Constructor
    public Notificacion(String destinatario, String mensaje){
        this.destinatario=destinatario;
        this.mensaje=mensaje;
    }

    //Metodo abstracto
    public abstract void envio();


}

class Email extends Notificacion{
    public Email(String destinatario, String mensaje){
        super(destinatario, mensaje);
    }

    @Override //Sobreescritura
    public void envio(){
        System.out.println("Enviando Email a: "+destinatario);
        System.out.println("Mensaje: "+mensaje);
    }
}

class SMS extends Notificacion{
    public SMS(String destinatario, String mensaje){

        super(destinatario, mensaje);

    }

    @Override
    public void envio(){
        System.out.println("Enviando SMS a: "+destinatario);
        System.out.println("Mensaje: "+mensaje);
    }
}

class Push extends Notificacion{
    public Push(String destinatario, String mensaje){

        super(destinatario, mensaje);

    }

    @Override
    public void envio(){
        System.out.println("Enviando notificación Push a: "+destinatario);
        System.out.println("Mensaje: "+mensaje);
    }
}

public class sistemaNotificaciones {
    public static void main(String[] args) {

        List<Notificacion> listaNotificaciones = new ArrayList<>(); //Objeto a partir de clase padre

        //Añadir elementos a la lista usando las clases hijas
        System.out.print("\n");
        listaNotificaciones.add(new Email("pedro.hurtado@gmail.com", "Su pedido está en camino"));
        listaNotificaciones.add(new SMS("443-184-97-44", "Tu código de seguridad es: 281084"));
        listaNotificaciones.add(new Push("usuario_PHL06", "Hay nuevo articulos que te pueden gustar"));
        
        //Iterar la lista
        for (Notificacion noti: listaNotificaciones){
            noti.envio();
            System.out.println("------");
            System.out.print("\n");            
        }
    }
}