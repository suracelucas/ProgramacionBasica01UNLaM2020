package ar.edu.unlam.pb1.ejerciciosEnClase.dominio;

import java.util.Scanner;

public class EjercicioChar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena="";
		System.out.println("Ingrese una cadena de 10 posiciones:");
		cadena = teclado.nextLine();
		int j = cadena.length();
		for(int i =j;i>=0;i--) {
			//System.out.print(cadena.charAt(i));
			System.out.println(i);
		}

	}

}
