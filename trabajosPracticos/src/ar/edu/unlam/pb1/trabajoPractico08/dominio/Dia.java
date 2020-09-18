package ar.edu.unlam.pb1.trabajoPractico08.dominio;

public class Dia {
	 private Dias dia;

	    public Dia(Dias dia) {
	        this.dia = dia;
	    }

	    public String getNombreDelDia() {
	        switch (dia) {
	            case DOMINGO:
	                return "Domingo";
	            case LUNES:
	                return "Lunes";
	            case MARTES:
	                return "Martes";
	            case MIERCOLES:
	                return "Miercoles";
	            case JUEVES:
	                return "Jueves";
	            case VIERNES:
	                return "Viernes";
	            case SABADO:
	                return "Sabado";
	        }

	        return "Dia no encontrado";
	    }
}
