package ar.edu.unlam.pb1.trabajopractico11.dominio;

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
        this.vehiculos[ultimaPosicion].setCodigo(ultimaPosicion);
        this.ultimaPosicion++;
    }
    
    public Vehiculo[]getCoches(){
    	return vehiculos;
    }
    
    
    public int getUltimaPosicion() {
    	return ultimaPosicion;
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

    public Vehiculo[] buscarCochesPorPrecio(double minimo, double maximo) {
    	Vehiculo[] resultados = new Vehiculo[MAXIMA_CANTIDAD_VEHICULOS];
        int posicion = 0;

        if (maximo < minimo || maximo <= 0 || minimo <= 0) {
            return null;
        }

        for (int i = 0; i < this.ultimaPosicion; i++) {
        	Vehiculo vehiculo = this.vehiculos[i];
            if (vehiculo.getPrecio() >= minimo && vehiculo.getPrecio() <= maximo) {
                resultados[posicion] = vehiculo;
                posicion++;
            }
        }

        if (posicion == 0) {
            return null;
        }

        return resultados;
    }

    public Vehiculo[] buscarCochesPorMarca(String marca) {
    	Vehiculo[] resultados = new Vehiculo[MAXIMA_CANTIDAD_VEHICULOS];
        int posicion = 0;

        if (marca.length() == 0) {
            return null;
        }

        for (int i = 0; i < this.ultimaPosicion; i++) {
        	Vehiculo vehiculo = this.vehiculos[i];
            if (marca.equalsIgnoreCase(vehiculo.getMarca())) {
                resultados[posicion] = vehiculo;
                posicion++;
            }
        }

        if (posicion == 0) {
            return null;
        }

        return resultados;
    }

    public Vehiculo[] buscarCochesPorModelo(String modelo) {
    	Vehiculo[] resultados = new Vehiculo[MAXIMA_CANTIDAD_VEHICULOS];
        int posicion = 0;

        if (modelo.length() == 0) {
            return null;
        }

        for (int i = 0; i < this.ultimaPosicion; i++) {
        	Vehiculo vehiculo = this.vehiculos[i];
            if (modelo.equalsIgnoreCase(vehiculo.getModelo())) {
                resultados[posicion] = vehiculo;
                posicion++;
            }
        }

        if (posicion == 0) {
            return null;
        }

        return resultados;
    }
}