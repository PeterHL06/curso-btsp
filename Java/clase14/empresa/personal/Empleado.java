public class Empleado {

    //Atributo privado
    private String salario;

    //Atributo Default
    String departamento;

    //Atributo Protect
    protected String puesto;

    //Atributo publico
    public String nombre;

    public Empleado(String nombre, String salario, String departamento, String puesto){

    //Constructor

    this.nombre=nombre;
    this.salario=salario;
    this.departamento=departamento;
    this.puesto=puesto;
    
    }

    //Metodo

    public String getNombre(){
        return nombre;
    }

    private double CalcularBonificacion(){
        return 1000.00;
    }

    public void imprimirDetallesDeSalario(){
        System.out.println("El salario de "+this.nombre+" es: "+this.salario);
        System.out.println("Bonificacion calculada: "+this.CalcularBonificacion());
    }

}