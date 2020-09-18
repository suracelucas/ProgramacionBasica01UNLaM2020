package ar.edu.unlam.pb1.trabajoPractico10.dominio;

public class AdministracionDeAula {
		private boolean[][] escritorios;
		private int columnaActual;
	    private int filaActual;

	    public AdministracionDeAula(int cantidadMaximaFilas, int cantidadMaximaDeColumnas) {
	        this.escritorios = new boolean[cantidadMaximaFilas][cantidadMaximaDeColumnas];
	        this.columnaActual = 0;
	        this.filaActual = 0;
	    }

	    public boolean aulaLlena() {
	        return this.contarEscritoriosVacios() == 0;
	    }

	    public String obtenerEscritorioVacio() {
	        String escritorio = "";
	        boolean escritorioEncontrado = false;

	        for (int fila = 0; fila < this.escritorios.length; fila++) {

	            for (int columna = 0; columna < this.escritorios[fila].length; columna++) {
	                boolean escritorioOcupado = this.getEscritorio(fila, columna);
	                if (!escritorioOcupado) {
	                    escritorio = "Fila: " + fila + " Columna: " + columna;
	                    escritorioEncontrado = true;
	                    break;
	                }
	            }

	            if (escritorioEncontrado) {
	                break;
	            }
	        }

	        return escritorio;
	    }

	    public boolean ocuparEscritorio() {
	        boolean escritorioOcupado;

	        if (aulaLlena()) {
	            return false;
	        }

	        escritorioOcupado = this.getEscritorio(this.filaActual, this.columnaActual);

	        if (escritorioOcupado) {
	            return false;
	        }

	        this.escritorios[this.filaActual][this.columnaActual] = true;

	        this.columnaActual++;
	        if (this.columnaActual >= this.escritorios[this.filaActual].length) {
	            this.filaActual++;
	            this.columnaActual = 0;
	        }

	        return true;
	    }

	    public int contarEscritoriosVacios() {
	        int cantidadEscritoriosVacios = 0;

	        for (int fila = 0; fila < this.escritorios.length; fila++) {
	            for (int columna = 0; columna < this.escritorios[fila].length; columna++) {
	                boolean escritorioOcupado = this.getEscritorio(fila, columna);
	                if (!escritorioOcupado) {
	                    cantidadEscritoriosVacios++;
	                }
	            }
	        }

	        return cantidadEscritoriosVacios;
	    }

	    private boolean getEscritorio(int fila, int columna) {
	        boolean filaValida, columnaValida;
	        filaValida = fila < this.escritorios.length;
	        columnaValida = columna < this.escritorios[fila].length;

	        if (filaValida && columnaValida) {
	            return this.escritorios[fila][columna];
	        }

	        return false;
	    }
}
