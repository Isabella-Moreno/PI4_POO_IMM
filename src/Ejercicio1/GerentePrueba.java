package Ejercicio1;

import java.util.Scanner;

public class GerentePrueba {

    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        System.out.print("Nombre del gerente: ");
        String nombre = sc.nextLine();

        System.out.print("Salario: ");
        double salario = sc.nextDouble();
        sc.nextLine();

        System.out.print("Departamento: ");
        String departamento = sc.nextLine();

        Gerente gerente = new Gerente(nombre, salario, departamento);
        System.out.println("\n--- INFORMACIÓN REGISTRADA ---");
        gerente.mostrarInformacion();
    }
}