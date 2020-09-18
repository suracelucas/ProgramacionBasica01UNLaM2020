package ar.edu.unlam.pb1.trabajoPractico08.dominio;

public class Password {
	  private int longitud;
	    private String contrasena;

	    private static final int COMIENZO_ASCII = 47;
	    private static final int FINAL_ASCII = 122;

	    private static final int MINIMO_MAYUSCULAS = 2;
	    private static final int MINIMO_MINUSCULAS = 1;
	    private static final int MINIMO_NUMEROS = 5;

	    public Password() {
	        this.longitud = 8;
	        this.generarPassword();
	    }

	    public Password(int longitud) {
	        this.longitud = longitud;
	        this.generarPassword();
	    }

	    public boolean esFuerte() {
	        int cantidadDeMayusculas = 0;
	        int cantidadDeMinusculas = 0;
	        int cantidadDeNumeros = 0;

	        for (int i = 0; i < this.longitud; i++) {
	            char caracter = contrasena.charAt(i);
	            cantidadDeMayusculas += Caracter.esMayuscula(caracter) ? 1 : 0;
	            cantidadDeMinusculas += Caracter.esMinuscula(caracter) ? 1 : 0;
	            cantidadDeNumeros += Caracter.esNumero(caracter) ? 1 : 0;
	        }

	        return cantidadDeMayusculas > MINIMO_MAYUSCULAS && cantidadDeMinusculas > MINIMO_MINUSCULAS
	                && cantidadDeNumeros > MINIMO_NUMEROS;
	    }

	    public void generarPassword() {
	        String nuevaContrasena = "";
	        for (int i = 0; i < this.longitud; i++) {
	            nuevaContrasena += obtenerCaracterValidoAleatorio();
	        }
	        this.contrasena = nuevaContrasena;
	    }

	    public String getContrasena() {
	        return this.contrasena;
	    }

	    public int getLongitud() {
	        return this.longitud;
	    }

	    private char obtenerCaracterValidoAleatorio() {
	        int numeroAleatorio;

	        do {
	            // Obtener un ascii aleatorio que sea numero, mayuscula o minuscula
	            numeroAleatorio = (int) Math.round(Math.random() * (FINAL_ASCII - COMIENZO_ASCII + 1) + COMIENZO_ASCII);
	        } while (!esCaracterValido(numeroAleatorio));

	        return (char) numeroAleatorio;
	    }

	    private boolean esCaracterValido(int valor) {
	        return Caracter.esNumero(valor) || Caracter.esMinuscula(valor) || Caracter.esMayuscula(valor);
	    }
}
