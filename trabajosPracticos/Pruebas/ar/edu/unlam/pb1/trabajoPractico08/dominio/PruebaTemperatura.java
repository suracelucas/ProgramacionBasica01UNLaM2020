package ar.edu.unlam.pb1.trabajoPractico08.dominio;

public class PruebaTemperatura {
	  public static void main(String args[]) {
	        Temperatura temperatura;

	        // Constructor guarda en celcius por defecto
	        temperatura = new Temperatura(24.0);
	        System.out.println("La temparatura actual en celsius es de: " + temperatura.getValor());

	        // Set valor en kelvin
	        temperatura.setValor(24.0, Temperaturas.KELVIN);
	        System.out.println("La temparatura actual en kelvin es de: " + temperatura.getValor());

	        // Set valor en farenheit
	        temperatura.setValor(24.0, Temperaturas.FARENHEIT);
	        System.out.println("La temparatura actual en farenheit es de: " + temperatura.getValor());
	    }
}
