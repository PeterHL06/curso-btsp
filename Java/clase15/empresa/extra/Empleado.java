package Java.clase15.empresa.extra;

class Empleado {

    private String nombre;
    private int salario;

    

    public Empleado(String nombre, int salario) {

        this.nombre = nombre;
        this.salario = salario;

    }

    //public void setSalario(int salariNuevo) {
        //this.salario = salarioNuevo;
    //}

    public int getSalario() {
        return salario;
    }

    public void imprimirInfo() {

        System.out.println("Empleado: " + this.nombre + ", Salario: " + this.salario);

    }

}