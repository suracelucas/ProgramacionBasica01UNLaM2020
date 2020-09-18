package ar.edu.unlam.pb1.ejerciciosEnClase.dominio;

import java.util.Scanner;

public class Validacion {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String args[]) {
		int numero;
		
		
		System.out.println("Ingrese el valor deseado: ");
		numero = teclado.nextInt();
		
		numero = validar(numero);
		System.out.println("Numero ingresado: " + numero);
		
	}
	
	public static int validar(int numero) {
		while(numero<0) {
			System.out.println("Ingrese un número mayor a 0");
			numero = teclado.nextInt();
		}
		return numero;
	}
}
