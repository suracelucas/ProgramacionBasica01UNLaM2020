package ar.edu.unlam.pb1.trabajopractico11.dominio;

public class Pedido {
    private Consumible[] consumos;
    private int ultimoConsumo;

    public Pedido(int numeroDeConsumos) {
        this.consumos = new Consumible[numeroDeConsumos];
        this.ultimoConsumo = 0;
    }

    public void agregarConsumible(Consumible consumible) {
        if (consumible != null && this.incompleto()) {
            this.consumos[this.ultimoConsumo] = consumible;
            this.ultimoConsumo++;
        }
    }

    public double totalPedido() {
        double total = 0;

        for (int i = 0; i < this.consumos.length; i++) {
            Consumible consumible = this.consumos[i];
            if (consumible != null) {
                total += consumible.getPrecio();
            }
        }

        return total;
    }

    public boolean incompleto() {
        return this.ultimoConsumo < this.consumos.length;
    }

    public String consumosRestantes() {
        return (this.consumos.length - this.ultimoConsumo) + " / " + this.consumos.length;
    }
}