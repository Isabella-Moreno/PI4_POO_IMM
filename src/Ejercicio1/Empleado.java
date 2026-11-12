package Ejercicio1;

public class Empleado {

    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    protected void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + " | Salario: $" + salario);
    }
}