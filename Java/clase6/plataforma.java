class Usuarios{//Superclase
    protected String nombreUsuario;
    protected String email;

    public Usuarios(String nombreUsuario, String email){
        this.nombreUsuario=nombreUsuario;
        this.email=email;
    }
    public void iniciarSesion(){
        System.out.println("El usuario "+this.nombreUsuario+ " ha sido iniciado sesión");
    }

    public void mostrarInformacion(){
        System.out.println("Tipo de usuario: Generico");
        System.out.println("Nombre: "+this.nombreUsuario);
        System.out.println("Email: "+this.email);
    }
}

class Administradores extends Usuarios {//Clase hija

    private String rol;
    public Administradores(String nombreUsuario, String email, String rol){

        super(nombreUsuario, email);
        this.rol=rol;
        System.out.println("Creado con rol de administrador");
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Rol: "+this.rol);
        System.out.println("Accesos: Gestion de usuarios y reportes");

    }
}

class Clientes extends Usuarios {//Segunda clase hija
    private String direccionDeEnvio;

    public Clientes(String nombreUsuario, String email, String direccionEnvio){
        super(nombreUsuario, email);
        this.direccionDeEnvio=direccionEnvio;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();;
        System.out.println("Direccion de envio: "+direccionDeEnvio);
        System.out.println("Accesos: Realizar compras y ver historial de compras.");
    }

}

public class plataforma {//Clase principal
    public static void main(String[] args) {
        Usuarios admin = new Administradores("AdminPeter","admin.peter@gmail.com","Super Admin");
        Usuarios cliente= new Clientes("PedroClientes","pedro.cliente@gmail.com", "Adueducto 1514");
        Usuarios usuario= new Usuarios("cliente generico","cliente.generico@gmail.com");
        System.out.println("--Informacion del Administrador--");
        admin.mostrarInformacion();

        System.out.println("--Información del cliente--");
        cliente.mostrarInformacion();
    }
}