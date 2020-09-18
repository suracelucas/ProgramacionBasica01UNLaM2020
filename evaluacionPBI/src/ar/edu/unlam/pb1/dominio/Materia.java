package ar.edu.unlam.pb1.dominio;

public class Materia {
	private String nombre;
	private int codMateria;
	private Alumno alumnos[];
	private final int CANTIDAD_MAXIMA_DE_ALUMNOS = 3;
	private int alumnoActual = 0;
	
	public Materia(int codMateria, String nombre) {
		this.nombre = nombre;
		this.codMateria = codMateria;
		this.alumnos = new Alumno[CANTIDAD_MAXIMA_DE_ALUMNOS];
	}
	
	public void agregarAlumno(Alumno alumnoAAgregar) {
		this.alumnos[alumnoActual] = alumnoAAgregar;
		alumnoActual++;
	}
	
	public int getCantidadDeAlumnos() {
		return this.alumnoActual;
	}
	
	public double calcularElPromedioDelParcial(int indice) {
		return alumnos[indice].getNotas(indice);
	}
	
	public Alumno obtenerAlumno(int indice) {
		
		return this.alumnos[indice];
	}
	
	public double calcularLaNotaMasAlta(int indice) {
		
		double mayor = 0.0;
		double[] notasABuscar = new double[alumnoActual];
		
		for(int i = 0; i<notasABuscar.length;i++) {
			notasABuscar[i] = alumnos[i].getNotas(indice);
		}
		
		for(int i = 1; i <= notasABuscar.length; i++) {
			for(int j = 0; j < notasABuscar.length-1; j++) {
				if(notasABuscar[j]>notasABuscar[j+1]) {
					Alumno aux = alumnos[j];
					alumnos[j] = alumnos[j+1];
					alumnos[j+1] = aux;
				}
			}
		}
		mayor = notasABuscar[notasABuscar.length-1];
		return mayor;
	}
	
	public int calcularLaCantidadDePromocionados() {
		int cantidad = 0;
		for(int i = 0; i <alumnoActual; i++) {
			if(alumnos[i].calcularPromedio() >=7) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
}
