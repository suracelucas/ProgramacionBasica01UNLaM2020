package ar.edu.unlam.pb1.trabajoPractico04.dominio;

public class Dia {
	private byte numeroDeDia;

	public Dia(byte numeroDeDia) {
		this.setNumeroDeDia(numeroDeDia);
	}
	
	public byte getNumeroDeDia() {
		return numeroDeDia;
	}

	public void setNumeroDeDia(byte numeroDeDia) {
		if(numeroDeDia >=1 && numeroDeDia <=7) {
			this.numeroDeDia = numeroDeDia;
		}
	}
	
	public String getNombreDelDia(){
		String nombre;
		switch(this.numeroDeDia) {
			case 1: 
				nombre = "Domingo";
			break;
			case 2: 
				nombre = "Lunes";
			break;
			case 3: 
				nombre = "Martes";
			break;
			case 4: 
				nombre = "Miercoles";
			break;
			case 5: 
				nombre = "Jueves";
			break;
			case 6: 
				nombre = "Viernes";
			break;
			case 7: 
				nombre = "Sabado";
			break;
			default: 
			nombre = "No reconocido";
		}
		return nombre;
	}
}
