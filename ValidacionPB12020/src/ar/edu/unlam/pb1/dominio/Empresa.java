package ar.edu.unlam.pb1.dominio;

public class Empresa {

	/*
	 * Identificar e incorporar los atributos necesarios.
	 */
	
	private String nombre;
	private Producto catalogo[];
	private final int CANTIDAD_MAXIMA_DE_ITEMS = 5;
	private int itemActual = 0;
	private Venta ventas[];
	private final int CANTIDAD_MAXIMA_DE_VENTAS = 5;
	private int ventaActual = 0;

	public Empresa(String nombre) {
		/*
		 * Costructor de la clase.
		 */
		this.nombre = nombre;
		this.catalogo = new Producto[CANTIDAD_MAXIMA_DE_ITEMS];
		this.ventas = new Venta[CANTIDAD_MAXIMA_DE_VENTAS];
	}
	
	public String getNombre() {
		/*
		 * Devuelve el nombre de la empresa.
		 */
		return this.nombre;

	}
	
	public void agregarProducto(Producto nuevo) {
		/*
		 * Agrega un producto al catalogo
		 */
		catalogo[itemActual] = nuevo;
		itemActual++;

	}
	
	public void realizarVenta(Venta nueva) {
		/*
		 * Registra una venta
		 */
		this.ventas[ventaActual] = nueva;
		ventaActual++;

	}
	
	public Producto getProductoPorNombre(String nombreDelProducto) {
		/*
		 * Busca y devuelve un producto basado en su nombre
		 */
		Producto busqueda = null;
		for(int i = 0; i<itemActual; i++) {
			if(catalogo[i].getDescripcion().equalsIgnoreCase(nombreDelProducto)) {
				busqueda = catalogo[i];
			}
		}
		return busqueda;
	}
	
	public double getImportePromedioDeVentas() {
		/*
		 * Busca y devuelve un producto basado en su nombre
		 */
		double resultado = 0.0;
		for(int i = 0; i<ventaActual; i++) {
			resultado += ventas[i].getImporteTotal();
		}
		resultado /= ventaActual;
		return resultado;

	}
	
	public void ordenarLosProductosPorCodigo() {
		/*
		 * Ordena el catalogo de productos por codigo
		 */
		for(int i = 1; i <= itemActual; i++) {
			for(int j = 0; j < itemActual-1; j++) {
				if(catalogo[j].getCodigo()>catalogo[j+1].getCodigo()) {
					Producto aux = catalogo[j];
					catalogo[j] = catalogo[j+1];
					catalogo[j+1] = aux;
				}
			}
		}

	}
	
	public String toString() {
		/*
		 * Devuelve un listado con el catalogo de productos 
		 */
		String cadena = "";
		for(int i = 0; i<itemActual;i++){
			cadena+= "\n" + catalogo[i].getDescripcion();
		}
		return("Listado de productos:\n" + cadena);
	}
}
