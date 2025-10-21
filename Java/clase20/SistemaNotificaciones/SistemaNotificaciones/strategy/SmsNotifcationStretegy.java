package SistemaNotificaciones.strategy;

public class SmsNotifcationStretegy implements NotificacionStrategy{
    @Override
    public void send(String message, String destinatario){
        System.out.println("📱Enviando SMS a :" +destinatario);
        System.out.println("Mensaje: "+message);
        System.out.println("----------------------------------");

    }
}
