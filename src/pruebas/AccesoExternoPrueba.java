package pruebas;

import vehiculos.Moto;

public class AccesoExternoPrueba {

    public void iniciar() {
        Moto moto = new Moto("Deportiva", "Yamaha", 300);

        // Acceso correcto mediante método público:
        moto.mostrarDetallesCompletos();

        // --- ERRORES DE COMPILACIÓN (DESCOMENTAR PARA OBSERVAR) ---
        // Error: 'tipo' has protected access in 'vehiculos.Vehiculo'
        // System.out.println(moto.tipo);

        // Error: 'marca' has protected access in 'vehiculos.Vehiculo'
        // System.out.println(moto.marca);

        // Error: 'cilindrada' has protected access in 'vehiculos.Moto'
        // System.out.println(moto.cilindrada);

        System.out.println("\nObservación: Aunque Moto hereda de Vehiculo, AccesoExternoPrueba está en otro paquete "
                + "y no hereda de ninguna de las dos, por lo que Java bloquea el acceso directo a miembros protected.");
    }
}