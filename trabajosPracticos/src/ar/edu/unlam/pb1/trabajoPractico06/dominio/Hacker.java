package ar.edu.unlam.pb1.trabajoPractico06.dominio;

public class Hacker {
	
	private static final byte DOS = 2;
	private static final double PORCIENTO = 0.10; 
	
	public Hacker() {
	}

	public double extraerDinero(Cuenta cuentaASacarPlata) {
		double dineroConseguido = 0;
		double mitadSaldoOriginal = (cuentaASacarPlata.getSaldo()/DOS);
		double retiro = cuentaASacarPlata.getSaldo()*PORCIENTO;
		
		while((cuentaASacarPlata.getSaldo()-retiro)>mitadSaldoOriginal) {
			retiro =cuentaASacarPlata.getSaldo()*PORCIENTO;
			cuentaASacarPlata.retirar(retiro);
			dineroConseguido += retiro;
		}
		return dineroConseguido;
	}
}
