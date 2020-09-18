package ar.edu.unlam.pb1.trabajopractico11.dominio;

public class Caja {
    private double total;

    public Caja() {
        this.total = 0;
    }

    public void agregarTotalPedido(double totalPedido) {
        if (totalPedido > 0) {
            this.total += totalPedido;
        }
    }

    public double getTotal() {
        return this.total;
    }

    public void cerrar() {
        this.total = 0;
    }
}