package Lab05.Ejercicios;

public class TestAsociacion {
    public static void main(String[] args) {
        Banco BCP = new Banco("BCP", 7);
        // Banco bbva = new Banco("BBVA", 30);
        Persona P1 = new Persona(111417, "Robert", "Dueñas", 'C');
        Persona P2 = new Persona(2511747, "Jose", "Caceres", 'E');
        Persona P3 = new Persona(3511747, "Isac", "Lopez", 'B');
        Persona P4 = new Persona(4511747, "Maria", "Roque", 'E');
        System.out.println(BCP.toString());
        BCP.agregarCliente(P1);
        BCP.agregarCliente(P2);
        BCP.agregarCliente(P3);
        BCP.agregarCliente(P4);
        BCP.darBajaCliente(P3);
        System.out.println(BCP.toString());
        BCP.clienteTipo('E');
    }
}
