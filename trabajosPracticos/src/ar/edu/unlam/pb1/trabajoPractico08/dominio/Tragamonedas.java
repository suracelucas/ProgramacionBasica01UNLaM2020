package ar.edu.unlam.pb1.trabajoPractico08.dominio;

public class Tragamonedas {
	  private Tambor[] tambores;

	    public Tragamonedas() {
	        this.tambores = new Tambor[] { new Tambor(), new Tambor(), new Tambor() };
	    }

	    public void girar() {
	        for (int i = 0; i < this.tambores.length; i++) {
	            this.tambores[i].girar();
	        }
	    }

	    public String getPosiciones() {
	        String posiciones = "";

	        for (int i = 0; i < this.tambores.length; i++) {
	            int tamborNumero = i + 1;
	            posiciones += "Posicion de tambor " + tamborNumero + " es " + this.tambores[i].getPosicion();
	            if (tamborNumero != this.tambores.length) {
	                posiciones += "\n";
	            }
	        }

	        return posiciones;
	    }

	    public boolean hayPremio() {
	        boolean hayPremio = false;

	        int primerTambor = this.tambores[0].getPosicion();
	        for (int i = 1; i < this.tambores.length; i++) {
	            hayPremio = primerTambor == this.tambores[i].getPosicion();
	            if (!hayPremio) {
	                break;
	            }
	        }

	        return hayPremio;
	    }
}
