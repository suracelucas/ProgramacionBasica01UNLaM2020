package ar.edu.unlam.pb1.trabajopractico11.dominio;

public class Consumible {
    private TipoDeConsumible tipo;
    private String nombre;
    private double precio;

    public Consumible(TipoDeConsumible tipo, String nombre, double precio) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public TipoDeConsumible getTipo() {
        return this.tipo;
    }

    @Override
    public String toString() {
        return this.getNombre() + " - " + this.getPrecio() + "\n";
    }
}