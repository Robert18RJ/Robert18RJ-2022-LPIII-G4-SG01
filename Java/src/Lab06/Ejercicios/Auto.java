package Lab06.Ejercicios;

public class Auto implements ImpactoEcologico {
    private final double factor_de_Emision = 0.3;
    private double UsoCombustible;
    private double EmisionCarbono;
    private double UsoTiempo;

    public Auto(double UsoCombustible, double EmisionCarbono, double UsoTiempo) {
        this.UsoCombustible = UsoCombustible;
        this.EmisionCarbono = EmisionCarbono;
        this.UsoTiempo = UsoTiempo;
    }

    public double getFactor_de_Emision() {
        return factor_de_Emision;
    }

    public double getUsoCombustible() {
        return UsoCombustible;
    }

    public void setUsoCombustible(double UsoCombustible) {
        this.UsoCombustible = UsoCombustible;
    }

    public double getEmisionCarbono() {
        return EmisionCarbono;
    }

    public void setEmisionCarbono(double EmisionCarbono) {
        this.EmisionCarbono = EmisionCarbono;
    }

    public double getUsoTiempo() {
        return UsoTiempo;
    }

    public void setUsoTiempo(double UsoTiempo) {
        this.UsoTiempo = UsoTiempo;
    }

    private double dato_Actividad() {
        return (UsoCombustible + EmisionCarbono) * UsoTiempo;
    }

    @Override
    public double obtenerlmpactoEcologico() {
        return dato_Actividad() * getFactor_de_Emision();
    }

    @Override
    public String toString() {
        return "Auto :  \nfactor_de_Emision: " + factor_de_Emision + "\nUsoCombustible: " + UsoCombustible
                + "\nEmisionCarbono: " + EmisionCarbono + "\nUsoTiempo: " + UsoTiempo;
    }
}
