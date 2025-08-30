
import java.util.ArrayList;
import java.util.List;

//Clase abstracta Padre
abstract class cuentaBancaria {

    protected  double saldo;

    //Constructor
    public cuentaBancaria(double saldoInicial){
        this.saldo=saldoInicial;
    }

    //Metodo concreto
    public void depositar(double cantidad){

        if(cantidad>0){
            this.saldo += cantidad;
            System.out.println("Deposito de $" + cantidad + " realizado.");
        }else{
            System.out.println("Error: La cantidad no es correcta.");

        }
    }

    //Metodo abstracto
    public  abstract void retirar(double cantidad);

    //Metodo abstracto
    public  abstract void calcularSaldoFinal();

    public double getSaldo(){
        return this.saldo;
    }
}

class CuentaDeAhorro extends cuentaBancaria{

    private final double tasaDeInteres=0.02;
    public CuentaDeAhorro(double saldoInicial){
        super(saldoInicial);
    }

    @Override
    public void retirar (double cantidad){
        if(cantidad>0 && this.saldo-cantidad >=0){
            this.saldo=this.saldo-cantidad;
            System.out.println("Retiro de $" + cantidad + " realizada con éxito.");
        }else{
            System.out.println("Error: Saldo insuficiente.");     
        }
    }

    @Override
    public void calcularSaldoFinal(){
        this.saldo+=this.saldo*tasaDeInteres;
        System.out.println("Intereses de $" + (this.saldo*tasaDeInteres) + " aplicados.");
    }
}

class cuentaCorriente extends cuentaBancaria {

    private final double comisionMensual = 5.0; //Atributos

    public cuentaCorriente(double saldoInicial){
        super(saldoInicial);
    }

    @Override
    public void retirar(double cantidad){
        if(cantidad>0 && this.saldo-cantidad>=0){
            this.saldo-=cantidad;
            System.out.println("Retiro de $" + cantidad + " realizado de forma exitosa.");
        }else{
            System.out.println("Error: Saldo insuficiente.");
        }
    }

    @Override
    public void calcularSaldoFinal(){
        this.saldo-=comisionMensual;
        System.out.println("Comisión de $" + comisionMensual + " deducida.");
    }

}

public class cuentasBanco {
    public static void main(String[] args) {

        List<cuentaBancaria> cuentas = new ArrayList<>();

        cuentas.add(new CuentaDeAhorro(500.0));
        cuentas.add(new cuentaCorriente(200.0));

        //Iterar -- recorrer
        for(cuentaBancaria cuenta : cuentas){
            System.out.println("\n--Saldo inicial: $" + cuenta.getSaldo());

            cuenta.depositar(100.0);

            //Llamar Metodos abstractos

            cuenta.calcularSaldoFinal();
            System.out.println("Saldo final: $" + cuenta.getSaldo());
        }
    }
}