//package clase2;

import java.util.Scanner;

class crearCarros {
    
    //Atributos que definen a los objetos
    int noPuertas, cilindros, maxVelocidad;
    String color;

    //Constructor
    public crearCarros(String color, int noPuertas, int cilindros, int maxVelocidad){

        this.color=color;
        this.noPuertas=noPuertas;
        this.cilindros=cilindros;
        this.maxVelocidad=maxVelocidad;
    }

    //Metodos
    public void encender(){

        System.out.println("Mi carro color "+color+" con "+noPuertas+" puertas esta encendiendo...");
        System.out.println("Ya encendio.\n");
    }
    public void acelerar(){

        System.out.println("Mi carro con "+cilindros+" cilindros esta acelerando a una velocidad maxima de "+maxVelocidad+"\n");
    }
    public void frenar(){

        System.out.println("Mi carro que avanza a una velocidad maxima de "+maxVelocidad+"km/h está frenando\n");
    }

}


public class carros {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Ingresa el color de tu carro: ");
        String color=sc.nextLine();

        System.out.print("Ingresa el número de puertas: ");
        int noPuertas=sc.nextInt();

        System.out.print("Ingresa el cilindraje de tu carro: ");
        int cilindros=sc.nextInt();

        System.out.print("Ingresa la velocidad máxima de tu carro: ");
        int maxVelocidad=sc.nextInt();

        //Instancia
        crearCarros miCarro =new crearCarros(color, noPuertas, cilindros, maxVelocidad);

        int op=5;
        do {
            System.out.println("¿Qué quieres hqacer con tu carro?\n 1. Encender\n 2. Acelerar\n 3. Frenar\n 0. Salir");
            op=sc.nextInt();

            switch (op) {
                case 1:
                    miCarro.encender();                    
                    break;
                case 2:
                    miCarro.acelerar();
                    break;
                case 3:
                    miCarro.frenar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ingrese una opción valida.");
                    break;
            }
            
        } while (op>0);

    }
    
}
