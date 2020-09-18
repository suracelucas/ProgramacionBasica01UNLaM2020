package ar.edu.unlam.pb1.ejerciciosEnClase.dominio;

public class PracticaExamen {

	private static int numeroEntero = 0;
	private char caracter = '\0';
	private static int CANTIDAD_DE_WEAS = 0;
	private int vector[];
	private int matriz[][];
	
	public PracticaExamen(int capacidadDelVector) {
		numeroEntero = capacidadDelVector;
		vector = new int[numeroEntero];
		llenarVector();
		CANTIDAD_DE_WEAS++;
	}
	
	public PracticaExamen(int filas, int columnas) {
		matriz = new int[filas][columnas];
		llenarMatriz();
	}
	
	public int[][] getMatriz() {
		return this.matriz;
	}
	
	public boolean buscarValorEnMatriz(int valorABuscar) {
		boolean resultado = false;
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				if(matriz[i][j] == valorABuscar) {
					resultado = true;
				}
			}
		}
		return resultado;
	}
	
	private void llenarMatriz() {
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[0].length; j++) {
				matriz[i][j] = (int) (Math.random() * 100);
			}
		}
	}
	
	private void llenarVector() {
		for(int i = 0; i<vector.length; i++) {
			vector[i] = (int) (Math.random() * 100);
		}
	}
	
	public boolean buscarValorEnVector(int valorABuscar) {
		boolean resultado = false;
		for(int i = 0; i<vector.length; i++) {
			if(vector[i] == valorABuscar) {
				resultado = true;
			}
		}
		return resultado;
	}
		public int[] getVector() {
		return this.vector;
	}
	
	public void ordenarVector() {
		for(int i = 1; i <= vector.length; i++) {
			for(int j = 0; j < vector.length-1; j++) {
				if(vector[j]>vector[j+1]) {
					int aux = vector[j];
					vector[j] = vector[j+1];
					vector[j+1] = aux;
				}
			}
		}
	}
}


