package Lab02.Ejercicios;

public class CuentaBanco {
    private String titular;
    private double cantidad;

    //Inicializar el objeto (constructor)
    public CuentaBanco(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    //Constructor
    public CuentaBanco(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }
    //get se encarga de mostrar un valor a una propiedad o atributo de un objeto
    public String getTitular() {
        return titular;
    }
    //set permite modificar el valor de un atributo de un objeto
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    //toString convierto a los objetos en cadena
    @Override
    public String toString() {
        return "CuentaBanco: " + "Titular=" + titular + ", Cantidad=" + cantidad;
    }
    //Función
    public void ingresar(double cantidad) {
        if (cantidad > 0)
            this.cantidad = this.cantidad + cantidad;
        else
            this.cantidad = 0;      
    }

    public void retirar(double cantidad) {
        double fondo;
        fondo = this.cantidad - cantidad;
        if (fondo < 0)
            this.cantidad = 0;
        else
            this.cantidad = fondo;
    }

}
