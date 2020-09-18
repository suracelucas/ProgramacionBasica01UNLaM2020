package ar.edu.unlam.pb1.trabajoPractico05.dominio;

public class OtrasVidasNoTanEjemplares {
    public static void main(String args[]){
    
        Persona mauricio, marcos, eugenia, elisa;
        //a. mauricio: Se espera visualizar el siguiente resultado por pantalla: Mauricio es un hombre de 50 anos de edad, pesa 70 kilos, mide 1.70 y su DNI es 33999776. ¿Qué instrucciones ejecutarías para lograr el objetivo? 
        mauricio = new Persona("Mauricio","Hombre",33999776,70.0,1.70);
        for(int i =0; i<50;i++) {
        	mauricio.cumplirAnos();
        }
        
        System.out.println(mauricio.toString());

        //b. marcos. Se espera visualizar el siguiente resultado por pantalla: Marcos es un hombre de 30 anos de edad, pesa 80 kilos, mide 1.75 y su DNI es 2315321. ¿Qué instrucciones ejecutarías para lograr el objetivo?
        marcos = new Persona("Marcos", "Hombre", 2315321, 80.0, 1.70);
        for(int i=0; i<30;i++) {
        	marcos.cumplirAnos();	
        }
        
        System.out.println(marcos.toString());

        //c. eugenia. Se espera visualizar el siguiente resultado por pantalla: Eugenia es una mujer de 40 anos de edad, pesa 60 kilos, mide 1.69 cm y su DNI es 2154215. ¿Qué instrucciones ejecutarías para lograr el objetivo?
        eugenia = new Persona("Eugenia", "Mujer", 2154215, 60.0, 1.69);
        for(int i =0; i<40;i++) {
        	eugenia.cumplirAnos();
        }
        
        System.out.println(eugenia.toString());

        //d. Elisa. Se espera visualizar el siguiente resultado por pantalla: Elisa es una mujer de 60 anos de edad, pesa 150 kilos, mide 1.60 cm y su DNI es 63215478. ¿Qué instrucciones ejecutarías para lograr el objetivo?
        elisa = new Persona("Elisa", "Mujer", 63215478, 150.0, 1.60);
        for(int i=0; i<60;i++) {
        	elisa.cumplirAnos();
        }
        
        System.out.println(elisa.toString());

        //e. Para el primer objeto creado (mauricio) invocá el método morir, luego mostrá por pantalla nuevamente el método toString(). ¿Qué se observa? 
        mauricio.morir();
        System.out.println(mauricio.toString());
        // Se imprime el texto Mauricio fue una gran persona que se llevaba muy bien con sus vecinos. QEPD
    }
}