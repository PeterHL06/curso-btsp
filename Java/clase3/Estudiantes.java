//package clase3;

import java.util.Scanner;

class CrearEstudiantes {
    
    //Atributos que definen a los objetos
    String nombre;
    int edad;
    double prom;

    //Constructor
    public CrearEstudiantes(String nombre, int edad, double prom){

        this.nombre = nombre;
        this.edad = edad;
        this.prom = prom;
    }

    //Metodos
    public void mostrarInformacion(){

        System.out.println("El nombre de estudiante es " + nombre + " tiene " + edad + " años y su promedio es " + prom);
    }
}
public class Estudiantes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa la edad del estudiante: ");
        int edad = sc.nextInt();

        System.out.print("Ingresa el promedio del estudiante: ");
        double prom = sc.nextDouble();

        //Instancia
        CrearEstudiantes miEstudiante = new CrearEstudiantes(nombre, edad, prom);
        miEstudiante.mostrarInformacion();
        
        sc.close();
    }
}
