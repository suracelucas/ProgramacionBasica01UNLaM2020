package ar.edu.unlam.pb1.trabajoPractico06.dominio;

public class Ascii {

	static String cadena = "";
	static String cadenaEspecial = "";
	
	public static void main(String[] args) {
		
		short numero = 32;
		while(numero <=47) {
			cadenaEspecial += numero + "-" + (char)numero + "," + " ";
			numero++;
		}
		
		System.out.println("Caracteres numericos:");
		while(numero <=57) {
			cadena += numero + "-" + (char)numero + "," + " ";
			numero++;
		}
		System.out.println(cadena);
		
		while(numero <=64) {
			cadenaEspecial += numero + "-" + (char)numero + "," + " ";
			numero++;
		}
		
		limpiarCadena();
		System.out.println("\nLetras mayusculas:");
		while(numero <=90) {
			cadena += numero + "-" + (char)numero + "," + " ";
			numero++;
		}
		System.out.println(cadena);
		
		while(numero <=97) {
			cadenaEspecial += numero + "-" + (char)numero + "," + " ";
			numero++;
		}
		
		limpiarCadena();
		System.out.println("\nLetras minusculas:");
		while(numero <=122) {
			cadena += numero + "-" + (char)numero + "," + " ";
			numero++;
		}
		System.out.println(cadena);
		
		while(numero <=255) {
			cadenaEspecial += numero + "-" + (char)numero + "," + " ";
			numero++;
		}
		System.out.println("\nCaracteres especiales: ");
		System.out.println(cadenaEspecial);
		
	}
	
	public static void limpiarCadena() {
		cadena = "";
	}

}
