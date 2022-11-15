package Ejercicios_3;

public class App {
    public static void main(String[] args) throws Exception {

        String stringA = "Robert";
        String stringB = "Robert";
        Integer integerA = 1;
        Integer integerB = 1;
        Double doubleA = 1.1;
        Character charA = 'H';

        // para la comparacion de dos objetos propios
        Persona persona1 = new Persona("77180710", "Robert", "Dueñas");
        Persona persona2 = new Persona("77180710", "Robert", "Dueñas");
        Persona persona3 = new Persona("78908070", "Jaely", "Morales");

        System.out.println("stringA con stringB iguales?");
        System.out.println(isEqualTo(stringA, stringB));

        System.out.println("integerA con integerB iguales?");
        System.out.println(isEqualTo(integerA, integerB));

        System.out.println("doubleA con charA iguales?");
        System.out.println(isEqualTo(doubleA, charA));

        System.out.println("persona1 con persona2 iguales?");
        System.out.println(isEqualTo(persona1, persona2));

        System.out.println("persona1 con persona3 iguales?");
        System.out.println(isEqualTo(persona1, persona3));

    }

    public static <T, E> boolean isEqualTo(T argumento1, E argumento2) {

        return argumento1.equals(argumento2);
    }

}