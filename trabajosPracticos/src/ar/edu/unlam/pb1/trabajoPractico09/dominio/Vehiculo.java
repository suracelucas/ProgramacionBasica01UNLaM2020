package ar.edu.unlam.pb1.trabajoPractico09.dominio;

public class Vehiculo {

	 private static final int CERO_KM = 1980;
	    private static final int ANO_ACTUAL = 2020;

	    private static int cantidadCoches;

	    private String marca;
	    private String modelo;
	    private int kilometros;
	    private int ano;
	    private double precio;

	    public Vehiculo() {
	    }

	    public Vehiculo(String marca, String modelo, double precio) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.precio = precio;
	    }

	    public Vehiculo(String marca, String modelo, int kilometros, int ano, double precio) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.kilometros = kilometros;
	        this.ano = ano;
	        this.precio = precio;
	    }

	    public static int getCantidadCoches() {
	        return cantidadCoches;
	    }

	    public void setKilometros(int kilometros) {
	        this.kilometros = kilometros;
	    }

	    public void setPrecio(int precio) {
	        this.precio = (double) precio;
	    }

	    public double getPrecio() {
	        return this.precio;
	    }

	    public int calcularAntiguedad() {
	        return ANO_ACTUAL - this.ano;
	    }

	    public int getKilometros() {
	        return this.kilometros;
	    }

	    public String getMarca() {
	        return this.marca;
	    }

	    public String getModelo() {
	        return this.modelo;
	    }

	    public int getAno() {
	        return this.ano;
	    }

	    public String toString() {
	        String mensaje = "Marca: " + this.getMarca();
	        mensaje += " - modelo: " + this.getModelo();
	        return mensaje;
	    }
	    
}
