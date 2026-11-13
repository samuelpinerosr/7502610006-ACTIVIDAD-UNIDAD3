package TALLER18.EJERCICIO3;

public class Main {
    public static void main(String[] args) {
        Conducible auto = new Automovil();
        CamionCarga camion = new CamionCarga();

        auto.conducir();
        camion.cargarMercancia(3500);
        camion.conducir();
    }
}
