package ar.edu.unlam.pb1.trabajoPractico09.dominio;

public class PruebaDeSistema {
	 public static void main(String args[]) {
	        Sistema sistema;
	        
	        // a. Ingresa el "Sistema de Asistencias de Unlam"
	        sistema = new Sistema("Sistema de Asistencias de Unlam");

	        // b. Registr� 5 usuarios.
	        sistema.agregarUsuario("Fede", "pepito");
	        sistema.agregarUsuario("Lucas", "12332");
	        sistema.agregarUsuario("Alan", "002334");
	        sistema.agregarUsuario("Manuel", "opepdpd");
	        sistema.agregarUsuario("Mauricio", "2223o");

	        // c. Logueate con un usuario y congtrasena v�lidos
	        System.out.println("Logearte con usuario y contrasena validos");
	        if (sistema.loguearUsuario("Fede", "pepito")) {
	            System.out.println("Login exitoso!");
	        } else {
	            System.out.println("Compruebe usuario y contrasena");
	        }
	        sistema.desloguearUsuario("Fede", "pepito");

	        // d. Intent� loguearte con un usuario inexistente
	        System.out.println("Logearte con usuario y contrasena inexistente");
	        if (sistema.loguearUsuario("Alvaro", "navajita")) {
	            System.out.println("Login exitoso!");
	        } else {
	            System.out.println("Compruebe usuario y contrasena");
	        }

	        // e. Intent� loguearte con una contrasena inv�lida de un usuario existente.
	        System.out.println("Logearte con usuario y contrasena inexistente");
	        if (sistema.loguearUsuario("Fede", "navajita")) {
	            System.out.println("Login exitoso!");
	        } else {
	            System.out.println("Compruebe usuario y contrasena");
	        }
	    }
}
