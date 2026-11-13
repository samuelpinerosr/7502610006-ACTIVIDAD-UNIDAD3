package TALLER18.EJERCICIO1;

// Clase que cumple ambos roles (puede implementar múltiples interfaces)
public class OperarioIntegral implements Reparable, Limpiable {
    @Override
    public void reparar() {
        System.out.println("Operario integral reparando avería.");
    }

    @Override
    public void limpiar() {
        System.out.println("Operario integral limpiando el área de trabajo.");
    }
}