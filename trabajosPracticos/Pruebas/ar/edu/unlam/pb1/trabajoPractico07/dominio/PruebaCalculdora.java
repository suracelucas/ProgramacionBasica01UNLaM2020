package ar.edu.unlam.pb1.trabajoPractico07.dominio;

public class PruebaCalculdora {

	public static void main(String[] args) {
		Calculadora calculadora1 = new Calculadora();
		int factorial = 10;
		if(calculadora1.factorial(factorial)>0) {
			System.out.println(factorial +"!= "+calculadora1.factorial(factorial));
		}else {
			System.out.println("El resultado del Factorial deseado es muy grande, genera Overflow.");
		}
		

	}

}
