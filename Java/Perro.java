public class Perro {
    //Atributos
    String nombre;
    String raza;
    int edad;

    //Constructor (con argumentos)
    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre; // 'this' se refiere al objeto actual
        this.raza = raza;
        this.edad = edad;
    }

    //Metodo para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        //Creacion de un objeto Perro usando el constructor
        Perro miPerro = new Perro("Lia", "Cocker",13);
        miPerro.mostrarInformacion(); // Muestra la informacion del perro
    }
}