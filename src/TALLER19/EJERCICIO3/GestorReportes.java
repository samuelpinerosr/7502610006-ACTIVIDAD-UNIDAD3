package TALLER19.EJERCICIO3;

class GestorReportes {
    private GeneradorReporte generadorReporte;

    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void crearReporte(String datos) {
        System.out.println("Iniciando proceso de exportación...");
        generadorReporte.generarReporte(datos);
    }
}
