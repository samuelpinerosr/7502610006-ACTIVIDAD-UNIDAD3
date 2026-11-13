package TALLER19.EJERCICIO1;

public class MainAutenticacion {
    public static void main(String[] args) {
        ServicioAutenticacion authLocal = new AutenticacionLocal();
        GestorAutenticacion gestor = new GestorAutenticacion(authLocal);
        gestor.iniciarSesion("admin", "1234");

        System.out.println("-----------------------------------");

        ServicioAutenticacion authOAuth = new AutenticacionOAuth();
        gestor = new GestorAutenticacion(authOAuth);
        gestor.iniciarSesion("carlos@correo.com", "TOKEN_98765");
    }
}
