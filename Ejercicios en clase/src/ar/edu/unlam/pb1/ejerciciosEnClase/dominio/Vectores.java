package ar.edu.unlam.pb1.ejerciciosEnClase.dominio;

import java.util.Scanner;

public class Vectores {

	public static void main(String[] args) {
		/*
		 Realizar el ingreso de 10 enteros en un arrray. 
		 A continuación se pide la busqueda 
		 a) del mayor 
		 b) del menor 
		 c) de un elemento ingresado por teclado.
		 Informar
		 */
		final int CANTIDAD_DE_PERSONAS = 5;
		Scanner teclado = new Scanner(System.in);
		Persona arrayDePersonas[] = new Persona[CANTIDAD_DE_PERSONAS];
		
		for(int i = 0; i<arrayDePersonas.length;i++) {
			String nombre, genero;
			long dni;
			int edad, peso, altura;
			System.out.println("Ingrese los soguientes datos de la persona: Nombre, género, edad, DNI, peso y altura.");
			nombre = teclado.next();
			genero = teclado.next();
			edad = teclado.nextInt();
			dni = teclado.nextLong();
			peso = teclado.nextInt();
			altura = teclado.nextInt();
			arrayDePersonas[i] = new Persona(nombre, genero, edad, dni, peso, altura);
		}
		
		System.out.println("\nArray sin ordenar:");
		for(int i = 0; i<arrayDePersonas.length;i++) {
			System.out.println(arrayDePersonas[i]);
		}
		Persona aux;
		for(int i = 1; i<=arrayDePersonas.length; i++) {
			for(int j = 0; j < arrayDePersonas.length-1; j++) {
                if (arrayDePersonas[j + 1].getDni() < arrayDePersonas[j].getDni()) {
                	aux = arrayDePersonas[j + 1];
                	arrayDePersonas[j + 1] = arrayDePersonas[j];
                	arrayDePersonas[j] = aux;}
			}
		}
		
		System.out.println("\nArray ordenado:");
		for(int i = 0; i<arrayDePersonas.length;i++) {
			System.out.println(arrayDePersonas[i]);
		}
		
		
		/*int auxiliar = 0, valorIngresado = 15, j, posicion = -1;
		
		//valorIngresado = teclado.nextInt();
		
		int enteros [] ={3, 11, 33, 9, 15, 8, 22, 44, 5, 18};
		for(int i = 1; i<enteros.length; i++) {
			for(j = 0; j < enteros.length - i - 1; j++) {
                if (enteros[j + 1] < enteros[j]) {
                    auxiliar = enteros[j + 1];
                    enteros[j + 1] = enteros[j];
                    enteros[j] = auxiliar;}
			}
		}
		
		for(int i = 0; i<enteros.length-1;i++) {
			if(enteros[i] == valorIngresado) {
				posicion = i;
			}
		}
		
		System.out.println("Numero mayor: " + enteros[0]);
		System.out.println("Numero menor: " + enteros[enteros.length-1]);

		
		for(int i = 0; i<enteros.length-1; i++) {
			System.out.println(enteros[i]);
		}
		
		if(posicion!= -1) {
			System.out.println("El valor " + valorIngresado + " se encuentra en la posicion " + posicion);
		}else {
			System.out.println("No se encuentra el valor");
		}*/
	}

}
