package ar.edu.unlam.pb1.trabajoPractico04.dominio;

public class PruebaMotor {

	public static void main(String[] args) {
		Motor motor1 = new Motor();
		Motor motor2 = new Motor();
		Motor motor3 = new Motor();
		Motor motor4 = new Motor();
		Motor motor5 = new Motor();
		Motor motor0 = new Motor();
		
		motor1.setTipoFluido("Aceite");
		System.out.println("Tipo de fluido: "+motor1.getTipoFluido());
		motor1.setCombustible("Nafta");
		System.out.println("Tipo de combustible: "+motor1.getCombustible());
		motor1.setTipoBomba(1);
		System.out.println("Tipo de bomba: "+motor1.getTipoBomba());
		motor1.dimeTipoMotor();
		
		motor2.setTipoFluido("Aceite");
		System.out.println("Tipo de fluido: "+motor2.getTipoFluido());
		motor2.setCombustible("Nafta");
		System.out.println("Tipo de combustible: "+motor2.getCombustible());
		motor2.setTipoBomba(2);
		System.out.println("Tipo de bomba: "+motor2.getTipoBomba());
		motor2.dimeTipoMotor();

		motor3.setTipoFluido("Aceite");
		System.out.println("Tipo de fluido: "+motor3.getTipoFluido());
		motor3.setCombustible("Nafta");
		System.out.println("Tipo de combustible: "+motor3.getCombustible());
		motor3.setTipoBomba(3);
		System.out.println("Tipo de bomba: "+motor3.getTipoBomba());
		motor3.dimeTipoMotor();
		
		motor4.setTipoFluido("Aceite");
		System.out.println("Tipo de fluido: "+motor4.getTipoFluido());
		motor4.setCombustible("Nafta");
		System.out.println("Tipo de combustible: "+motor4.getCombustible());
		motor4.setTipoBomba(4);
		System.out.println("Tipo de bomba: "+motor4.getTipoBomba());
		motor4.dimeTipoMotor();
		
		motor5.setTipoFluido("Aceite");
		System.out.println("Tipo de fluido: "+motor5.getTipoFluido());
		motor5.setCombustible("Nafta");
		System.out.println("Tipo de combustible: "+motor5.getCombustible());
		motor5.setTipoBomba(5);
		System.out.println("Tipo de bomba: "+motor5.getTipoBomba());
		motor5.dimeTipoMotor();
		
		motor0.setTipoFluido("Aceite");
		System.out.println("Tipo de fluido: "+motor0.getTipoFluido());
		motor0.setCombustible("Nafta");
		System.out.println("Tipo de combustible: "+motor0.getCombustible());
		motor0.setTipoBomba(0);
		System.out.println("Tipo de bomba: "+motor0.getTipoBomba());
		motor0.dimeTipoMotor();
	}

}
