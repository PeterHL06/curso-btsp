import java.util.List;
import java.util.stream.Collectors;



public class ManejadorDeCalificaciones {

    // Método para calcular el promedio de todas las calificaciones
    private double calcularPromedio(List<Double> calificaciones) {
        return calificaciones.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);  // Si la lista está vacía, regresa 0
    }

    public double calcularPromedioGeneral(List<Double> calificaciones) {
        return calcularPromedio(calificaciones);
    }

    // Método para calcular el promedio de calificaciones aprobatorias
    public double calcularPromedioAprobatorio(List<Double> calificaciones) {
        return calificaciones.stream()
                .filter(c -> c >= 60)
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    // Funcionalidad no necesaria por ahora
    public String generarReporteDetallado(List<Double> calificaciones) {

        // En realidad, el cliente solo pidió un reporte simple
        return calificaciones.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ", "Calificaciones: ", ""));
    }

    public static void main(String[] args) {
        List<Double> notas = List.of(75.0, 50.0, 90.0, 45.0, 80.0);
        ManejadorDeCalificaciones manejador = new ManejadorDeCalificaciones();

        double promedio = manejador.calcularPromedioAprobatorio(notas);
        System.out.println("El promedio de calificaciones las aprobatorias es: " + promedio);

        double promgral = manejador.calcularPromedioGeneral(notas);
        System.out.println("El promedio general de las calificaciones es: " + promgral);
    }
}

