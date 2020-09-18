package ar.edu.unlam.pb1.trabajopractico11.dominio;

import java.util.Scanner;

public class InterfazRestaurant {
    private static Scanner INPUT_TECLADO;
    private static Restaurant TAKAWISHI;

    public static void main(String args[]) {
        INPUT_TECLADO = new Scanner(System.in);
        TAKAWISHI = new Restaurant();

        int opcionSeleccionada;

        mostrarMenu(true);
        do {
            opcionSeleccionada = seleccionarOpcion();
            switch (opcionSeleccionada) {
                case 1:
                    altaDeMozos();
                    break;
                case 2:
                    consultarMesasDisponibles();
                    break;
                case 3:
                    ingresarComensales();
                    break;
                case 4:
                    agregarPedidoAUnaMesa();
                    break;
                case 5:
                    cerrarMesa();
                    break;
                case 6:
                    cerrarCaja();
                    break;
                case 7:
                    listadoDePlatos();
                    break;
                case 8:
                    listadoDeMozos();
                    break;
                case 9:
                    listadoDeMozosConFacturacion();
                    break;
                case -1:
                    System.out.println("Gracias.");
                    return;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            mostrarMenu(false);
        } while (opcionSeleccionada != -1);
    }

    private static void mostrarMenu(boolean mostrarBienvenida) {
        if (mostrarBienvenida) {
            System.out.println("\nBienvenido Takawishi Bistro");
        }
        System.out.println("****************");
        System.out.println("Menu de opciones:");
        System.out.println("1 - Alta de mozos");
        System.out.println("2 - Consultar mesas disponibles");
        System.out.println("3 - Ingresar comensales");
        System.out.println("4 - Agregar pedido a una mesa");
        System.out.println("5 - Cerrar mesa");
        System.out.println("6 - Cerrar caja");
        System.out.println("7 - Listado de platos");
        System.out.println("8 - Listado de mozos");
        System.out.println("9 - Total facturado por cada mozo");
        System.out.println("-1 - Salir");
        System.out.println("****************");
        System.out.println("Ingrese un opcion");
    }

    private static int seleccionarOpcion() {
        return INPUT_TECLADO.nextInt();
    }

    private static void altaDeMozos() {
        Mozo[] mozos;
        int cantidadMozos, numeroDeMesa;

        System.out.println("Ingrese cantidad de mozos: ");
        cantidadMozos = INPUT_TECLADO.nextInt();
        mozos = new Mozo[cantidadMozos];
        for (int i = 0; i < mozos.length; i++) {
            System.out.println("Ingrese nombre del Mozo: ");
            String nombre = INPUT_TECLADO.next();
            System.out.println("Ingrese apellido del Mozo: ");
            String apellido = INPUT_TECLADO.next();
            // System.out.println("Ingrese sexo del Mozo: ");
            // String sexo = INPUT_TECLADO.next();
            // System.out.println("Ingrese edad del Mozo: ");
            // int edad = INPUT_TECLADO.nextInt();
            mozos[i] = new Mozo(nombre, apellido);
            System.out.println("Mozo ingresado correctamente \n\n");
        }

        TAKAWISHI.altaDeMozos(mozos);
        System.out.println("Alta de mozos correctamente");
    }

    private static void consultarMesasDisponibles() {
        System.out.println(TAKAWISHI.getMesasDisponibles());
    }

    private static void ingresarComensales() {
        System.out.println("Ingrese numero de mesa: ");
        int numeroDeMesa = INPUT_TECLADO.nextInt();
        System.out.println("Ingrese numero de comensales: ");
        int comensales = INPUT_TECLADO.nextInt();

        boolean operacionExitosa = TAKAWISHI.ingresarComensales(numeroDeMesa, comensales);

        if (operacionExitosa) {
            System.out.println("Comensales agregados correctamente");
        } else {
            System.out.println("Ocurrio un error, intente nuevamente");
        }
    }

    private static void agregarPedidoAUnaMesa() {
        int numeroDeConsumible;

        System.out.println("Ingrese numero de mesa:");
        int numeroDeMesa = INPUT_TECLADO.nextInt();
        System.out.println("Ingrese numero de pedidos:");
        int numeroDePedidos = INPUT_TECLADO.nextInt();
        Pedido pedido = new Pedido(numeroDePedidos);

        do {
            listadoDePlatos();
            System.out.println("Consumos Restantes: " + pedido.consumosRestantes());
            System.out.println("Ingrese Plato (para salir -1):");
            numeroDeConsumible = INPUT_TECLADO.nextInt();
            Consumible consumible = TAKAWISHI.getConsumible(numeroDeConsumible);
            if (consumible != null) {
                pedido.agregarConsumible(consumible);
            } else {
                System.out.println("Consumible no encontrado");
            }
        } while (numeroDeConsumible != -1 && pedido.incompleto());
        System.out.println("Ingreso finalizado");

        boolean operacionExitosa = TAKAWISHI.agregarPedidoAlaMesa(numeroDeMesa, pedido);

        if (operacionExitosa) {
            System.out.println("Pedido agregado correctamente");
        } else {
            System.out.println("Ocurrio un error, intente nuevamente");
        }
    }

    private static void cerrarMesa() {
        System.out.println("Ingrese numero de mesa:");
        int numeroDeMesa = INPUT_TECLADO.nextInt();

        boolean operacionExitosa = TAKAWISHI.cerrarMesa(numeroDeMesa);

        if (operacionExitosa) {
            System.out.println("Mesa cerrada correctamente");
        } else {
            System.out.println("Ocurrio un error, intente nuevamente");
        }
    }

    private static void cerrarCaja() {
        double totalDelDia = TAKAWISHI.cerrarCaja();

        System.out.println("Caja cerrada correctamente");
        System.out.println("Total recaudado del dia: $ " + totalDelDia);
    }

    private static void listadoDePlatos() {
        System.out.println(TAKAWISHI.getCarta());
    }

    private static void listadoDeMozos() {
        System.out.println(TAKAWISHI.listadoDeMozos());
    }

    private static void listadoDeMozosConFacturacion() {
        System.out.println(TAKAWISHI.listadoDeMozosConFacturacion());
    }
}