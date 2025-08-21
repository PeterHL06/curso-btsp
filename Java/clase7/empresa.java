

class Empleado{//Superclase
    protected String nombreEmpleado;
    protected int idEmpleado;
    protected double salarioBase;

    public Empleado(String nombreEmpleado, int idEmpleado, double salarioBase){
        this.nombreEmpleado=nombreEmpleado;
        this.idEmpleado=idEmpleado;
        this.salarioBase=salarioBase;
    }

    public void mostrarInformacion(){
        System.out.println("Datos del Empleado");
        System.out.println("Nombre: "+this.nombreEmpleado);
        System.out.println("idEmpleado: "+this.idEmpleado);
    }
}

class Desarrollador extends Empleado {//Clase hija

    private String lenguajePrincipal;
    public Desarrollador(String nombreEmpleado, int idEmpleado, double salarioBase, String lenguajePrincipal){

        super(nombreEmpleado, idEmpleado, salarioBase);
        this.lenguajePrincipal=lenguajePrincipal;
        //System.out.println("Creado con rol de administrador");
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("lenguajePrincipal: "+this.lenguajePrincipal);
        //System.out.println("Accesos: Gestion de usuarios y reportes");

    }
}

class Gerente extends Empleado{//Segunda Clase hija

    private String departamento;
    public Gerente(String nombreEmpleado, int idEmpleado, double salarioBase, String departamento){

        super(nombreEmpleado, idEmpleado, salarioBase);
        this.departamento=departamento;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Departamento: "+this.departamento);
    }
}



public class empresa {

    public static void main(String[] args) {
        Empleado Desarrollador = new Desarrollador("PeterHL",60,15660.5,"Español");
        System.out.println("\n--Informacion del Empleado--");
        Desarrollador.mostrarInformacion();

        Empleado Gerente = new Gerente("CristinaCA",24,60500.6,"TIC");
        System.out.println("\n--Información del Gerente--");
        Gerente.mostrarInformacion();

        //System.out.println("--Información del Empleado--");
        //cliente.mostrarInformacion();
    }
}