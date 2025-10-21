package SistemaNotificaciones.strategy;

public class EmailNotificationStrategy implements NotificacionStrategy {
    @Override
    public void send(String message, String destinatario){
        System.out.println("📨Enviando Email a :" +destinatario);
        System.out.println("Mensaje: "+message);
        System.out.println("----------------------------------");

    }
}
