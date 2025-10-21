package SistemaNotificaciones;

import SistemaNotificaciones.strategy.NotificacionStrategy;

public class NotificationService {
    private static NotificationService instance;
    private NotificacionStrategy strategy;

    private NotificationService(){}
    public static NotificationService getInstance(){

        if (instance==null) {

            instance = new NotificationService();
        }
        return instance;
    }

    public void setStrategy(NotificacionStrategy strategy){
            this.strategy=strategy;
    }

    public void sendNotification(String message, String destination){

        if(strategy==null){
            System.out.println("Error:Porfavor, establece una estrategia de envio");
            return;
        }
        strategy.send(message, destination);
    }
}
