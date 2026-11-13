package TALLER19.EJERCICIO2;

class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombre, String contenido) {
        System.out.println("Guardando '" + nombre + "' en disco duro local (C:/archivos/).");
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return "Contenido local de [" + nombre + "]";
    }
}
