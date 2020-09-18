package ar.edu.unlam.pb1.trabajoPractico06.dominio;

public class Automovil {
    private double velocidad;
    private double horas;
    private double minutos;
    private double aceleracionEnMetrosPorSegundos;
    private double velocidadMaximaEnKmPorHora;

    private final int HORA_EN_SEGUNDOS = 3600;
    private final int MINUTO_EN_SEGUNDOS = 60;
    private final int KILOMETRO_EN_METRO = 1000;

    private final double METRO_POR_SEGUNDO_A_KM_POR_SEGUNDO = 3.6;

    public Automovil() {
        this.velocidad = 0;
        this.horas = 0;
        this.minutos = 0;
        this.aceleracionEnMetrosPorSegundos = 0;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setTiempo(double horas, double minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }

    public void setAceleracionEnMetrosPorSegundos(double aceleracionEnMetrosPorSegundos) {
        this.aceleracionEnMetrosPorSegundos = aceleracionEnMetrosPorSegundos;
    }

    public void setVelocidadMaximaEnKmPorHora(double velocidadMaximaEnKmPorHora) {
        this.velocidadMaximaEnKmPorHora = velocidadMaximaEnKmPorHora;
    }

    public double calcularDistancia() {
        double tiempo = (this.horas * HORA_EN_SEGUNDOS) + (this.minutos * MINUTO_EN_SEGUNDOS);
        double velocidadEnMetros = this.velocidad * KILOMETRO_EN_METRO;
        return velocidadEnMetros * tiempo;
    }

    public double alcanzarVelocidadMaxima() {
        double velocidadActual = 0;
        double velocidadMaximaEnMetroPorSegundo = this.convertirAMetroPorSegundo(this.velocidadMaximaEnKmPorHora);
        double tiempoEnsegundos = 0;

        while (velocidadActual <= velocidadMaximaEnMetroPorSegundo) {
            velocidadActual += velocidadActual + this.aceleracionEnMetrosPorSegundos * tiempoEnsegundos;
            tiempoEnsegundos++;
        }

        return tiempoEnsegundos;
    }

    private double convertirAMetroPorSegundo(double valor) {
        return valor / METRO_POR_SEGUNDO_A_KM_POR_SEGUNDO;
    }
}