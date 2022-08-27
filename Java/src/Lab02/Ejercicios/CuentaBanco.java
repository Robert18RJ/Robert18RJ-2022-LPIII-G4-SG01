package Lab02;

public class CuentaBanco {
    private String titular;
    private double cantidad;

    public CuentaBanco(String nombre, double inicial) {
        this.titular = nombre;
        this.cantidad = inicial;
    }

    public CuentaBanco(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "CuentaBanco {" + "Titular=" + titular + ", Cantidad=" + cantidad + '}';
    }

    public void Ingresar(double Cantidad) {
        if (cantidad > 0)
            this.cantidad = this.cantidad + cantidad;
        else
            this.cantidad = 0;
    }

    public void retirar(double Cantidad) {
        double fondo;
        fondo = this.cantidad - cantidad;
        if (fondo < 0)
            this.cantidad = 0;
        else
            this.cantidad = fondo;
    }

}