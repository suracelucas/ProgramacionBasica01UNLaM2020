package ar.edu.unlam.pb1.trabajoPractico08.dominio;

public class CalculoDePersonas {
	private double pesoTotal;
    private int personasConBajoPeso;
    private int personasConPesoNormal;
    private int personasConSobrePeso;
    private int edadTotalPersonasBajoPeso;
    private int edadTotalPersonasSobrePeso;
    private int personasIngresadas;

    public CalculoDePersonas() {
        this.pesoTotal = 0;
        this.personasConBajoPeso = 0;
        this.personasConPesoNormal = 0;
        this.personasConSobrePeso = 0;
        this.edadTotalPersonasBajoPeso = 0;
        this.edadTotalPersonasSobrePeso = 0;
        this.personasIngresadas = 0;
    }

    public double getPesoPromedio() {
        return this.pesoTotal / this.personasIngresadas;
    }

    public int getPersonasBajoPeso() {
        return this.personasConBajoPeso;
    }

    public int getPersonasPesoNormal() {
        return this.personasConPesoNormal;
    }

    public int getPersonasSobrePeso() {
        return this.personasConSobrePeso;
    }

    public double getPromedioDeEdadDePersonasConBajoPeso() {
        if (this.personasConBajoPeso == 0) {
            return 0;
        }
        return this.edadTotalPersonasBajoPeso / this.personasConBajoPeso;
    }

    public double getPromedioDeEdadDePersonasConSobrePeso() {
        if (this.personasConSobrePeso == 0) {
            return 0;
        }
        return this.edadTotalPersonasSobrePeso / this.personasConSobrePeso;
    }

    public void sumarPeso(double peso) {
        this.pesoTotal += peso;
    }

    public void calcularImc(Imc imc, int edad) {
        switch (imc) {
            case INFERIOR_AL_PESO_IDEAL:
                edadTotalPersonasBajoPeso += edad;
                personasConBajoPeso++;
                break;
            case PESO_IDEAL:
                personasConPesoNormal++;
                break;
            case SUPERIOR_AL_PESO_IDEAL:
                edadTotalPersonasSobrePeso += edad;
                personasConSobrePeso++;
                break;
        }
    }

    public void sumarPersona() {
        this.personasIngresadas++;
    }
}
