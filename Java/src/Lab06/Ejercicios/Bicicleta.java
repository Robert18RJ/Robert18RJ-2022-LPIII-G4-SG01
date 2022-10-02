package Lab06.Ejercicios;

public class Bicicleta implements ImpactoEcologico {
    private final double factor_de_Emision = 0.05;
    private double ImpactoSalud;
    private double MejoraEconomia;
    private double TiempoVida;

    public Bicicleta(double ImpactoSalud, double MejoraEconomia, double TiempoVida) {
        this.ImpactoSalud = ImpactoSalud;
        this.MejoraEconomia = MejoraEconomia;
        this.TiempoVida = TiempoVida;
    }

    public double getImpactoSalud() {
        return ImpactoSalud;
    }

    public void setImpactoSalud(double ImpactoSalud) {
        this.ImpactoSalud = ImpactoSalud;
    }

    public double getMejoraEconomia() {
        return MejoraEconomia;
    }

    public void setMejoraEconomia(double MejoraEconomia) {
        this.MejoraEconomia = MejoraEconomia;
    }

    public double getTiempoVida() {
        return TiempoVida;
    }

    public void setTiempoVida(double TiempoVida) {
        this.TiempoVida = TiempoVida;
    }

    public double getFactor_de_Emision() {
        return factor_de_Emision;
    }

    private double dato_Actividad() {
        return (ImpactoSalud + MejoraEconomia) * TiempoVida;
    }

    @Override
    public double obtenerlmpactoEcologico() {
        return dato_Actividad() * getFactor_de_Emision();
    }

    @Override
    public String toString() {
        return "Bicicleta \nfactor_de_Emision: " + factor_de_Emision + "\nImpactoSalud: " + ImpactoSalud
                + "\nMejoraEconomia: " + MejoraEconomia + "\nTiempoVida: " + TiempoVida;
    }
}
