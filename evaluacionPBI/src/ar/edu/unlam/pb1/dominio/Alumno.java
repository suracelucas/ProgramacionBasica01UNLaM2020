package ar.edu.unlam.pb1.dominio;

public class Alumno {

	private String nombre;
	private int dni;
	private String parciales[];
	private final int CANTIDAD_DE_PARCIALES = 2;
	private double notas[];
	private int cantidadDeParcialesRendidos = 0;
	
	public Alumno(int dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.parciales = new String[CANTIDAD_DE_PARCIALES];
		this.notas = new double[CANTIDAD_DE_PARCIALES];
	}
	
	public void inscribirAlExamen(String nombreExamen) {
		parciales[cantidadDeParcialesRendidos] = nombreExamen;
		cantidadDeParcialesRendidos++;
	}
	
	public void rendir(String nombreDelExamen, double nota) {
		for(int i = 0; i<cantidadDeParcialesRendidos; i++) {
			if(parciales[i].equalsIgnoreCase(nombreDelExamen)) {
				this.notas[i] = nota;
			}
		}
	}
	
	public double getNotas(int indice) {
		return this.notas[indice];
	}
	
	public boolean aprobo() {
		boolean resultado = false;
		
		if(calcularPromedio() >= 4) {
			resultado = true;
		}
		return resultado;
		
	}

	public double calcularPromedio() {
		double resultado = 0.0;
		double valorADevolver = 0.0;
		for(int i = 0; i<cantidadDeParcialesRendidos; i++) {
			resultado+= notas[i];
		}
		valorADevolver = resultado/cantidadDeParcialesRendidos;
		return valorADevolver;
	}
	
	public String toString() {
		return this.nombre;
	}
	
}
