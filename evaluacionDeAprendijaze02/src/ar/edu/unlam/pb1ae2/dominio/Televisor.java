package ar.edu.unlam.pb1ae2.dominio;

public class Televisor {

//	private static final char ENTRADA_TELEVISION_DE_AIRE = 'A';
//	private static final char ENTRADA_TELEVISION_POR_CABLE = 'C';
//	private static final char ENTRADA_HDMI1 = '1';
//	private static final char ENTRADA_HDMI2 = '2';
//	private static final char ENTRADA_USB = 'U';

	private final byte CANAL_MAXIMO_TELEVISION_ABIERTA;
	private final short CANAL_MAXIMO_TELEVISION_POR_CABLE;
	private final byte CANAL_MINIMO_TELEVISION;

	private final byte VOLUMEN_MINIMO = 0;
	private final byte VOLUMEN_MAXIMO = 100;
	private boolean encendido;
	private byte volumenActual;
	private short canalActual;
	private char entradaActual;

	public Televisor(byte canalMaximoTelevisionAbierta, short canalMaximoTelevisionPorCable) {

	}


	private short convertirAShort(char primerDigito, char segundoDigito, char tercerDigito, char cuartoDigito) {
		final short MILENA = 1000;
		final short CENTENA = 100;
		final short DECENA = 10;

		short claveRecibida = (short) ((short) (convertirAShort(primerDigito) * MILENA)
				+ (short) (convertirAShort(segundoDigito) * CENTENA) + (short) (convertirAShort(tercerDigito) * DECENA)
				+ (short) (convertirAShort(cuartoDigito)));

		return claveRecibida;
	}

	private short convertirAShort(char primerDigito, char segundoDigito, char tercerDigito) {
		final short CENTENA = 100;
		final short DECENA = 10;

		short claveRecibida = (short) ((short) (convertirAShort(primerDigito) * CENTENA)
				+ (short) (convertirAShort(segundoDigito) * DECENA) + (short) (convertirAShort(tercerDigito)));

		return claveRecibida;
	}

	private short convertirAShort(char primerDigito) {
		final short DECENA = 10;
		final short ASCII_CERO = 48;

		short claveRecibida = (short) (((short) primerDigito) - ASCII_CERO);
		return claveRecibida;
	}
}
