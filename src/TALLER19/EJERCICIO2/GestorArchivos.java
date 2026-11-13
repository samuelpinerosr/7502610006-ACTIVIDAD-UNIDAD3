package TALLER19.EJERCICIO2;

class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void procesarArchivo(String nombre, String contenido) {
        almacenamiento.guardarArchivo(nombre, contenido);
        String datos = almacenamiento.recuperarArchivo(nombre);
        System.out.println("Archivo verificado: " + datos);
    }
}