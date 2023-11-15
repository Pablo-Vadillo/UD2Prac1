package net.salesianos.granjeroapp;

import java.util.Random;

public class Granjero implements Runnable {
    private String nombre;
    private int cantidadVerduras;
    private Restaurante restaurante;
    private static String[] tiposVerduras = {"lettuce", "cabbage", "onion", "spinach", "potato", "celery",
            "asparagus", "radish", "broccoli", "artichoke", "tomato", "cucumber", "eggplant", "carrot", "green bean"};

    public Granjero(String nombre, int cantidadVerduras, Restaurante restaurante) {
        this.nombre = nombre;
        this.cantidadVerduras = cantidadVerduras;
        this.restaurante = restaurante;
    }

    @Override
    public void run() {
        for (int i = 0; i < cantidadVerduras; i++) {
            try {
                Thread.sleep(new Random().nextInt(100));
                String tipoVerdura = tiposVerduras[new Random().nextInt(tiposVerduras.length)];
                Verdura verdura = new Verdura(tipoVerdura);
                restaurante.plantarVerdura(verdura, nombre);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

