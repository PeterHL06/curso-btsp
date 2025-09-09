class manejadorDeArchivo {
// Clase con múltiples responsabilidades
    private String nombre;
    private String contenido;

    public manejadorDeArchivo(String nombre, String contenido) {
        this.nombre = nombre;
        this.contenido = contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}

// Interfaz FormatoDePersistencia
interface FormatoDePersistencia {
    public void guardar(manejadorDeArchivo archivo);
}

// Implementación en Texto Plano
class PersistenciaDeTextoPlano implements FormatoDePersistencia {
    @Override
    public void guardar(manejadorDeArchivo archivo) {
        System.out.println("Guardando archivo...");
        System.out.println("Nombre: " + archivo.getNombre());
        System.out.println("Contenido: " + archivo.getContenido());
    }
}


// ===== Clase que usa la abstracción =====
class PersistenciaDeArchivo {
    private FormatoDePersistencia formato;

    // Se inyecta el formato en el constructor
    public PersistenciaDeArchivo(FormatoDePersistencia formato) {
        this.formato = formato;
    }

    public void guardar(manejadorDeArchivo archivo) {
        formato.guardar(archivo);
    }
}

public class sistemaDeArchivos {
    public static void main(String[] args) {
     
        manejadorDeArchivo archivo = new manejadorDeArchivo("archivo.pdf", "Todo el contenido del archivo.");

        PersistenciaDeTextoPlano persistenciaDeTextoPlano = new PersistenciaDeTextoPlano();
        PersistenciaDeArchivo persistenciaDeArchivo = new PersistenciaDeArchivo(persistenciaDeTextoPlano);
        persistenciaDeArchivo.guardar(archivo);

        System.out.println("-----------------------");

    }
}
