package ar.edu.unlam.pb1.trabajoPractico06.dominio;

public class MovimientoRectilineoUnifomementeAcelerado {
    public static void main(String args[]) {
        Automovil miniCopper = new Automovil();
        Automovil ferrari = new Automovil();
        Automovil fitito = new Automovil();

        // a. miniCopper con una aceleración de 15 m/s2 si su velocidad máxima es 200
        // km/h
        miniCopper.setAceleracionEnMetrosPorSegundos(15);
        miniCopper.setVelocidadMaximaEnKmPorHora(200);
        System.out.println(
                "El MRU acelerado del miniCopper es de: " + miniCopper.alcanzarVelocidadMaxima() + " segundos");

        // b. ferrari con una aceleración de 40 m/s2 si su velocidad máxima es 350 km/h
        ferrari.setAceleracionEnMetrosPorSegundos(40);
        ferrari.setVelocidadMaximaEnKmPorHora(350);
        System.out.println("El MRU acelerado del ferrari es de: " + ferrari.alcanzarVelocidadMaxima() + " segundos");

        // c. fitito con una aceleración de 4 m/s2 si su velocidad máxima es 90 km/h
        fitito.setAceleracionEnMetrosPorSegundos(4);
        fitito.setVelocidadMaximaEnKmPorHora(90);
        System.out.println("El MRU acelerado del fitito es de: " + fitito.alcanzarVelocidadMaxima() + " segundos");
    }
}