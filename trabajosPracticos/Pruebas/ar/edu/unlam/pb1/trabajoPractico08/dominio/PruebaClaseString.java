package ar.edu.unlam.pb1.trabajoPractico08.dominio;

public class PruebaClaseString {
	 public static void main(String args[]) {
	        String unaCadenaDeCaracteres = "Hola Mundo";
	        String[] unArrayDeStrings;
	        Libro libroDePrueba;
	        String[] hojas;
	        
	        libroDePrueba = new Libro("Under the dome", "Hoja1/Hoja2/Hoja3/Hoja4/", "Stephen", "King");
	        

	        // a. charAt(int index);
	        // Retorna el caracter, indicado por el parametro index, de la cadena de
	        // caracteres
	        System.out.println("El caracter en la posicion 3 es: " + unaCadenaDeCaracteres.charAt(3));

	        // b. equals(String anotherString);
	        // Retorna verdadero o falso, si la cadena de caracteres recibida por parametros
	        // es igual a la cadena de caracteres actual. Valida mayusculas
	        System.out.println("Las cadenas son iguales: " + unaCadenaDeCaracteres.equals("Hola Mundo"));
	        System.out.println("Las cadenas son iguales: " + unaCadenaDeCaracteres.equals("hola mundo"));

	        // c. equalsIgnoreCase(String anotherString)
	        // Retorna verdadero o falso, si la cadena de caracteres recibida por parametros
	        // es igual a la cadena de caracteres actual. No valida mayusculas
	        System.out.println("Las cadenas son iguales: " + unaCadenaDeCaracteres.equalsIgnoreCase("hola mundo"));

	        // d. length();
	        // Retorna cantidad de caracteres de la cadena. Cuenta los espacios ya que son
	        // caracteres
	        System.out.println("La longitud de la cadena es: " + unaCadenaDeCaracteres.length());

	        // e. substring(beginIndex, endIndex);
	        // Retorna una sub cadena de acuerdo a la posicion incial y final enviada por
	        // parametros
	        System.out.println("La subcadena entre 6 y 10 es: " + unaCadenaDeCaracteres.substring(5, 10));

	        // f. split(String regex);
	        // Retorna un array de strings dependiendo de la expresion regular enviada por
	        // parametros. Descarta array de caracteres vacios
	        unArrayDeStrings = unaCadenaDeCaracteres.split("o");
	        System.out.println("Las cadenas formadas a partir de la division por el caracter son: ");
	        for (int i = 0; i < unArrayDeStrings.length; i++) {
	            System.out.println(unArrayDeStrings[i]);
	        }

	        // g. toLowerCase();
	        // Retorna la cadena de caracteres en minusculas
	        System.out.println("La cadena en minusculas es: " + unaCadenaDeCaracteres.toLowerCase());

	        // g. toUpperCase();
	        // Retorna la cadena de caracteres en mayusculas
	        System.out.println("La cadena en mayusculas es: " + unaCadenaDeCaracteres.toUpperCase());

	        // g. trim();
	        // Retorna la cadena sin espacios en el principio y en el final
	        unaCadenaDeCaracteres = "  Hola Mundo  ";
	        System.out.println("La cadena sin espacios es igual a: " + unaCadenaDeCaracteres.trim());

	        // Elegí 3 de ellos y desarrollá un ejemplo de código en dónde los usarías.
	        

	        // Ejemplo con equalsIgnoreCase(String anotherString)
	        System.out.println("El libro es IT?");
	        if (libroDePrueba.esTitulo("IT")) {
	            System.out.println("Si");
	        } else {
	            System.out.println("No");
	        }

	        // Ejemplo con charAt(int index);
	        System.out.println("Las Iniciales de el autor son: " + libroDePrueba.obtenerInicialesDelAutor());

	        // Ejemplo con split(String regex);
	        hojas = libroDePrueba.obtenerHojas();
	        System.out.println("La cantidad de hojas que tiene el libro es de: " + hojas.length);
	    }
}
