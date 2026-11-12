package Ejercicio3;

public class BancoSeguro {

    // SOLUCIÓN: Atributo privado protegido contra modificaciones directas
    private double saldo;

    public BancoSeguro(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso de $" + monto);
        } else {
            System.out.println("Error: El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso de $" + monto);
        } else {
            System.out.println("Error: Fondos insuficientes o monto inválido.");
        }
    }
}