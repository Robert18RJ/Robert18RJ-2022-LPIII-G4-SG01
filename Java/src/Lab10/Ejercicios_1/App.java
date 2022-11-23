package Ejercicios_1;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'H', 'O', 'L', 'A' };

        String[] stringArray = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Cuatro", "Cinco", "Seis", "Siete", "Ocho"};

        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);

        System.out.printf("%nArray de cadenas contiene:%n");
        imprimirArray(stringArray);

    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);

        System.out.println();

    }

    public static void imprimirArray(String[] inputArray) {
        int cont = 0;
        for (String elemento : inputArray) {
            cont++;
            System.out.printf("%-8s ", elemento);
            if (cont == 4) {
                System.out.println();
                cont = 0;
            }
        }
        System.out.println();

    }
}