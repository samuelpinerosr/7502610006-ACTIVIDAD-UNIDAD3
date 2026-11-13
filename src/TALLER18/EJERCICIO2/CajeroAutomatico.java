package TALLER18.EJERCICIO2;

class CajeroAutomatico implements Retiro, Transferencia {
    @Override
    public void retirar(double monto) {
        System.out.println("Retirando $" + monto + " en efectivo desde el cajero.");
    }

    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("Transfiriendo $" + monto + " a la cuenta " + cuentaDestino);
    }
}

