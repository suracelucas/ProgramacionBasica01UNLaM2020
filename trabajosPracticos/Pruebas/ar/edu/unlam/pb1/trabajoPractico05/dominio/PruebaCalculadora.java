package ar.edu.unlam.pb1.trabajoPractico05.dominio;

public class PruebaCalculadora {
    public static void main(String args[]){
        Calculadora calculadora1 = new Calculadora(4,5);
        /*Calculadora calculadora2 = new Calculadora();

        System.out.println("La suma de los operadores es: "+calculadora1.sumar());
        System.out.println("La multiplicacion de los operadores es: "+calculadora1.multiplicar());
        System.out.println("La resta de los operadores es: "+calculadora1.restar());
        System.out.println("La division de los operadores es: "+calculadora1.dividir()+"\n");

        System.out.println("La suma de los operadores es: "+calculadora2.sumar(8,9));
        System.out.println("La multiplicacion de los operadores es: "+calculadora2.multiplicar(7,3));
        System.out.println("La resta de los operadores es: "+calculadora2.sumar(7,3));
        System.out.println("La division de los operadores es: "+calculadora2.dividir(7,0)+"\n");

        if(calculadora1.esPositivo(6)){
            System.out.println("El operador es positivo");
        }else{
            System.out.println("El operador es negativo");
        }
        if(calculadora1.esPositivo(-13.5)){
            System.out.println("El operador es positivo");
        }else{
            System.out.println("El operador es negativo");
        }*/
        
        System.out.println("Potencia: "+calculadora1.potencia(2, 5));
        System.out.println("Sumatoria: "+calculadora1.sumatoria(3));
        System.out.println("Sumatoria de limites: "+calculadora1.sumatoria(4,5));
        System.out.println("Productoria: "+calculadora1.productoria(10));
        System.out.println("Productoria de limites: "+calculadora1.productoria(1,5));
        System.out.println("Divisores: "+calculadora1.contarDivisores(10));
    }
}