package ar.edu.unlam.pb1.trabajoPractico04.dominio;

public class Letra {
	private char letra;
	
	public Letra(char letra) {
		this.letra = letra;
	}
	
	public boolean esVocal() {
		boolean vocal = false;
		switch(this.letra) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				vocal = true;
			break;
		}
		return vocal;
	}
	
	public char getLetra() {
		return this.letra;
	}
}
