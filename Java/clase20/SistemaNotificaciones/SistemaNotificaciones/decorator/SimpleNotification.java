package SistemaNotificaciones.decorator;

public class SimpleNotification implements Notificacion {
    private String message;

    public SimpleNotification(String message){
        this.message=message;
    }
    @Override
    public String getContent(){
        return message;
    }

}

