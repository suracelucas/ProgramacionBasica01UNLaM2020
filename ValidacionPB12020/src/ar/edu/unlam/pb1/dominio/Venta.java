package ar.edu.unlam.pb1.dominio;

public class Venta{
	/*
	 * Identificar e incorporar los atributos necesarios.
	 */

	private Integer dni;
	private String nombreDelCliente;
	private int cantidadDeProductosComprados = 0;
	Producto carrito[];
	private final int CANTIDAD_MAXIMA_DE_ITEMS = 5;
	
	public Venta(Integer dni, String nombreDelCliente)  {
		/*
		 * Costructor de la clase.
		 */
		this.dni = dni;
		this.nombreDelCliente = nombreDelCliente;
		this.carrito = new Producto[CANTIDAD_MAXIMA_DE_ITEMS];
	}
	
	public int getDni() {
		/*
		 * Devuelve el dni del cliente.
		 */
		return this.dni;
	}
	
	public String getNombrDelCliente() {
		/*
		 * Devuelve el dni del cliente.
		 */
		return this.nombreDelCliente;
	}
	
	public void agregarItem(Producto producto) {
		/*
		 * Agrega un producto a la venta
		 */
		carrito[cantidadDeProductosComprados] = producto;
		cantidadDeProductosComprados ++;
	}
	
	public int getCantidadDeProductosComprados() {
		/*
		 * Devuelve la cantidad de proctos comprados 
		 */
		return cantidadDeProductosComprados;
	}
	
	public double getImporteTotal() {
		/*
		 * Importe total de la venta o sumatoria del precio del producto
		 */
		double importe = 0.0;
		for(int i = 0; i<cantidadDeProductosComprados; i++) {
			importe+= carrito[i].getPrecio();
		}
		return importe;

	}
	
	public String toString() {
		/*
		 * Devuelve infomacion de la venta (Nombre del cliente e importe total)
		 */
		return("Nombre del cliente: " + this.nombreDelCliente + ". Importe total: " + getImporteTotal());
	}

}
