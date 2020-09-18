package ar.edu.unlam.pb1.trabajoPractico08.dominio;

public class Cuenta {
	 private String titular;
	    private double saldo;

	    public Cuenta(String titular) {
	        this.titular = titular;
	        this.saldo = 0;
	    }

	    public Cuenta(String titular, double saldoInicial) {
	        this.titular = titular;
	        this.saldo = saldoInicial;
	    }

	    public String getTitular() {
	        return this.titular;
	    }

	    public void setTitular(String titular) {
	        this.titular = titular;
	    }

	    public double getSaldo() {
	        return this.saldo;
	    }

	    public String toString() {
	        return "Titular: " + this.titular + "\n" + "Saldo: " + this.saldo + "\n";
	    }

	    public void depositar(double cantidad) {
	        if (cantidad > 0) {
	            this.saldo += cantidad;
	        }
	    }

	    public void retirar(double cantidad) {
	        if (cantidad > 0 && cantidad <= this.saldo) {
	            this.saldo = this.saldo - cantidad;
	        }
	    }
}
