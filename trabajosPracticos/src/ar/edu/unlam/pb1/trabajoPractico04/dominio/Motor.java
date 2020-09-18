package ar.edu.unlam.pb1.trabajoPractico04.dominio;

public class Motor {
	private int tipoBomba;
	private String tipoFluido;
	private String combustible;
	
	public Motor() {
		this.tipoBomba = 0;
		this.tipoFluido = null;
		this.combustible = null;
	}

	public int getTipoBomba() {
		return tipoBomba;
	}

	public void setTipoBomba(int tipoBomba) {
		this.tipoBomba = tipoBomba;
	}

	public String getTipoFluido() {
		return tipoFluido;
	}

	public void setTipoFluido(String tipoFluido) {
		this.tipoFluido = tipoFluido;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
	public void dimeTipoMotor() {
		switch(this.tipoBomba) {
			case 0:
				System.out.println("No hay establecido un valor definido para el tipo de bomba.\n");
			break;
			case 1:
				System.out.println("La bomba es una bomba de agua.\n");
			break;
			case 2:
				System.out.println("La bomba es una bomba de gasolina.\n");
			break;
			case 3:
				System.out.println("La bomba es una bomba de hormigon.\n");
			break;
			case 4:
				System.out.println("La bomba es una bomba de pasta alimenticia.\n");
			break;
			default:
				System.out.println("No existe un valor valido para tipo de bomba.\n");
			break;
		}
	}
}
