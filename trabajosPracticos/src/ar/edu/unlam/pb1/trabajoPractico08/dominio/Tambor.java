package ar.edu.unlam.pb1.trabajoPractico08.dominio;

public class Tambor {
	private static final int POSICION_MINIMA = 1;
    private static final int POSICION_MAXIMA = 8;

    private int posicion;

    public Tambor() {
        this.posicion = POSICION_MINIMA;
    }

    public void girar() {
        this.posicion = (int) Math.round(Math.random() * (POSICION_MAXIMA - POSICION_MINIMA + 1) + POSICION_MINIMA);
    }

    public int getPosicion() {
        return this.posicion;
    }
}
