package ar.edu.unlam.pb1.trabajopractico11.dominio;

public class Mesa {
    private int numero;
    private boolean libre;
    private int comensales;
    private Pedido pedido;

    private static int ULTIMA_MESA_CREADA = 0;

    public Mesa() {
        this.numero = ULTIMA_MESA_CREADA;
        this.libre = true;
        this.comensales = 0;
        this.pedido = null;
        ULTIMA_MESA_CREADA++;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    public int getComensales() {
        return this.comensales;
    }

    public void ocupar(int comensales) {
        this.libre = false;
        this.comensales = comensales;
    }

    public boolean estaLibre() {
        return this.libre;
    }

    public boolean estaOcupada() {
        return !this.libre;
    }

    public Pedido getPedido() {
        return this.pedido;
    }

    public boolean agregarPedido(Pedido pedido) {
        if (pedido == null) {
            return false;
        }

        this.pedido = pedido;
        return true;
    }

    public double cerrar() {
        double total = 0.0;

        Pedido pedido = getPedido();
        if (pedido == null) {
            return total;
        }

        total = pedido.totalPedido();

        reset();

        return total;
    }

    private void reset() {
        this.libre = true;
        this.comensales = 0;
        this.pedido = null;
    }

    @Override
    public String toString() {
        return "Mesa Numero: " + this.getNumero() + "\n";
    }
}