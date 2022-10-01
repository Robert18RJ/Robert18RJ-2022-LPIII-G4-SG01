package Lab06.Actividades;

//6. Declaracion de la clase prestamo
public class Prestamo implements PorPagar {

    private int numeroDeCuotas;
    private double montoDeCuota;

    public Prestamo(int numeroDeCuotas, double montoDeCuota) {
        this.numeroDeCuotas = numeroDeCuotas;
        this.montoDeCuota = montoDeCuota;
    }

    public int getNumeroDeCuotas() {
        return numeroDeCuotas;
    }

    public void setNumeroDeCuotas(int numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }

    public double getMontoDeCuota() {
        return montoDeCuota;
    }

    public void setMontoDeCuota(double montoDeCuota) {
        this.montoDeCuota = montoDeCuota;
    }

    @Override
    public String toString() {
        return String.format("Prestamo: \nNumero de cuotas: %s\nMonto de cuota: $%,.2f", numeroDeCuotas, montoDeCuota);
    }

    @Override
    public double getMontoPago() {

        return getNumeroDeCuotas() * getMontoDeCuota();// calcula el monto total
    }

}
