package ar.edu.unlam.pb1.trabajoPractico08.dominio;

public class PruebaClaseMath {
	  public static void main(String[] args) {
	        Calculadora calculadoraPrueba;
	        int unEnteroNegativo = -33;
	        double unDoubleNegativo = -24.5;
	        float unFloatNegativo = -53312.99f;
	        long unLongNegativo = -5331299111l;

	        calculadoraPrueba = new Calculadora();
	        
	        // a. abs(int a);
	        // Retorna el valor absoluto del entero enviado por parametros
	        System.out.println("El valor absoluto de " + unEnteroNegativo + " es: " + Math.abs(unEnteroNegativo));

	        // b. abs(double a);
	        // Retorna el valor absoluto del double enviado por parametros
	        System.out.println("El valor absoluto de " + unDoubleNegativo + " es: " + Math.abs(unDoubleNegativo));

	        // c. abs(float a);
	        // Retorna el valor absoluto del float enviado por parametros
	        System.out.println("El valor absoluto de " + unFloatNegativo + " es: " + Math.abs(unFloatNegativo));

	        // d. abs(long a);
	        // Retorna el valor absoluto del long enviado por parametros
	        System.out.println("El valor absoluto de " + unLongNegativo + " es: " + Math.abs(unLongNegativo));

	        // e. pow(double a, double b)
	        // Retorna el valor del primer argumento elevado a la potencia del segundo
	        // argumento
	        System.out.println("El valor 2 elevado a la 3 es " + Math.pow(2, 3));

	        // f. random()
	        // Retorna un valor aleatorio entre 0.0 y 1.0
	        System.out.println("Un valor aleatoria entre 0.0 y 1.0 es " + Math.random());

	        // g. round(float a);
	        // Retorna el entero mas cercano al float enviado por parametro
	        System.out.println("El valor entero mas cercano a " + unFloatNegativo + " es " + Math.round(unFloatNegativo));

	        // h. round(double a);
	        // Retorna el entero mas cercano al double enviado por parametro
	        System.out.println("El valor entero mas cercano a " + unDoubleNegativo + " es " + Math.round(unDoubleNegativo));


	        // i. sqrt(double a);
	        // Retorna la raiz cuadrda del numero enviado por parametro
	        System.out.println("La raiz cuadrada de 25 es " + Math.sqrt(25));

	        // Elegí 3 de ellos y desarrollá un ejemplo de código en dónde los usarías.
	        
	        System.out.println("El valor absoluto de -221312 es " + calculadoraPrueba.valorAbsoluto(-221312));
	        System.out.println("La potencia de 10 al cuadrado es " + calculadoraPrueba.obtenerPotencia(10, 2));
	        System.out.println("Decime un valor del 0 al 10 " + calculadoraPrueba.obtenerNumeroDelCeroAlDiezAleatoriamente());
	    }
}
