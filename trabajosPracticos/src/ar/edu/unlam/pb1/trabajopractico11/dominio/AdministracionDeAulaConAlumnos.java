package ar.edu.unlam.pb1.trabajopractico11.dominio;

public class AdministracionDeAulaConAlumnos {
	private Alumno[][] escritorios;
    private int columnaActual;
    private int filaActual;

    public AdministracionDeAulaConAlumnos(int cantidadMaximaFilas, int cantidadMaximaDeColumnas) {
        this.escritorios = new Alumno[cantidadMaximaFilas][cantidadMaximaDeColumnas];
        this.columnaActual = 0;
        this.filaActual = 0;
    }

    public boolean aulaLlena() {
        return this.contarEscritoriosVacios() == 0;
    }

    public boolean ocuparEscritorio(Alumno alumno) {
        Alumno alumnoExistente;

        if (aulaLlena()) {
            return false;
        }

        alumnoExistente = this.getAlumnoEnEscritorio(this.filaActual, this.columnaActual);

        if (alumnoExistente != null) {
            return false;
        }

        this.escritorios[this.filaActual][this.columnaActual] = alumno;

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
                Alumno alumno = this.getAlumnoEnEscritorio(fila, columna);
                if (alumno == null) {
                    cantidadEscritoriosVacios++;
                }
            }
        }

        return cantidadEscritoriosVacios;
    }

    private Alumno getAlumnoEnEscritorio(int fila, int columna) {
        boolean filaValida, columnaValida;
        filaValida = fila < this.escritorios.length;
        columnaValida = columna < this.escritorios[fila].length;

        if (filaValida && columnaValida) {
            return this.escritorios[fila][columna];
        }

        return null;
    }

    public String listadoDeAlumnos() {
        String alumnos = "";

        for (int fila = 0; fila < this.escritorios.length; fila++) {
            for (int columna = 0; columna < this.escritorios[fila].length; columna++) {
                Alumno alumno = this.getAlumnoEnEscritorio(fila, columna);
                if (alumno != null) {
                    alumnos += alumno.toString() + "\n";
                }
            }
        }
        return alumnos;
    }

    public boolean buscarAlumno(String nombre, String apellido) {

        if (nombre.length() == 0 || apellido.length() == 0) {
            return false;
        }
        	
        for (int fila = 0; fila < this.escritorios.length; fila++) {
               for (int columna = 0; columna < this.escritorios[fila].length; columna++) {
                   Alumno alumno = this.getAlumnoEnEscritorio(fila, columna);
                   if (alumno != null || esAlumno(alumno, nombre, apellido)) {
                      return true;
                   }
               }
           }
        	
        return false;
    }

    private boolean esAlumno(Alumno alumno, String nombre, String apellido) {
        return alumno.getApellido().equalsIgnoreCase(nombre) && alumno.getApellido().equalsIgnoreCase(apellido);
    }
}
