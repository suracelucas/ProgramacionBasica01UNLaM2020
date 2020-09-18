package ar.edu.unlam.pb1.trabajoPractico08.dominio;

public class PruebaDia {
    public static void main(String args[]) {
        Dia jueves, domingo, diaNoValido;

        jueves = new Dia(Dias.JUEVES);
        System.out.println("El dia numero 5 es: " + jueves.getNombreDelDia());

        domingo = new Dia(Dias.DOMINGO);
        System.out.println("El dia numero 1 es: " + domingo.getNombreDelDia());

        diaNoValido = new Dia(Dias.LUNES);
        System.out.println("El dia numero 2 es: " + diaNoValido.getNombreDelDia());
    }
}
