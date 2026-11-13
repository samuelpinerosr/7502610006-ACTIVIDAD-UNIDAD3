package TALLER18.EJERCICIO2;

class CorresponsalBancario implements PagoFactura {
    @Override
    public void pagarFactura(String referencia, double monto) {
        System.out.println("Pagando factura ref. " + referencia + " por valor de $" + monto);
    }
}