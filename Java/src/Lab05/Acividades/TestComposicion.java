package Lab05.Acividades;

public class TestComposicion {
    public static void main(String[] args) {
        Persona P1 = new Persona (1001, "Robert", "Dueñas", 1635422)
        Persona P2 = new Persona (102, "Johan", "Mamani", 1636770)
        Persona P3 = new Persona (1031, "Mariluana", "Coyoche", 4526770)
        Cuenta C1 = new Cuenta (71636770,500.00);
        Cuenta C2 = new Cuenta (71611111,4500.00);
        P2.setNombre("Johss");
        P3.setCuenta(C1);
        P1.setCuenta(C2);
        System.out.println(P1.toString());
        System.out.println(P2.toString());
        System.out.println(P3.toString());
    }
}
