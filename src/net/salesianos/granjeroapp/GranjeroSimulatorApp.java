package net.salesianos.granjeroapp;
    public class GranjeroSimulatorApp {
        public static void main(String[] args) {
            Restaurante restaurante = new Restaurante(20);

            Thread granjero1 = new Thread(new Granjero("Granjero1", 15, restaurante));
            Thread granjero2 = new Thread(new Granjero("Granjero2", 15, restaurante));

            Thread cliente1 = new Thread(new Cliente("Cliente1", 1, restaurante));
            Thread cliente2 = new Thread(new Cliente("Cliente2", 1, restaurante));

            granjero1.start();
            granjero2.start();
            cliente1.start();
            cliente2.start();
        }
    }