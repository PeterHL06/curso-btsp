abstract class Notifificacion {

    protected String destinatario;
    protected String mensaje;

    //Constructor
    public Notificacion(String destinatario, String mensaje){
        this.destinatario=destinatario;
        this.mensaje=mensaje;
    }

    //Metodo
    public abstract void envio();


}

class Email extends Notificacion{
    public Email(String destinatario, String mensaje){
        super(destinatario, mensaje);
    }
    @Override
    public void envio(){
        System.out.println("Enviando Email a: "+destinatario);
        System.out.println("Mensaje: "+mensaje);
    }
}

public class sistemaNotificaciones {
    public static void main(String[] args) {
        
    }
}