package ar.edu.unlam.pb1.trabajoPractico05.dominio;

public class Calculadora {
    private double operador1;
    private double operador2;

    public Calculadora(){
        operador1 = 0;
        operador2 = 0.0;
    }

    public Calculadora(double operador1, double operador2){
        this.operador1 = (int)operador1;
        this.operador2 = operador2;
    }

    public double sumar(){
        return (this.operador1 + this.operador2);
    }

    public double sumar(double operador1, double operador2){
        return (operador1 + operador2);
    }

    public double restar(){
        return (this.operador1 - this.operador2);
    }

    public double restar(double operador1, double operador2){
        return (operador1 - operador2);
    }

    public double multiplicar(){
        return (this.operador1 * this.operador2);
    }

    public double multiplicar(double operador1, double operador2){
        return (operador1 * operador2);
    }

    public double dividir(){
        double resultado = 0.0;
        if(this.operador2 != 0){
            resultado = this.operador1 / this.operador2;
        }
        return resultado;
    }
    
    public double dividir(double numerador, double divisor){
        double resultado = 0.0;
        if(divisor != 0){
            resultado = numerador / divisor;
        }
        return resultado;
    }

    public boolean esPositivo(double operador){
        if(operador>=0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public double potencia(double base, double exponente) {
    	double resultado = base;
    	if (exponente == 0) {
            return 1;
        }
    	for (int i = 1; i < exponente; i++) {
            resultado *= base;
        }
    	return resultado;
    }
    
    public double sumatoria(int limite) {
    	int resultado = 0;
    	for(int i = 1;i<=limite;i++) {
    		resultado+=i;
    	}
    	return resultado;
    }
    
    public int sumatoria(int limiteInferior, int limiteSuperior) {
    	int resultado = 0;
    	for(int i = limiteInferior;i<=limiteSuperior;i++) {
    		resultado+=i;
    	}
    	return resultado;
    }
    
    public int productoria(int limite) {
    	int resultado = 1;
    	for(int i = 1;i<=limite;i++) {
    		resultado*=i;
    	}
    	return resultado;
    }
    
    public int productoria(int limiteInferior, int limiteSuperior) {
    	int resultado = 1;
    	for(int i = limiteInferior;i<=limiteSuperior;i++) {
    		resultado*=i;
    	}
    	return resultado;
    }
    
    public String contarDivisores(int numero) {
    	String resultado="";
    	for(int i = 1;i<=numero;i++) {
    		if(numero%i==0) {
    			resultado += " " + i + "," ;
    		}
    	}
    	return resultado;
    }
    
}