package ar.edu.unlam.pb1.ejerciciosEnClase.dominio;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		final  int FILAS = 2;
		final  int COLUMNAS = 2;
		
		int matriz1[][] = new int[FILAS][COLUMNAS];
		int matriz2[][] = new int[FILAS][COLUMNAS];
		int matrizResultado[][] = new int[FILAS][COLUMNAS];
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese los valores a guardar en la matriz 1:");
		for(int i = 0; i<FILAS;i++) {
			for(int j = 0; j<COLUMNAS;j++) {
				matriz1[i][j]=teclado.nextInt();
			}
		}
		
		System.out.println("Ingrese los valores a guardar en la matriz 2:");
		for(int i = 0; i<FILAS;i++) {
			for(int j = 0; j<COLUMNAS;j++) {
				matriz2[i][j]=teclado.nextInt();
			}
		}
		
		for(int i = 0; i<FILAS;i++) {
			for(int j = 0; j<COLUMNAS;j++) {
				matrizResultado[i][j] = matriz1[i][j] + matriz1[i][j] ;
			}
		}
		
		System.out.println("Matriz respuesta:");
		for(int i = 0; i<FILAS;i++) {
			for(int j = 0; j<COLUMNAS;j++) {
				System.out.print(matrizResultado[i][j] + "\t");
			}
			System.out.println("\n");
		}
		teclado.close();
	}

}
