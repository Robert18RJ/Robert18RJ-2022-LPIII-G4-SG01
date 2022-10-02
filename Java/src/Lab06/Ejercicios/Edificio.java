package Lab06.Ejercicios;

public class Edificio implements ImpactoEcologico {
    private final double factor_de_Emision = 0.5;
    private double UsoMateriales;
    private double CostoMantenimiento;
    private int VidaUtil;

    public Edificio(double UsoMateriales, double CostoMantenimiento, int VidaUtil) {
        this.UsoMateriales = UsoMateriales;
        this.CostoMantenimiento = CostoMantenimiento;
        this.VidaUtil = VidaUtil;
    }

    public double getUsoMateriales() {
        return UsoMateriales;
    }

    public void setUsoMateriales(double UsoMateriales) {
        this.UsoMateriales = UsoMateriales;
    }

    public double getCostoMantenimiento() {
        return CostoMantenimiento;
    }

    public void setCostoMantenimiento(double CostoMantenimiento) {
        this.CostoMantenimiento = CostoMantenimiento;
    }

    public int getVidaUtil() {
        return VidaUtil;
    }

    public void setVidaUtil(int VidaUtil) {
        this.VidaUtil = VidaUtil;
    }

    public double getFactor_de_Emision() {
        return factor_de_Emision;
    }

    public double dato_Actividad() {
        return (CostoMantenimiento + UsoMateriales) * VidaUtil;
    }

    public double obtenerlmpactoEcologico() {
        return getFactor_de_Emision() * dato_Actividad();

    }

    @Override
    public String toString() {
        return "Edificio \nCosto de contruccion: " + UsoMateriales + "\nCosto de matenimiento: " + CostoMantenimiento
                + "\nVida Util: " + VidaUtil + "\nFactor de Emision: " + factor_de_Emision;
    }

}