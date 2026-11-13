package TALLER19.EJERCICIO2;

public class Main{
    public static void main(String[] args) {
        Almacenamiento local = new AlmacenamientoLocal();
        GestorArchivos gestor = new GestorArchivos(local);
        gestor.procesarArchivo("contrato.txt", "Datos del contrato...");

        System.out.println("-----------------------------------");

        Almacenamiento nube = new AlmacenamientoNube();
        gestor = new GestorArchivos(nube);
        gestor.procesarArchivo("respaldo.zip", "Bytes comprimidos...");
    }
}