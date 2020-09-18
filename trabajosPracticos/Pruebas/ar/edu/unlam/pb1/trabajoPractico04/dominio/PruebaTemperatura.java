package ar.edu.unlam.pb1.trabajoPractico04.dominio;

public class PruebaTemperatura {

	public static void main(String[] args) {
		Temperatura temperaturaFarenheit = new Temperatura();
		Temperatura temperaturaKelvin = new Temperatura();
		Temperatura temperaturaCelsius = new Temperatura();
		
		temperaturaFarenheit.setValor(150.78, temperaturaFarenheit.FARENHEIT);
		temperaturaKelvin.setValor(303.15, temperaturaKelvin.KELVIN);
		temperaturaCelsius.setValor(20, temperaturaCelsius.CELSIUS);
		
		System.out.println("Temperatura de Farenheit a Celsius: " + temperaturaFarenheit.getValor());
		System.out.println("Temperatura de Kelvin a Celsius: " + temperaturaKelvin.getValor());
		System.out.println("Temperatura de Celsius a Celsius: " + temperaturaCelsius.getValor());
		
		
	}

}
