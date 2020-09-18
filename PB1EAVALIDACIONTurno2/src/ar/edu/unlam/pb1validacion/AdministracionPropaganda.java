package ar.edu.unlam.pb1validacion;

import java.util.Scanner;

public class AdministracionPropaganda {

	
	public static void main(String[] args) {

		//Cree el objeto miCanal de tipo Canal 
		//Y complete el codigo del menu
		Canal miCanal = new Canal("Canal de Lucas", 5, 10);
		Scanner teclado = new Scanner(System.in);
		int opcion=0; 
		do {
			System.out.println("ingrese una opcion");
			System.out.println("1 agregar Propaganda ");
			System.out.println("2 Obtener el precio de una propaganda");
			System.out.println("3 inactivar una propaganda");
			System.out.println("0 salir");
			opcion =teclado.nextInt();
			switch (opcion) {
				case 1:
					System.out.println("se crea una propaganada a un canal");
					//ingrese un propaganda a un canal
					//Informa si la propaganada se pudo agregar o  no 
					System.out.println("Ingrese el codigo de la propaganda");
					String codigo = "5487";
					System.out.println("Ingrese el nombre del representante:");
					String representante = "Carlos";
					System.out.println("Ingrese la duracion en segundos:");
					int duracion = 100;
					System.out.println("Ingrese la cantidad de veces a repetir:");
					int repeticiones = 2;
					Propaganda nuevaPropaganda = new Propaganda(codigo, representante, duracion, repeticiones);
					if(miCanal.agregarPropaganda(nuevaPropaganda)) {
						System.out.println("Propaganda agragada con exito");
					}else {
						System.out.println("Error al agregar la propaganda");
					}
					break;
				case 2:
					//Ingrese el codigo de una propaganda del canal e Informar el  precio de la misma  
					System.out.println("Ingrese el codigo de propaganda para calcular su precio:");
					String codigoABuscar = "5487";
					System.out.println(miCanal.obtenerPrecioPropaganda(codigoABuscar)); 
			
					break;

				case 3:
					//Ingrese el codigo de una propaganda del canal para pasar su estado a inactivela
					System.out.println("Ingrese el codigo de propaganda para pasar su estado a inactiva:");
					String codigoAInactivar = "5487";
					miCanal.inactivarPropaganda(codigoAInactivar);
					
			
					break;

				case 0:
					System.out.println("salir");
					break;

			
				default:
					System.out.println("opcion no valida");
					break;
			}
		
		
		}	while (opcion!=0);
		

	
	}
}
