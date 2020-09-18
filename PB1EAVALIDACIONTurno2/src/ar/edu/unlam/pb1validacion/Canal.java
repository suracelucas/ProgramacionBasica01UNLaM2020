package ar.edu.unlam.pb1validacion;

public class Canal {

	private String nombre;
	private Propaganda propagandas[];
	private double precioDelSegundoDeLaPropaganda;
	private final int DURACION_MENOR_EN_SEGUNDOS = 5;
	private static int propagandaActual = 0;
	private final int CINCUENTAMIL = 50000;

	// Complete el siguiente constructor
	public Canal(String nombre, int cantidadDePropaganda, double precioPropaganda) {

		this.nombre = nombre;
		this.propagandas = new Propaganda[cantidadDePropaganda];
		this.precioDelSegundoDeLaPropaganda = precioPropaganda;
		
	}

	public boolean agregarPropaganda(Propaganda propaganda) {
		// No se pueden agregar propaganda cuya duracion sea menor a 5s
		// que la cantidad de rpeticiones diarias sea menor a 1
		// Y los codigos de la propaganda deben comenzar con 'P'
		
		String letraP = "P";
		if(propaganda.getDuracion() > DURACION_MENOR_EN_SEGUNDOS && propaganda.getCantidadDeRepetcicionesDiaria()> 1 && !propaganda.getCodigoPropaganda().startsWith(letraP)) {
			propagandas[propagandaActual] = propaganda;
			propagandaActual++;
		}

		return true;

	}

	public double obtenerPrecioPropaganda(String CodigoPropaganda) {

		// dado el codigo de una propaganda se necesita calcular dicho Prcio
		// El precio Se calcula La cantidad de repeticiones diarias por la duracion de
		// la misma
		// y por el precio del segundo establecido por el canal
		double precio = 0.0;
		Propaganda propagandaAbuscar = null;
		for(int i = 0; i<propagandaActual;i++) {
			if(buscarPropaganda(CodigoPropaganda)) {
				propagandaAbuscar = propagandas[i];
			}
		}
		
		if(propagandaAbuscar == null) {
			return precio;
		}else {
			precio = propagandaAbuscar.getCantidadDeRepetcicionesDiaria() * propagandaAbuscar.getDuracion() * this.precioDelSegundoDeLaPropaganda;
		}
		return precio;

	}

	public void inactivarPropaganda(String codigoPropaganda) {
		// dado el codigo de la propaganda Inactivar la misma
		
		for(int i = 0; i<propagandaActual;i++) {
			if(buscarPropaganda(codigoPropaganda)) {
				propagandas[i].setActiva(false);;
			}
		}
	}
	
	private boolean buscarPropaganda(String codigoPropaganda) {
		boolean propagandaAbuscar = false;
		for(int i = 0; i<propagandaActual;i++) {
			if(propagandas[i].getCodigoPropaganda() == codigoPropaganda) {
				propagandaAbuscar = true;
			}
		}
		return propagandaAbuscar;
	}
	
	public int obtenerCantidadDeEmpleadosQuecobranMasDe50MilyNoEstanJubilados() {
		//obtener la candidad de empleados que cobranMas de 50Mil y no estan
		//jubilados
		int contador = 0;
		for(int i = 0; i <propagandaActual; i++) {
			if(obtenerPrecioPropaganda(propagandas[i].getCodigoPropaganda()) > CINCUENTAMIL) {
				contador++;
			}
		}
		return contador;
	}
	

}
