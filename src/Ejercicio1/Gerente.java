package Ejercicio1;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("Gerente: " + nombre
                + " | Salario: $" + salario
                + " | Departamento: " + departamento);
    }
}