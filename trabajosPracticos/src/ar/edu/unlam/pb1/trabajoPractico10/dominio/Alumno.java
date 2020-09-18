package ar.edu.unlam.pb1.trabajoPractico10.dominio;

public class Alumno {
	 private String nombre;
	    private String apellido;

	    public Alumno(String nombre, String apellido) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	    }

	    public String getNombre() {
	        return this.nombre;
	    }

	    public String getApellido() {
	        return this.apellido;
	    }

	    public String toString() {
	        return this.getApellido() + " " + this.getNombre();
	    }
}
