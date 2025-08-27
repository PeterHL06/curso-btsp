package Java.clase9;

import java.util.ArrayList;
import java.util.List;

abstract class Documento {

    protected String nombreArchivo;

    //Constructor
    public Documento(String nombreArchivo){
        this.nombreArchivo=nombreArchivo;

    }

    //Metodo abstracto
    public abstract void procesar();


}

class PDF extends Documento{
    public PDF(String nombreArchivo){
        super(nombreArchivo);
    }

    @Override //Sobreescritura
    public void procesar(){
        System.out.println("Procesando documento PDF... "+nombreArchivo);    }
}

class Word extends Documento{
    public Word(String nombreArchivo){
        super(nombreArchivo);
    }

    @Override //Sobreescritura
    public void procesar(){
        System.out.println("Procesando documento Word... "+nombreArchivo);    }
}

class Imagen extends Documento{
    public Imagen(String nombreArchivo){
        super(nombreArchivo);
    }

    @Override //Sobreescritura
    public void procesar(){
        System.out.println("Procesando archivo de imagen... "+nombreArchivo);    }
}


public class procesadorDocumentos {

    public static void main(String[] args) {
        List<Documento> listaDocumentos = new ArrayList<>(); //Objeto a partir de clase padre

        //Añadir elementos a la lista usando las clases hijas
        System.out.print("\n");
        listaDocumentos.add(new PDF("Estado de cuenta"));
        listaDocumentos.add(new Word("Reporte semanal"));
        listaDocumentos.add(new Imagen("Logo de la empresa"));
        
        //Iterar la lista
        for (Documento noti: listaDocumentos){
            noti.procesar();
            System.out.println("------");
            //System.out.print("\n"); 
    }
}    
}
