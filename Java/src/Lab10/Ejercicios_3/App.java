package Ejercicios_3;

public class App {
    public static void main(String[] args) throws Exception {

        String cadena1 = "Robert";
        String cadena2 = "Robert";
        //String cadena2 = "Joel";
        Integer entero1 = 5;
        Integer entero2 = 5;
        //Integer entero2 = 7;
        Double doble = 7.7;
        Character char1 = 'R';       

        Persona persona1 = new Persona("77180710", "Robert", "Dueñas");
        Persona persona2 = new Persona("77180710", "Robert", "Dueñas");

        System.out.println("cadena1 con cadena2 iguales?");
        System.out.println(isEqualTo(cadena1, cadena2));

        System.out.println("entero1 con entero2 iguales?");
        System.out.println(isEqualTo(entero1, entero2));

        System.out.println("DoubleA con CharA iguales?");
        System.out.println(isEqualTo(doble, char1));
        
        System.out.println("persona1 con persona2 iguales?");
        System.out.println(isEqualTo(persona1, persona2));

    }

    public static <T, E> boolean isEqualTo(T arg1, E arg2) {

        return arg1.equals(arg2);
    }

}