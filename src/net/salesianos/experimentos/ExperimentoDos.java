package net.salesianos.experimentos;

import net.salesianos.granjeroapp.Cliente;
import net.salesianos.granjeroapp.Granjero;
import net.salesianos.granjeroapp.Restaurante;

public class ExperimentoDos {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante(20);

        Thread granjero1 = new Thread(new Granjero("Granjero1", 5, restaurante));
        Thread cliente1 = new Thread(new Cliente("Cliente1", 5, restaurante));

        granjero1.start();
        cliente1.start();

    }
}
