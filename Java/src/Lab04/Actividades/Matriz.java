package Lab04.Actividades;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        // Matriz cuadrada de 4x4
        int matriz[][] = new int[4][4];

        // Variables utilizadas1
        
        boolean salir = false;
        int opcion, fila, columna;

        // Utilizado para indicar si hemos entrado en la 1ª opcion
        boolean rellenado = false;

        // Menu
        do {

            // Mensajes del menu
            System.out.println("Menu");
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Sumar columna");
            System.out.println("4. Suma de diagonal");
            System.out.println("5. Suma de diagonal inversa");
            System.out.println("6. Calcular media");
            System.out.println("7. Imprimir Matrix");
            System.out.println("8. Salir");
            System.out.println("\nElije una opcion:");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    rellenarMatriz(sn, matriz);
                    // Ahora si podemos acceder al resto de opciones
                    rellenado = true;
                    break;
                case 2:
                    if (rellenado) {
                        // Validamos la fila
                        do {
                            System.out.println("Elige una fila");
                            fila = sn.nextInt();
                        } while (!(fila >= 0 && fila < matriz.length));
                        System.out.println(
                                "La suma de los valores de la fila " + fila + " es: " + sumaFila(matriz, fila));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 3:
                    if (rellenado) {
                        // Validamos la columna
                        do {
                            System.out.println("Elige una columna");
                            columna = sn.nextInt();
                        } while (!(columna >= 0 && columna < matriz.length));
                        System.out.println(
                                "La suma de los valores de la columna " + columna + " es: "
                                        + sumaColumna(matriz, columna));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 4:
                    System.out.println(" Suma de la diagonal: " + sumaDiagonal(matriz));

                    break;

                case 5:
                    System.out.println(" Suma de la diagonal inversa: " + sumaDiagonalver(matriz));

                    break;
                case 6:
                    System.out.println(" Media de la matriz: " + media(matriz));
                    break;
                case 7:
                    for (int x = 0; x < matriz.length; x++) {
                        System.out.print("|");
                        for (int y = 0; y < matriz[x].length; y++) {
                            System.out.print(matriz[x][y]);
                            if (y != matriz[x].length - 1)
                                System.out.print("\t");
                        }
                        System.out.println("|");
                    }
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que meter un valor entre 1 y 7");
            }
        } while (!salir);
        System.out.println("FIN");
    }

    // Rellena la matriz con valores insertados por el usuario
    public static void rellenarMatriz(Scanner sn, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe un numero en la posicion " + i + " " + j);
                matriz[i][j] = sn.nextInt();
            }
        }
    }

    // Suma los valores de una determinada fila
    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    // Suma los valores de una determinada columna
    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[j][columna];
        }
        return suma;
    }

    // Suma los valores de una determinada Diagonal
    public static int sumaDiagonal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + "  ");
                    suma += matriz[i][j];
                }
            }
        }
        return suma;
    }

    // Suma los valores de una determinada Diagonal inversa
    public static int sumaDiagonalver(int[][] matriz) {
        int suma = 0, ayuda = matriz.length;
        System.out.print(matriz.length + "  ");
        for (int i = 0; i < matriz.length; i++) {
            ayuda = ayuda - 1;
            suma += matriz[i][ayuda];
        }
        return suma;
    }

    // Calcular la media de una matriz
    public static double media(int[][] matriz) {
        double suma = 0, cantidadDeElementos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
                suma += matriz[i][j];
                cantidadDeElementos++;
            }
        }
        System.out.print(suma);
        return suma / cantidadDeElementos;

    }

    // Rellena la matriz con valores insertados por el usuario
    public static void ImprimirMatrix(int[][] matriz) {
        System.out.println("");
        System.out.println("           Matriz                           ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%5d ", matriz[i][j]);
            }
        }
        System.out.println("");
    }
}