package Actividades_b;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.printf("Maximo de %d, %d y %d es %d%n%n", 3, 4, 5, maximo(3, 4, 5));

        System.out.printf("Maximo de %.1f, %.1f y %.1f es %.1f%n%n", 6.6, 7.7, 8.8, maximo(6.6, 7.7, 8.8));
        // Para el caso de los objetos String la comparación se hace alfabéticamente.
        System.out.printf("Maximo de %s, %s y %s es %s%n%n", "pera", "zanahoria", "uva", maximo("pera", "zanahoria", "uva"));
        System.out.println("---------------------------------------------------");
        // para obtener el minimo
        System.out.printf("Minimo de %d, %d y %d es %d%n%n", 3, 4, 5, minimo(3, 4, 5));

        System.out.printf("Minimo de %.1f, %.1f y %.1f es %.1f%n%n", 6.6, 7.7, 8.8, minimo(6.6, 7.7, 8.8));
        // Para el caso de los objetos String la comparación se hace alfabéticamente.
        System.out.printf("Minimo de %s, %s y %s es %s%n%n", "pera", "zanahoria", "uva", minimo("pera", "zanahoria", "uva"));
    }

    public static <T extends Comparable<T>> T maximo(T x, T y, T z) {
        T max = x;

        if (y.compareTo(x) > 0)
            max = y;

        if (z.compareTo(y) > 0)
            max = z;

        return max;
    }
    public static <T extends Comparable<T>> T minimo(T x, T y, T z) {
        T min = x;

        if (y.compareTo(z) < 0)
            min = y;

        if (x.compareTo(y) < 0)
            min = x;

        return min;
    }
}
