package TALLER18.EJERCICIO2;

public interface OperacionBancaria {
    void transferir(double monto, String cuentaDestino);
    void retirar(double monto);
    void pagarFactura(String referencia, double monto);
}