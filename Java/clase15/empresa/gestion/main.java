package Java.clase15.empresa.gestion;

public class main {

    public static void main(String[] args) {
        Gestor Luis = new Gestor();
        empleado Gerardo = new empleado("Gerardo",1500);

        System.out.println("--Saldo inicial empleado--");
        Gerardo.imprimirInfo();

        //Luis fue autorizado para hacer un aumento
        Luis.asignarSalario(Gerardo, 2000);
    }
    
}
