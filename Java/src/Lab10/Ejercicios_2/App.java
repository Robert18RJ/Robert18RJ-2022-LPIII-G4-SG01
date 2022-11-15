package Ejercicios_2;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'H', 'O', 'L', 'A' };

        System.out.printf("Array integerArray  contiene:%n");
        imprimirArray(intArray);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);

        System.out.printf("\n-----INTERCAMBIANDO LAS PISICIONES------\n");

        System.out.printf("\nArray integerArray  \nintercambiando el indice ");
        intercabiaPosiciones(intArray, 0, 4);
        imprimirArray(intArray);
        System.out.printf("\nArray doubleArray  \nintercambiando el indice ");
        intercabiaPosiciones(doubleArray, 0, 2);
        imprimirArray(doubleArray);
        System.out.printf("\nArray charArray  \nintercambiando el indice ");
        intercabiaPosiciones(charArray, 0, 3);
        imprimirArray(charArray);
    }

    public static <T> void intercabiaPosiciones(T[] inputArray, int primerIndice, int segundoIndice) {

        T temp; // variable temporal
        System.out.println(primerIndice + " con el indice " + segundoIndice);
        temp = inputArray[primerIndice];
        inputArray[primerIndice] = inputArray[segundoIndice];
        inputArray[segundoIndice] = temp;

    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);

        System.out.println();

    }

}
