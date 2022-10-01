package Lab06.Actividades;

//5. Declaracion de clase principal PruebaInterfazPorPagar
public class PruebaInterfazPorpagar {

    public static void main(String[] args) {

        //Crea arregloPorPagar con seis elementos
        PorPagar[] objetosPorPagar = new PorPagar[6];

        //Llena el arreglo con objetos que implementan la interfaz PorPagar
        objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
        objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);
        objetosPorPagar[4] = new Prestamo(72, 1270.00);
        objetosPorPagar[5] = new Prestamo(48, 750.00);

        System.out.println("\nFacturas y empleados procesados en forma polimorfica:\n");

        //Procesa en forma genérica cada elementos en el arreglo objetosPorPagar
        for (PorPagar porPagarActual : objetosPorPagar) {
            //imprime porPagarActual y su monto de pago apropiado
            System.out.printf("%s\n%s: $%,.2f\n\n", porPagarActual.toString(), "Pago vencido", porPagarActual.getMontoPago());
        }
    }
}
