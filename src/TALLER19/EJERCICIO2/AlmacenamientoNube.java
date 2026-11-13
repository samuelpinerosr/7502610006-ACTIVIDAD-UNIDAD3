package TALLER19.EJERCICIO2;

class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombre, String contenido) {
        System.out.println("Subiendo '" + nombre + "' al bucket en la nube...");
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return "Contenido descargado de la nube de [" + nombre + "]";
    }
}