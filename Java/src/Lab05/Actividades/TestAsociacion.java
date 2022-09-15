package Lab05.Actividades;

public class TestAsociacion {
    public static void main(String[] args) {
        Banco bcp = new Banco("BCP", 15);

        bcp.agregarCliente(new Persona (21, "Juana", "Simba",1));
        System.out.println(bcp);
        System.out.println();

        bcp.agregarCliente(new Persona(55, "Jose", "Caceres"));
        System.out.println(bcp);
        System.out.println();

        bcp.agregarCliente(new Persona(23, "Gabriela", "Diaz"));
        System.out.println(bcp);
        System.out.println();

    }
}
