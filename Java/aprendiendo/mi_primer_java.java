import java.util.Scanner;

public class mi_primer_java {
    public static void main(String[] args) {

        int numero, edad;
        String nombre, apellido;
        double precio=19.99, n;
        boolean resp=true;


        Scanner s= new Scanner(System.in);

        System.out.print("Dime tu nombre: ");
        nombre = s.nextLine();
        System.out.print("Dime tu apellido: ");
        apellido = s.nextLine();
        System.out.print("Dime tu edad: ");
        edad = s.nextInt();
        System.out.print("Dime tu número favorito: ");
        numero = s.nextInt();

        System.out.println("¡Hola, mundo!");
        System.out.println(precio);
        System.out.println(!resp);
        System.out.println("Hola me llamo "+nombre+" "+apellido+" tengo "+edad+" años y mi número favorito es "+numero);
    }
}

