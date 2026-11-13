package TALLER18.EJERCICIO1;

public class Main {
    public static void main(String[] args) {
        Reparable tecnico = new TecnicoReparacion();
        Limpiable aseo = new PersonalAseo();
        OperarioIntegral integral = new OperarioIntegral();

        tecnico.reparar();
        aseo.limpiar();
        integral.reparar();
        integral.limpiar();
    }
}