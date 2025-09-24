package SistemaNotificaciones;

import SistemaNotificaciones.decorator.Notificacion;
import SistemaNotificaciones.decorator.PriorityDecorator;
import SistemaNotificaciones.decorator.SimpleNotification;
import SistemaNotificaciones.decorator.TimestampDecorator;
import SistemaNotificaciones.strategy.EmailNotificationStrategy;
import SistemaNotificaciones.strategy.SmsNotifcationStretegy;

public class Main {
    public static void main(String[] args) {
        System.out.println("🛫Iniciando Sistema de Notificaciones🛫\n");

        NotificationService notificationService =NotificationService.getInstance();

        System.out.println("Verificando Singlenton...");
        NotificationService anotherInstance = NotificationService.getInstance();
        System.out.println("¿Ambas instancias son iguales?"+(notificationService==anotherInstance)+"\n");

        System.out.println("---Probando decoradores---\n");
        Notificacion simple = new SimpleNotification("Tu pedido #4s55 ha sido confirmado");
        Notificacion timed = new TimestampDecorator(simple);
        Notificacion urgentTimed= new TimestampDecorator(
            
        new PriorityDecorator(new SimpleNotification("Alerta de seguridad: inicio de sesion inusual detectado")  )
        );
        System.out.println("Notificacion simple: "+simple.getContent());
        System.out.println("Notificacion con timepo: "+timed.getContent());
        System.out.println("Notificacion urgente con tiempo: "+urgentTimed.getContent());
        System.out.println("\n ---Fin de la prueba decoradores--- \n");
        
        System.out.println("---Probando Estrategias de envio---\n");
        notificationService.setStrategy(new EmailNotificationStrategy());
        notificationService.sendNotification(timed.getContent(), "cliente@example.com");

        notificationService.setStrategy(new SmsNotifcationStretegy());
        notificationService.sendNotification(urgentTimed.getContent(), "+525598784532");

    }
    
}
