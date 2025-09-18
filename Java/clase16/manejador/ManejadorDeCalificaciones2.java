import java.util.List;
import java.util.stream.Collectors;



public class ManejadorDeCalificaciones2 {

    // Método para calcular el promedio de todas las calificaciones
    public double calcularPromedioGeneral(List<Double> calificaciones) {

        double suma = 0;

        for (Double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.size();
    }

    // Método para calcular el promedio de calificaciones aprobatorias
    public double calcularPromedioAprobatorio(List<Double> calificaciones) {

        double suma = 0;
        int contador = 0;

        for (Double calificacion : calificaciones) {

            if (calificacion >= 60) {
                suma += calificacion;
                contador++;
            }
        }

        if (contador > 0) {
            return suma / contador;
        }
        return 0;
    }

    // Funcionalidad no necesaria por ahora
    public String generarReporteDetallado(List<Double> calificaciones) {

        // En realidad, el cliente solo pidió un reporte simple
        return calificaciones.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ", "Calificaciones: ", ""));
    }
}

