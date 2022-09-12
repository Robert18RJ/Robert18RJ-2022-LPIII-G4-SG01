package Lab04.Ejercicios;

public class Ejercicio3Ventas {

    public static void main(String[] args) {

        // Filas: productos
        // Columnas: vendedores
        int totalV1 = 0;
        int totalV2 = 0;
        int totalV3 = 0;
        int totalV4 = 0;

        int[][] ventas = { { 500, 450, 250, 600 },
                            { 742, 325, 405, 800 },
                            { 343, 520, 230, 454 },
                            { 930, 800, 546, 850 },
                            { 343, 780, 580, 850 } };

        System.out.println("VENTAS TOTALES:");
        System.out.print("            ");

        // encabezado
        for (int i = 0; i < ventas[0].length; i++) {
            System.out.printf("Vendedor %d   ", i + 1);
        }

        System.out.println("TOTAL");

        for (int producto = 0; producto < ventas.length; producto++) {
            System.out.printf("Producto %d", producto + 1);
            for (int vendedor : ventas[producto])
                System.out.printf("%11d", vendedor);
            int total = obtTotal(ventas[producto]);
            System.out.printf("%,16d%n", total);
        }
        System.out.print("TOTAL        ");
        int contador = 1;
        int col = 0;
        int totalTotal = 0;

        while (contador < 5) {
            int fcol = col;
            int totalV = 0;
            for (int k = 0; k < ventas.length; k++) {
                for (int l = col; l == fcol; l++) {
                    totalV += ventas[k][l];
                }
            }

            totalTotal += totalV;
            System.out.printf("%,10d ", totalV);
            col++;
            contador++;
        }
        System.out.printf("%,13d ", totalTotal);
    }

    public static int obtTotal(int[] matriz) {
        int total = 0;
        for (int i : matriz) {
            total += i;
        }
        return total;
    }
}