package TALLER19.EJERCICIO3;

class ReportePDF implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.println("Generando documento PDF con los datos: " + datos);
    }
}
