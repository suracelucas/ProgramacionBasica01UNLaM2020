package ar.edu.unlam.pb1.trabajoPractico08.dominio;

public class Persona {
	  private String nombre;
	    private String genero;
	    private long dni;
	    private double peso;
	    private double altura;
	    private int edad;
	    private boolean viva;

	    private static final int MAYORIA_DE_EDAD = 18;

	    private static final int MAXIMO_VALOR_IMC = 25;
	    private static final int MINIMO_VALOR_IMC = 20;

	    public Persona(String nombre, int edad, double peso, double altura) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.peso = peso;
	        this.altura = altura;
	        this.viva = true;
	    }

	    public Persona(String nombre, String genero, long dni, double peso, double altura) {
	        this.nombre = nombre;
	        this.genero = genero;
	        this.dni = dni;
	        this.peso = peso;
	        this.altura = altura;
	        this.viva = true;
	        this.edad = 0;
	    }

	    public Persona(String nombre, String genero, int edad, long dni, double peso, double altura) {
	        this.nombre = nombre;
	        this.genero = genero;
	        this.edad = edad;
	        this.dni = dni;
	        this.peso = peso;
	        this.altura = altura;
	        this.viva = true;
	    }

	    public String getNombre() {
	        return this.nombre;
	    }

	    public String toString() {
	        String mensaje = "Hola mi nombre es " + this.nombre;
	        mensaje += " soy " + this.genero;
	        mensaje += " y tengo " + this.edad + " años";
	        return mensaje;
	    }

	    public void alimentar(double kilos) {
	        this.peso += kilos;
	    }

	    public void crecer(double metros) {
	        this.altura += metros;
	    }

	    public void cumplirAnos() {
	        this.edad++;
	    }

	    public void morir() {
	        this.viva = false;
	    }

	    public double pesar() {
	        return this.peso;
	    }

	    public int getEdad() {
	        return this.edad;
	    }

	    public boolean esMayorDeEdad() {
	        return this.edad >= MAYORIA_DE_EDAD;
	    }

	    public Imc calcularIMC() {
	        double imc = (this.peso / (this.altura * this.altura));

	        if (imc > MAXIMO_VALOR_IMC) {
	            return Imc.SUPERIOR_AL_PESO_IDEAL;
	        } else if (imc <= MAXIMO_VALOR_IMC && imc >= MINIMO_VALOR_IMC) {
	            return Imc.PESO_IDEAL;
	        }

	        return Imc.INFERIOR_AL_PESO_IDEAL;
	    }
}
