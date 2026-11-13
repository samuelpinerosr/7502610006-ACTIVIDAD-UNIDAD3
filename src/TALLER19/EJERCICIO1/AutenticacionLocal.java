package TALLER19.EJERCICIO1;

class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        System.out.println("Validando usuario '" + usuario + "' en la base de datos local...");
        return "admin".equals(usuario) && "1234".equals(credencial);
    }
}

