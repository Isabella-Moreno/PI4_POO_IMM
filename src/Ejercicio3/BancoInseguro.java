package Ejercicio3;

public class BancoInseguro {

    // MALA PRÁCTICA: Cualquier clase del mismo paquete o subclase puede alterar el saldo sin validación
    protected double saldo;

    public BancoInseguro(double saldoInicial) {
        this.saldo = saldoInicial;
    }
}