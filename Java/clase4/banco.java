
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
import javax.print.attribute.standard.MultipleDocumentHandling;

class CuentaBancaria {

    private double saldo = 0.0;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {

        if (cantidad>0) {
            saldo+=cantidad;
            System.out.println("Deposito existoso. Nuevo saldo: $"+saldo);
        }else{
            System.out.println("Error: La cantidad a depositar debe ser positia o mayor a cero.");
        }
    }

    public void retirar(double cantidad){//Metodo set retirar

        if (cantidad>0 && cantidad<=saldo) {
            saldo=saldo-cantidad;
            System.out.println("Retiro existoso. Nuevo saldo: $"+saldo);
        }else{
            System.out.println("Error: Saldo insuficiente o cantidad invalida");
        }
    }
}

public class banco {//Clase principal

    public static void main(String[] args) {
        CuentaBancaria miCuenta= new CuentaBancaria();
        System.out.println("Saldo inicial: $"+miCuenta.getSaldo());
        Scanner sc =new
    }
    int saldo = 0;

while(salida==0) {
    System.out.println("¿Qué deseas hacer?\n1.Hacer un retiro \n2.Hacer un depósito \n3.Ver saldo actual \nTeclee cualquier otro numero para salir");
    int op=sc.nextInt();
    double cantidad;

    switch (op) {
        case 1:
                System.out.println("¿Qué cantidad quieres retirar?");
                cantidad=sc.nextDouble();

                miCuenta.retirar(cantidad);

            break;
        case 2:
                System.out.println("¿Qué cantidad quieres depositar?");
                cantidad=sc.nextDouble();
                miCuenta.depositar(cantidad);           
            break;
        case 3:
                System.out.println("¿Qué cantidad quieres retirar?");
                cantidad=sc.nextDouble();
                miCuenta.depositar(cantidad);
            break;
        default:
            throw new AssertionError();
    }
}

}
