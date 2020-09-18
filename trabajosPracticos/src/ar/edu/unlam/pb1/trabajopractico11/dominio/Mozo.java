package ar.edu.unlam.pb1.trabajopractico11.dominio;

public class Mozo {
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    private double facturacionDelDia;

    private Mesa[] mesas;

    private static final int MAXIMA_CANTIDAD_MESAS_POR_MOZO = 4;

    public Mozo(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.facturacionDelDia = 0.0;

        altaMesas();
    }

    public Mozo(String nombre, String apellido, String sexo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.facturacionDelDia = 0.0;

        altaMesas();
    }

    private void altaMesas() {
        this.mesas = new Mesa[MAXIMA_CANTIDAD_MESAS_POR_MOZO];
        for (int i = 0; i < this.mesas.length; i++) {
            this.mesas[i] = new Mesa();
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getSexo() {
        return this.sexo;
    }

    public int getEdad() {
        return this.edad;
    }

    public Mesa[] getMesas() {
        return this.mesas;
    }

    public double getFacturacionDelDia() {
        return facturacionDelDia;
    }

    public boolean abrirMesa(int numeroDeMesa, int comensales) {
        Mesa mesa = getMesa(numeroDeMesa);
        if (mesa == null || mesa.estaOcupada()) {
            return false;
        }

        mesa.ocupar(comensales);

        return true;
    }

    public boolean atenderMesa(int numeroDeMesa, Pedido pedido) {
        Mesa mesa = getMesa(numeroDeMesa);
        if (mesa == null || mesa.estaLibre()) {
            return false;
        }

        return mesa.agregarPedido(pedido);
    }

    public double cerrarMesa(int numeroDeMesa) {
        Mesa mesa = getMesa(numeroDeMesa);
        if (mesa == null || mesa.estaLibre()) {
            return 0.0;
        }

        return cobrarMesa(mesa);
    }

    private double cobrarMesa(Mesa mesa) {
        double total = mesa.cerrar();
        this.facturacionDelDia += total;
        return total;
    }

    public Mesa getMesa(int numeroDeMesa) {
        for (int i = 0; i < this.mesas.length; i++) {
            Mesa mesa = this.mesas[i];
            if (mesa != null && mesa.getNumero() == numeroDeMesa) {
                return mesa;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.getApellido() + ", " + this.getNombre() + "\n";
    }
}