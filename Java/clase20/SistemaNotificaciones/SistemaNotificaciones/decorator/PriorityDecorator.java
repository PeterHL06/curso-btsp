package SistemaNotificaciones.decorator;

public class PriorityDecorator implements Notificacion {
    protected Notificacion wrappedNotificacion;

    public PriorityDecorator(Notificacion notificacion){
        this.wrappedNotificacion=notificacion;
    }

    @Override
    public String getContent(){
        return "[URGENTE]" + wrappedNotificacion.getContent();
    }
    
}
