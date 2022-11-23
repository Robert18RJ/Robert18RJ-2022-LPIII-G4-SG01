package Actividades_2;

public class App {

    public static void main(String[] args) throws Exception {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'R', 'O', 'B', 'E','R','T' };

        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);

        System.out.println("\n------Impresion con limites-------");
        System.out.printf("Array integerArray contiene");
        imprimirArray(intArray, 0, 10);
        System.out.printf("%nArray doubleArray contiene");
        imprimirArray(doubleArray, 3, 3);
        System.out.printf("%nArray charArray contiene");
        imprimirArray(charArray, 0, 2);

    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);

        System.out.println();

    }

    // Sobrecarga del método imprimirArray (2 argumentos tipo int)
    public static <T> void imprimirArray(T[] inputArray, int limiteInferior, int limiteSuperior) {
        int longitud = inputArray.length - 1;

        try {
            validarLimites(longitud, limiteInferior, limiteSuperior);
            System.out.print(" del indice " + limiteInferior + " a " + limiteSuperior + ": \n");
            for (int i = limiteInferior; i <= limiteSuperior; i++) {
                System.out.print(inputArray[i] + " ");
            }

        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }
    }

    public static void validarLimites(int longitud, int limiteInferior, int limiteSuperior)
            throws LimiteInvalidoException {
        if (limiteInferior < 0 || limiteInferior > longitud || limiteSuperior < 0 || limiteSuperior > longitud
                || limiteInferior > limiteSuperior) {
            throw new LimiteInvalidoException("Límite Inválido");
        }
    }

}

// Excepción propia
class LimiteInvalidoException extends IndexOutOfBoundsException {
    public LimiteInvalidoException() {

    }

    public LimiteInvalidoException(String mensajeError) {
        super(mensajeError);
    }

}