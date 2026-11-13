package TALLER19.EJERCICIO3;

public class Main {
    public static void main(String[] args) {
        GeneradorReporte pdf = new ReportePDF();
        GestorReportes gestor = new GestorReportes(pdf);
        gestor.crearReporte("Ventas Trimestre 1 - $45,000");

        System.out.println("-----------------------------------");

        GeneradorReporte excel = new ReporteExcel();
        gestor = new GestorReportes(excel);
        gestor.crearReporte("Inventario Bodega Cartagena - 1,200 unidades");
    }
}
