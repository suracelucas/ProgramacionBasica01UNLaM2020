package ar.edu.unlam.pb1.trabajoPractico08.dominio;

public class Calculadora {
	private String marca;

    public Calculadora() {
        this.marca = "CASIO";
    }

    public double obtenerPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double obtenerNumeroDelCeroAlDiezAleatoriamente() {
        return Math.round(Math.random() * 10);
    }
    
    public double sumar(double operadorUno, double operadorDos) {
        return operadorUno + operadorDos;
    }

    public double restar(double operadorUno, double operadorDos) {
        return operadorUno - operadorDos;
    }

    public double multiplicar(double operadorUno, double operadorDos) {
        return operadorUno * operadorDos;
    }

    public double dividir(double numerador, double divisor) {
        if (divisor == 0) {
            return 0;
        }
        return numerador / divisor;
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double raizCuadrada(double valor) {
        return Math.sqrt(valor);
    }

    public double valorAbsoluto(double valor) {
        return Math.abs(valor);
    }
}
