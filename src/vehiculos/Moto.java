package vehiculos;

public class Moto extends Vehiculo {

    protected int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarDetallesCompletos() {
        // Permitido porque Moto es subclase de Vehiculo
        System.out.println("Tipo: " + tipo + " | Marca: " + marca + " | Cilindrada: " + cilindrada + " cc");
    }
}