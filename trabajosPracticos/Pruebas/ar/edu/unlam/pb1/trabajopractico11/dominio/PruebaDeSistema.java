package ar.edu.unlam.pb1.trabajopractico11.dominio;

public class PruebaDeSistema {
    public static void main(String args[]) {
        Sistema sistema;
        
        // a. Ingresa el "Sistema de Asistencias de Unlam"
        sistema = new Sistema("Sistema de Asistencias de Unlam");

        // b. Registrá 5 usuarios.
        sistema.agregarUsuario("Fede", "pepito");
        sistema.agregarUsuario("Lucas", "12332");
        sistema.agregarUsuario("Alan", "002334");
        sistema.agregarUsuario("Manuel", "opepdpd");
        sistema.agregarUsuario("Mauricio", "2223o");

        // c. Logueate con un usuario y congtrasena válidos
        System.out.println("Logearte con usuario y contrasena validos");
        if (sistema.loguearUsuario("Fede", "pepito")) {
            System.out.println("Login exitoso!");
        } else {
            System.out.println("Compruebe usuario y contrasena");
        }
        sistema.desloguearUsuario("Fede", "pepito");

        // d. Intentá loguearte con un usuario inexistente
        System.out.println("Logearte con usuario y contrasena inexistente");
        if (sistema.loguearUsuario("Alvaro", "navajita")) {
            System.out.println("Login exitoso!");
        } else {
            System.out.println("Compruebe usuario y contrasena");
        }

        // e. Intentá loguearte con una contrasena inválida de un usuario existente.
        System.out.println("Logearte con usuario y contrasena inexistente");
        if (sistema.loguearUsuario("Fede", "navajita")) {
            System.out.println("Login exitoso!");
        } else {
            System.out.println("Compruebe usuario y contrasena");
        }

        System.out.println("Lista de Usuarios ordenados por usuario:");
        System.out.println(sistema);
    }
}