package ar.edu.unlam.pb1.trabajoPractico06.dominio;

public class Destornillador {
	private final TipoDeCabeza TIPO_DE_CABEZA;
	
	
	public Destornillador(TipoDeCabeza tipoDeCabeza) {
		this.TIPO_DE_CABEZA = tipoDeCabeza;
	}
	
	public void desatornillar(Tornillo tornillo) {
		if(this.TIPO_DE_CABEZA == tornillo.getTipoDeCabeza()) {
			while(tornillo.girar(Sentido.SENTIDO_ANTIHORARIO)) {
				
			}
		}
	}
	
	public void atornillar(Tornillo tornillo) {
		if(this.TIPO_DE_CABEZA == tornillo.getTipoDeCabeza()) {
			while(tornillo.girar(Sentido.SENTIDO_HORARIO)) {
			}
		}
	}
	
	public void desatornillar(Tornillo tornillo, Tarugo tarugo) {
		if(this.TIPO_DE_CABEZA == tornillo.getTipoDeCabeza()) {
			while(tornillo.girar(Sentido.SENTIDO_ANTIHORARIO)) {
			}
		}
	}
	
	public void atornillar(Tornillo tornillo, Tarugo tarugo) {
		if(this.TIPO_DE_CABEZA == tornillo.getTipoDeCabeza()) {
			while(tornillo.getPosicionActual() > tarugo.getLongitud()) {
				tornillo.girar(Sentido.SENTIDO_HORARIO);
			}
		}
	}
}
