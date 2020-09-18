package ar.edu.unlam.pb1.trabajoPractico08.dominio;

public class Caracter {
	 private static final int COMIENZO_NUMEROS = 48;
	    private static final int FINAL_NUMEROS = 57;

	    private static final int COMIENZO_MAYUSCULAS = 65;
	    private static final int FINAL_MAYUSCULAS = 90;

	    private static final int COMIENZO_MINUSCULAS = 98;
	    private static final int FINAL_MINUSCULAS = 122;

	    public static boolean esMayuscula(int valor) {
	        return valor >= COMIENZO_MAYUSCULAS && valor <= FINAL_MAYUSCULAS;
	    }

	    public static boolean esMinuscula(int valor) {
	        return valor >= COMIENZO_MINUSCULAS && valor <= FINAL_MINUSCULAS;
	    }

	    public static boolean esNumero(int valor) {
	        return valor >= COMIENZO_NUMEROS && valor <= FINAL_NUMEROS;
	    }
}
