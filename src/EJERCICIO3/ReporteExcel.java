package EJERCICIO3;

class ReporteExcel implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.println("Exportando hoja de cálculo Excel (.xlsx) con los datos: " + datos);
    }
}