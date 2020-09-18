package ar.edu.unlam.pb1.trabajoPractico09.dominio;

public class Concesionaria {
    private Vehiculo[] vehiculos;
    private int ultimaPosicion;
    private String nombre;

    private static int MAXIMA_CANTIDAD_VEHICULOS = 500;

    public Concesionaria(String nombre) {
        this.vehiculos = new Vehiculo[MAXIMA_CANTIDAD_VEHICULOS];
        this.ultimaPosicion = 0;
        this.nombre = nombre;
    }

    public void ingresarNuevoVehiculo(Vehiculo vehiculo) {
        this.vehiculos[ultimaPosicion] = vehiculo;
        this.ultimaPosicion++;
    }

    public int getUltimaPosicion() {
    	return this.ultimaPosicion;
    }
    
    public Vehiculo[] getCoches() {
    	return vehiculos;
    }
    
    public String toString() {
        String mensaje = "";

        for (int i = 0; i < this.ultimaPosicion; i++) {
            mensaje += i + ") " + this.vehiculos[i].toString() + "\n";
        }

        return mensaje;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String mostrarDetalleVehiculo(int codigo) {
        if (codigo > this.ultimaPosicion) {
            return "";
        }
        return this.vehiculos[codigo].toString();
    }
}