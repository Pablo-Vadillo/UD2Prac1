package net.salesianos.granjeroapp;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<Verdura> almacen = new ArrayList<>();
    private int capacidadMaxima;

    public Restaurante(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public synchronized void plantarVerdura(Verdura verdura, String granjeroNombre) throws InterruptedException {
        while (almacen.size() >= capacidadMaxima) {
            System.out.println("Restaurante lleno. Granjero " + granjeroNombre + " espera.");
            wait();
        }

        almacen.add(verdura);
        System.out.println("Nueva verdura plantada por Granjero " + granjeroNombre + ": " + verdura.getNombre());
        notifyAll();
    }

    public synchronized Verdura consumirVerdura(String clienteNombre) throws InterruptedException {
        while (almacen.isEmpty()) {
            System.out.println("Restaurante sin verduras. Cliente " + clienteNombre + " espera.");
            wait();
        }

        Verdura verdura = almacen.remove(0);
        System.out.println("Verdura consumida por Cliente " + clienteNombre + ": " + verdura.getNombre());
        notifyAll();
        return verdura;
    }
}


