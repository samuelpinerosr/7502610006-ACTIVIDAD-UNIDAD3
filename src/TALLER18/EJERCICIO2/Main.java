package TALLER18.EJERCICIO2;

public class Main {
    public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico();
        PagoFactura corresponsal = new CorresponsalBancario();

        cajero.retirar(200000);
        cajero.transferir(500000, "123-456789-00");
        corresponsal.pagarFactura("FAC-9081", 85500);
    }
}
