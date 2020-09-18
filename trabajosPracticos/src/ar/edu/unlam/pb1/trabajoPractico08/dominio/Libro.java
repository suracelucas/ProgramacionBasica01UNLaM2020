package ar.edu.unlam.pb1.trabajoPractico08.dominio;

public class Libro {
	
	private static final String SEPERADOR_DE_HOJAS = "/";

    private String titulo;
    private String hojas;
    private String nombreDelAutor;
    private String apellidoDelAutor;

    public Libro(String titulo, String hojas, String nombreDelAutor, String apellidoDelAutor) {
        this.titulo = titulo;
        this.hojas = hojas;
        this.nombreDelAutor = nombreDelAutor;
        this.apellidoDelAutor = apellidoDelAutor;
    }

    public boolean esTitulo(String tituloAbuscar) {
        return this.titulo.equalsIgnoreCase(tituloAbuscar);
    }

    public String[] obtenerHojas() {
        return this.hojas.split(SEPERADOR_DE_HOJAS);
    }

    public String obtenerInicialesDelAutor() {
        String iniciales = new String(this.nombreDelAutor.charAt(0) + "." + this.apellidoDelAutor.charAt(0));
        return iniciales;
    }
}
