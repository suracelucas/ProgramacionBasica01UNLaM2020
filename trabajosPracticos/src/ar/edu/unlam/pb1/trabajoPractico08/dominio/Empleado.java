package ar.edu.unlam.pb1.trabajoPractico08.dominio;


public class Empleado {
    private String apellido;
    private String fechaDeIngreso; // No vimos fechas todavia

    private static int[] MESES_ANTIGUEDAD;
    private static int[] DIAS_CORRESPONDIDOS;
    private static final String HOY = "06/2020"; // No vimos fechas todavia
    private static final String HOY_SEPARADOR = "/"; // No vimos fechas todavia

    public Empleado(String apellido, String fechaDeIngreso) {
        this.apellido = apellido;
        this.fechaDeIngreso = fechaDeIngreso;
        MESES_ANTIGUEDAD = new int[] { 6, 60, 120 }; // 6 meses, 5 años, 10 años
        DIAS_CORRESPONDIDOS = new int[] { 14, 21, 28 };
    }

    public int calcularDiasDeVAcaciones() {
        int diasDeVacaciones = 0, meses, anos, mesesDeAntiguedad = 0;
        String[] mesesAnosIngreso = this.fechaDeIngreso.split(HOY_SEPARADOR);
        String[] mesesAnosHoy = HOY.split(HOY_SEPARADOR);

        anos = Integer.parseInt(mesesAnosHoy[1]) - Integer.parseInt(mesesAnosIngreso[1]);
        meses = Integer.parseInt(mesesAnosHoy[0]) - Integer.parseInt(mesesAnosIngreso[0]);
        mesesDeAntiguedad = (anos * 12) + meses;

        for (int i = 0; i < MESES_ANTIGUEDAD.length; i++) {
            if (mesesDeAntiguedad >= MESES_ANTIGUEDAD[i]) {
                diasDeVacaciones = DIAS_CORRESPONDIDOS[i];
            }
        }

        return diasDeVacaciones;
    }
}
