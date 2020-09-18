package ar.edu.unlam.pb1.trabajoPractico10.dominio;

import java.util.Scanner;

public class PruebaSudoku {

    // Los niveles no se generan automaticamente
    public static void main(final String args[]) {
        Scanner inputTeclado = new Scanner(System.in);
        Sudoku juego;
        int fila, columna, valor, dificultad;

        System.out.println("Seleccione dificultad: ");
        System.out.println("1 - Facil");
        System.out.println("2 - Medio");
        System.out.println("3 - Dificil");
        dificultad = inputTeclado.nextInt();
        switch (dificultad) {
            case 1:
                juego = new Sudoku(getTableroFacil());
                break;
            case 2:
                juego = new Sudoku(getTableroMedio());
                break;
            default:
                juego = new Sudoku(getTableroDificil());
                break;
        }

        System.out.println(juego);
        do {
            System.out.println("Ingresar Fila");
            fila = inputTeclado.nextInt();
            System.out.println("Ingresar Columna");
            columna = inputTeclado.nextInt();
            System.out.println("Ingresar Valor");
            valor = inputTeclado.nextInt();

            if (juego.validarCeldaCompleta(fila, columna, valor)) {
                juego.setValor(fila, columna, valor);
            } else {
                System.out.println("Valor no valido");
            }

            System.out.println(juego);
        } while (!juego.tableroCompleto());

        System.out.println("Juego terminado felicitaciones!!");
        inputTeclado.close();
    }

    private static int[][] getTableroFacil() {
        return new int[][] { 
            { 0, 6, 3, 1, 7, 4, 2, 5, 8 },
            { 1, 7, 8, 3, 2, 5, 6, 4, 9 },
            { 2, 5, 4, 6, 8, 9, 7, 3, 1 },
            { 8, 2, 1, 4, 3, 7, 5, 9, 6 },
            { 4, 9, 6, 8, 5, 2, 3, 1, 7 },
            { 7, 3, 5, 9, 6, 1, 8, 2, 4 },
            { 5, 8, 9, 7, 1, 3, 4, 6, 2 },
            { 3, 1, 7, 2, 4, 6, 9, 8, 5 },
            { 6, 4, 2, 5, 9, 8, 1, 7, 3 }
        };
    }

    private static int[][] getTableroMedio() {
        return new int[][] { 
            { 0, 6, 3, 1, 7, 4, 2, 5, 8 },
            { 0, 0, 8, 3, 0, 5, 6, 0, 0 },
            { 2, 5, 4, 6, 8, 9, 7, 3, 1 },
            { 8, 2, 1, 4, 3, 0, 5, 9, 6 },
            { 4, 9, 0, 8, 5, 2, 3, 1, 7 },
            { 7, 3, 5, 9, 0, 1, 8, 2, 4 },
            { 5, 8, 9, 7, 1, 3, 4, 6, 2 },
            { 0, 0, 7, 2, 0, 6, 9, 0, 0 },
            { 6, 4, 2, 5, 9, 8, 1, 7, 3 }
        };
    }

    private static int[][] getTableroDificil() {
        return new int[][] { 
            { 0, 6, 0, 1, 0, 4, 0, 5, 0 },
            { 0, 0, 8, 3, 0, 5, 6, 0, 0 },
            { 2, 0, 0, 0, 0, 0, 0, 0, 1 },
            { 8, 0, 0, 4, 0, 7, 0, 0, 6 },
            { 0, 0, 6, 0, 0, 0, 3, 0, 0 },
            { 7, 0, 0, 9, 0, 1, 0, 0, 4 },
            { 5, 0, 0, 0, 0, 0, 0, 0, 2 },
            { 0, 0, 7, 2, 0, 6, 9, 0, 0 },
            { 0, 4, 0, 5, 0, 8, 0, 7, 0 } 
        };
    }
}