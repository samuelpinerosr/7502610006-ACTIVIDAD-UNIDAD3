package TALLER18.EJERCICIO3;

class CamionCarga implements Conducible, TransporteCarga {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el camión por la carretera.");
    }

    @Override
    public void cargarMercancia(double peso) {
        System.out.println("Cargando " + peso + " kg de mercancía en el camión.");
    }
}
