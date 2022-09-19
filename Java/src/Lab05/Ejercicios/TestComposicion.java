package Lab05.Ejercicios;

public class TestComposicion {
    public static void main(String[] args) {

        Persona P1 = new Persona(1001, "Robert", "Dueñas", 'C');
        Persona P2 = new Persona(102, "Johan", "Mamani", 'C');
        Persona P3 = new Persona(1001, "Grecia", "Carpio", 'B');

        P1.getCuenta().setSaldo(2500);

        System.out.println(P1.toString());
        System.out.println(P2.toString());
        System.out.println(P3.toString());

        P2.setNombre("Sofia");
        P1.getCuenta().setSaldo(550.55);
        P2.getCuenta().setSaldo(50.55);
        P3.getCuenta().depositar(50000);
        System.out.println(P3.toString());
        P3.getCuenta().retirar(50.00);
        System.out.println(P1.toString());
        System.out.println(P2.toString());
        System.out.println(P3.toString());

    }
}