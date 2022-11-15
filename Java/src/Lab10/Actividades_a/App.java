package Actividades_a;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'H', 'O', 'L', 'A' };
        Float[] floatArray = {6.6f, 7.7f,8.8f,9f};
        Boolean[] booleanArray = {true, false};

        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);
        System.out.printf("%nArray floatArray contiene:%n");
        imprimirArray(floatArray);
        System.out.printf("%nArray booleanArray contiene:%n");
        imprimirArray(booleanArray);
    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);

        System.out.println();

    }
}

