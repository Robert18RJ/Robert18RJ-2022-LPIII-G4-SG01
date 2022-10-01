package Lab06.Actividades;

//2. Declaracion de la clase Factura que implementa por pagar
public class Factura implements PorPagar {

    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        setCantidad(cantidad); // valda y almacena la cantidad
        setPrecioPorArticulo(precioPorArticulo); //valida y almacena el precio por articulo        
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    // valida y almacena la cantidad
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    //valida y almacena el precio por articulo
    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }

    //Metodo requerido para realizar el contrato con la interfaz PorPagar
    @Override
    public double getMontoPago() {
        return getCantidad() * getPrecioPorArticulo();
    }

    @Override
    public String toString() {
        return String.format("%s  %s (%s)\nCantidad: %s\nPrecio por articulo: $%,.2f", "Factura:\nNumero de Pieza:", numeroPieza, descripcionPieza, cantidad, precioPorArticulo);
    }
}
