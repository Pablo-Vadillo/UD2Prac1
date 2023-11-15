package net.salesianos.granjeroapp;

import java.util.Random;

public class Cliente implements Runnable {
    private String nombre;
    private int cantidadVerduras;
    private Restaurante restaurante;

    public Cliente(String nombre, int cantidadVerduras, Restaurante restaurante) {
        this.nombre = nombre;
        this.cantidadVerduras = cantidadVerduras;
        this.restaurante = restaurante;
    }

    @Override
    public void run() {
        for (int i = 0; i < cantidadVerduras; i++) {
            try {
                Thread.sleep(new Random().nextInt(500));
                Verdura verdura = restaurante.consumirVerdura(nombre);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

