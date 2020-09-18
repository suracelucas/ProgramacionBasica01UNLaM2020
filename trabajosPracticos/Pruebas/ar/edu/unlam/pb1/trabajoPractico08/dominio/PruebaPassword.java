package ar.edu.unlam.pb1.trabajoPractico08.dominio;

public class PruebaPassword {
	 public static void main(String args[]) {
	        Password unPassword, unPasswordConLongitud;

	        unPassword = new Password();
	        unPasswordConLongitud = new Password(40);

	        System.out.println("Password con longitud de 8 caracteres: " + unPassword.getContrasena());
	        System.out.print("Password con longitud de 8 es fuerte? ");
	        if (unPassword.esFuerte()) {
	            System.out.println("Si");
	        } else {
	            System.out.println("No");
	        }

	        System.out.println("Password con longitud de 40 caracteres: " + unPasswordConLongitud.getContrasena());
	        System.out.print("Password con longitud de 40 es fuerte? ");
	        if (unPasswordConLongitud.esFuerte()) {
	            System.out.println("Si");
	        } else {
	            System.out.println("No");
	        }
	    }
}
