package ar.edu.unlam.pb1.trabajopractico11.dominio;

public class Restaurant {
    private Mozo[] mozos;
    private Consumible[] carta;

    private Caja caja;

    private final int MAXIMA_CANTIDAD_CARTA = 8;
    private final int MAXIMA_CANTIDAD_MOZOS = 2;
    private final int MAXIMA_CANTIDAD_MESAS = 10;

    public Restaurant() {
        this.altaDeCarta();
        this.altaDeCaja();
    }

    private void altaDeCarta() {
        this.carta = new Consumible[MAXIMA_CANTIDAD_CARTA];
        this.carta[0] = new Consumible(TipoDeConsumible.PLATO_PRINCIPAL, "Milenasas con pure", 600);
        this.carta[1] = new Consumible(TipoDeConsumible.PLATO_PRINCIPAL, "Asado para dos", 1200);
        this.carta[2] = new Consumible(TipoDeConsumible.PLATO_PRINCIPAL, "Grande de Muzza", 500);
        this.carta[3] = new Consumible(TipoDeConsumible.PLATO_PRINCIPAL, "Grande de Fugazzeta", 600);
        this.carta[4] = new Consumible(TipoDeConsumible.BEDIDA, "Cerveza", 300);
        this.carta[5] = new Consumible(TipoDeConsumible.BEDIDA, "Coca 2lts", 200);
        this.carta[6] = new Consumible(TipoDeConsumible.POSTRE, "Budin de Pan", 800);
        this.carta[7] = new Consumible(TipoDeConsumible.POSTRE, "Helado", 800);
    }

    private void altaDeCaja() {
        this.caja = new Caja();
    }

    public void altaDeMozos(Mozo[] mozos) {
        this.mozos = mozos;
    }

    public String getMesasDisponibles() {
        String mesasDisponibles = "";
        boolean ninguna = true;

        for (int i = 0; i < this.mozos.length; i++) {
            Mozo mozo = this.mozos[i];
            if (mozo != null) {
                Mesa[] mesas = mozo.getMesas();
                for (int j = 0; j < mesas.length; j++) {
                    Mesa mesa = mesas[j];
                    if (mesa != null && mesa.estaLibre()) {
                        mesasDisponibles += mesa;
                        ninguna = false;
                    }
                }
            }
        }

        if (ninguna) {
            return "Todas las estan ocupadas";
        }

        return mesasDisponibles;
    }

    public boolean ingresarComensales(int numeroDeMesa, int comensales) {
        Mozo mozo = getMozoPorNumeroDeMesa(numeroDeMesa);
        if (mozo == null) {
            return false;
        }

        return mozo.abrirMesa(numeroDeMesa, comensales);
    }

    public boolean agregarPedidoAlaMesa(int numeroDeMesa, Pedido pedido) {
        Mozo mozo = getMozoPorNumeroDeMesa(numeroDeMesa);
        if (mozo == null) {
            return false;
        }

        return mozo.atenderMesa(numeroDeMesa, pedido);
    }

    public boolean cerrarMesa(int numeroDeMesa) {
        Mozo mozo = getMozoPorNumeroDeMesa(numeroDeMesa);
        if (mozo == null) {
            return false;
        }

        this.caja.agregarTotalPedido(mozo.cerrarMesa(numeroDeMesa));

        return true;
    }

    public double cerrarCaja() {
        double totalDelDia = 0;
        if (caja != null) {
            totalDelDia = caja.getTotal();
            this.caja.cerrar();
        }
        return totalDelDia;
    }

    public String getCarta() {
        String carta = "";

        for (int i = 0; i < this.carta.length; i++) {
            Consumible consumible = this.carta[i];
            if (consumible != null) {
                carta += i + ") " + consumible;
            }
        }

        return carta;
    }

    public Consumible getConsumible(int numeroConsumible) {

        if (numeroConsumible < 0 || numeroConsumible > this.carta.length) {
            return null;
        }

        return this.carta[numeroConsumible];
    }

    public String listadoDeMozos() {
        String listadoDeMozos = "";

        for (int i = 0; i < this.mozos.length; i++) {
            Mozo mozo = this.mozos[i];
            if (mozo != null) {
                listadoDeMozos += mozo;
            }
        }

        return listadoDeMozos;
    }

    public String listadoDeMozosConFacturacion() {
        ordernarMozosPorFacturacion();
        return listadoDeMozos();
    }

    private void ordernarMozosPorFacturacion() {
        Mozo auxiliar;
        for (int i = 1; i <= this.mozos.length; i++) {
            for (int j = 0; j < this.mozos.length - 1; j++) {
                if (this.ordernarMozoPorFacturacion(this.mozos[j], this.mozos[j + 1])) {
                    auxiliar = this.mozos[j + 1];
                    this.mozos[j + 1] = this.mozos[j];
                    this.mozos[j] = auxiliar;
                }
            }
        }
    }

    private boolean ordernarMozoPorFacturacion(Mozo mozoUno, Mozo mozoDos) {

        if (mozoUno == null || mozoDos == null) {
            return false;
        }

        return mozoUno.getFacturacionDelDia() > mozoDos.getFacturacionDelDia();
    }

    private Mozo getMozoPorNumeroDeMesa(int numeroDeMesa) {
        for (int i = 0; i < this.mozos.length; i++) {
            Mozo mozo = this.mozos[i];
            if (mozo != null) {
                Mesa mesa = mozo.getMesa(numeroDeMesa);
                if (mesa != null) {
                    return mozo;
                }
            }
        }
        return null;
    }
}