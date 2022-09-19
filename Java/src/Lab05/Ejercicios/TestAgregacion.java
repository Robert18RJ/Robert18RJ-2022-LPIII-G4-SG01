package Lab05.Ejercicios;

public class TestAgregacion {
    public static void main(String[] args) {
        Automovil a1 = new Automovil("AU398", 3, "Toyota", "Corolla");

        Motor m2 = new Motor(3728, 1000);
        Motor m3 = new Motor(800, 3000);

        System.out.println(a1.toString());
        a1.setPlaca("VH742");
        a1.setMotor(m2);
        a1.setNumPuertas(5);
        a1.setMarca("Nissan");
        a1.setModelo("Versa");

        System.out.println(a1.toString());
        a1.setMotor(m3);
        System.out.println(m2.toString());

    }

}
