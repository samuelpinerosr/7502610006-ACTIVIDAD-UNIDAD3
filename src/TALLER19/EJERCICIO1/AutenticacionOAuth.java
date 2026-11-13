package TALLER19.EJERCICIO1;

class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        System.out.println("Verificando token OAuth para '" + usuario + "' con proveedor externo...");
        return credencial != null && credencial.startsWith("TOKEN_");
    }
}
