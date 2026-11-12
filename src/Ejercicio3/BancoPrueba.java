package Ejercicio3;

public class BancoPrueba {

    public void iniciar() {
        BancoInseguro inseguro = new BancoInseguro(1000.0);
        inseguro.saldo = -5000.0; // Permite saldos negativos sin control desde el mismo paquete o subclases
        System.out.println("--- 1. PROBLEMA CON SALDO PROTECTED ---");
        System.out.println("Saldo alterado sin validación: $" + inseguro.saldo);
        System.out.println("Discusión: Usar protected en datos críticos rompe la integridad porque cualquier "
                + "subclase o clase del paquete puede modificar el valor arbitrariamente sin reglas de negocio.");


        System.out.println("\n--- 2. SOLUCIÓN CON ENCAPSULAMIENTO PRIVATE ---");
        BancoSeguro seguro = new BancoSeguro(1000.0);
        seguro.retirar(2500.0); // Bloqueado por validación
        seguro.depositar(500.0); // Permitido
        System.out.println("Saldo final protegido: $" + seguro.getSaldo());
    }
}