package TALLER19.EJERCICIO2;

interface Almacenamiento {
    void guardarArchivo(String nombre, String contenido);
    String recuperarArchivo(String nombre);
}