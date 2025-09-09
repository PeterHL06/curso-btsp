package Java.clase15.empresa.gestion;
import Java.clase15.empresa.core.Empleado;

public class Gestor {

    public void asignarSalario(Empleado empleado, int nuevoSalario) {

        // ERROR DE COMPILACIÓN: Intenta acceder al salario directamente

        Empleado.setSalario(nuevoSalario);

    }

}