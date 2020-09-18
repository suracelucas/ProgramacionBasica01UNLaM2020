package ar.edu.unlam.pb1.trabajoPractico10.dominio;
import java.util.Scanner;

public class PruebaAdministracionDeAulaConAlumnos {
	private static Scanner teclado;
    private static AdministracionDeAulaConAlumnos adminAula;

    public static void main(String[] args) {
        adminAula = new AdministracionDeAulaConAlumnos(2, 2);
        teclado = new Scanner(System.in);

        int opcionSeleccionada;

        mostrarMenu(true);
        do {
            opcionSeleccionada = seleccionarOpcion();
            switch (opcionSeleccionada) {
                case 1:
                    consultarEscritoriosVacios();
                    break;
                case 2:
                    ocuparEscritorio();
                    break;
                case 3:
                    listadoDeAlumnos();
                    break;
                default:
                    break;
            }
            mostrarMenu(false);
        } while (opcionSeleccionada != 9);
    }

    private static void mostrarMenu(boolean mostrarBienvenida) {
        if (mostrarBienvenida) {
            System.out.println("\nBienvenido al Administrador de aulas");
        }
        System.out.println("****************");
        System.out.println("Menu de opciones:");
        System.out.println("1 - Mostrar cantidad de escritorios vacios");
        System.out.println("2 - Ocupar escritorio");
        System.out.println("3 - Listado de Alumnos");
        System.out.println("9 - Salir");
        System.out.println("****************");
        System.out.println("Ingrese un opcion");
    }

    private static int seleccionarOpcion() {
        return teclado.nextInt();
    }

    private static void consultarEscritoriosVacios() {
        if (!adminAula.aulaLlena()) {
            System.out.println("Cantidad de escritorios vacios: " + adminAula.contarEscritoriosVacios());
        } else {
            System.out.println("Aula esta llena.");
        }
    }

    private static void ocuparEscritorio() {
        if (!adminAula.aulaLlena()) {
            System.out.println("Ingrese Nombre del alumno: ");
            String nombre = teclado.next();
            System.out.println("Ingrese Apellido del alumno: ");
            String apellido = teclado.next();
            boolean operacionExitosa = adminAula.ocuparEscritorio(new Alumno(nombre, apellido));
            if (operacionExitosa) {
                System.out.println("Escritorio ocupado corretamente.");
            } else {
                System.out.println("Ocurrio un problema, intente nuevamente.");
            }
        } else {
            System.out.println("Aula esta llena.");
        }
    }

    private static void listadoDeAlumnos() {
        System.out.println(adminAula.listadoDeAlumnos());
    }
}


