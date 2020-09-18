package ar.edu.unlam.pb1.trabajoPractico10.dominio;

public class Sudoku {
    private int[][] tablero;

    private static int FILAS_MAXIMAS = 9;
    private static int COLUMNAS_MAXIMAS = 9;
    private static int DIMESION_CUADRANTE = 3;

    public Sudoku(int[][] tablero) {
        this.tablero = tablero;
    }

    public boolean validarFila(int fila, int valor) {

        if (fila > FILAS_MAXIMAS || fila < 0) {
            return false;
        }

        for (int i = 0; i < tablero[fila].length; i++) {
            if (tablero[fila][i] == valor) {
                return false;
            }
        }
        return true;
        
    }

    public boolean validarColumna(int columna, int valor) {

        if (columna > COLUMNAS_MAXIMAS || columna < 0) {
            return false;
        }

        for (int i = 0; i < tablero[columna].length; i++) {
            if (tablero[i][columna] == valor) {
                return false;
            }
        }
        return true;
    }

    public boolean validarCuadrante(int fila, int columna, int valor) {
        int cuadranteI, cuadranteJ;
        int inicioCuadranteI, finCuadaranteI;
        int inicioCuadranteJ, finCuadaranteJ;

        cuadranteI = getCuadrante(fila);
        inicioCuadranteI = cuadranteI * 3;
        finCuadaranteI = inicioCuadranteI + 3;

        cuadranteJ = getCuadrante(columna);
        inicioCuadranteJ = cuadranteJ * 3;
        finCuadaranteJ = inicioCuadranteJ + 3;

        for (int i = inicioCuadranteI; i < finCuadaranteI; i++) {
            for (int j = inicioCuadranteJ; j < finCuadaranteJ; j++) {
                if (this.tablero[i][j] == valor) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean validarCeldaCompleta(int fila, int columna, int valor) {
        return this.validarFila(fila, valor) && this.validarColumna(columna, valor)
                && this.validarCuadrante(fila, columna, valor);
    }

    private boolean algunaCeldaVacia() {
        for (int fila = 0; fila < this.tablero.length; fila++) {
            for (int columna = 0; columna < this.tablero[fila].length; columna++) {
                if (this.tablero[fila][columna] == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    public void setValor(int fila, int columna, int valor) {
        this.tablero[fila][columna] = valor;
    }

    public boolean tableroCompleto() {

        if (algunaCeldaVacia()) {
            return false;
        }

        int auxiliar = 0;
        for (int fila = 0; fila < this.tablero.length; fila++) {
            for (int columna = 0; columna < this.tablero[fila].length; columna++) {
                auxiliar = this.tablero[fila][columna];
                this.tablero[fila][columna] = 0;

                if (!this.validarCeldaCompleta(fila, columna, auxiliar)) {
                    this.tablero[fila][columna] = auxiliar;
                    return false;
                }

                this.tablero[fila][columna] = auxiliar;
            }
        }

        return true;
    }

    private int getCuadrante(int numero) {
        return Math.round(numero / DIMESION_CUADRANTE);
    }

    public String toString() {
        String tablero = "   0 1 2 3 4 5 6 7 8\n";
        tablero += "  ------------------\n";

        int filaAnterior = 0;
        int cuadranteIAnterior = 0;
        for (int fila = 0; fila < this.tablero.length; fila++) {
            if (cuadranteIAnterior != getCuadrante(fila)) {
                tablero += "\n";
                tablero += "  ------------------";
                tablero += "\n";
                cuadranteIAnterior = getCuadrante(fila);
            } else if (filaAnterior != fila) {
                tablero += "\n";
            }

            int cuadranteJAnterior = 0;
            tablero += fila + " |";
            for (int columna = 0; columna < this.tablero[fila].length; columna++) {
                if (cuadranteJAnterior != getCuadrante(columna)) {
                    tablero += "|";
                    cuadranteJAnterior = getCuadrante(columna);
                }

                if (this.tablero[fila][columna] == 0) {
                    tablero += "*";
                } else {
                    tablero += this.tablero[fila][columna];
                }

                if (cuadranteJAnterior == getCuadrante(columna + 1)) {
                    tablero += " ";
                }
            }
        }

        tablero += "\n  ------------------";
        return tablero;
    }
}
