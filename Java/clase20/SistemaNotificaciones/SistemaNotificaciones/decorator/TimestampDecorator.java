package SistemaNotificaciones.decorator;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampDecorator implements Notificacion{

    protected Notificacion wrappedNotification;

    public TimestampDecorator(Notificacion notificacion){
        this.wrappedNotification=notificacion;
    }
    @Override
    public String getContent(){
        String timestamp=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return "[" + timestamp+ " ]" +wrappedNotification.getContent();
    }

}