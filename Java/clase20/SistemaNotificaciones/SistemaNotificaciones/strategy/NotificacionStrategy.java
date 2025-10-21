package SistemaNotificaciones.strategy;

public interface NotificacionStrategy {
    void send(String message, String destinatario);
}
