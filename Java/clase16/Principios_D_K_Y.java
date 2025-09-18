

//Objetivo:Una clase para manejar notificaciones por correo electrónico. 

class gestorDeNotificaciones{
    //Aplicando principio DRY
    private static final String URL_BASE ="https://mi-app.com/";

    //Aplicando principio DRY y KISS
    private void enviarEmail(String email, String Asunto, String Cuerpo){
        System.out.println("Enviando email a: "+email);
        System.out.println("Asunto: "+Asunto);
        System.out.println("Cuerpo: "+Cuerpo);

    }
    //Aplicando principio YAGNI y Kiss
    private String generarToken(){
        //Logica compleja para generar un token
        return java.util.UUID.randomUUID().toString();

    }
    public void enviarBienvenida(String email, String nombre){
        String token =generarToken();
        String UrlDeActivacion= URL_BASE +"activacion_token="+token;
        String cuerpo ="Hola " + nombre +", haz clic aqui:" +UrlDeActivacion; 
        enviarEmail(email, "Bienvenido a la plataforma", cuerpo);
    }
     public void enviarRestablecimiento(String email){
        String token =generarToken();
        String ulrDeRestablecimiento = URL_BASE +"restablecimiento_token=" +token;
        String cuerpo= "Haz clic para restablecer tu contraseña: "+ulrDeRestablecimiento;
        enviarEmail(email, "Restablece tu contraseña", cuerpo);
    }


}

public class Principios_D_K_Y {

    
    public static void main(String[] args) {
    
        gestorDeNotificaciones gestor = new gestorDeNotificaciones();
        System.out.println("--Enviado mensaje de bienvenida--");
        gestor.enviarBienvenida("carlos.marquez@gmail.com", "Carlos");

         System.out.println("--Enviado mensaje de restablecimiento--");
         gestor.enviarRestablecimiento("carlos.marquez@gmail.com");
    
    }

}