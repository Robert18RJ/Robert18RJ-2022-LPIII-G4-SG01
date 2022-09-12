package Lab04.Ejercicios;

import java.util.Scanner;

public class Evaluacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Matriz cuadrada de 8x3opcion
        int matriz[][] = new int[8][3];

        // Variables utilizadas
        boolean salir = false;
        int opcion = 0;

        // Utilizado para indicar si hemos entrado en la 1ª opcion
        boolean registroMatriz = false;

        // Menu
        do {
            menu();

            // Mensajes del menu
            System.out.print("Elije una opcion : ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    rellenarPersonas(entrada, matriz);
                    // Ahora si podemos acceder al resto de opciones
                    registroMatriz = true;
                    break;
                case 2:
                    if (registroMatriz) {
                        System.out.println("Porcentaje de Hombre : " + porcentajeHombres(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 3:
                    if (registroMatriz) {
                        System.out.println("Porcentaje de Mujer : " + porcentajeMujeres(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 4:
                    if (registroMatriz) {
                        System.out.println("Porcentaje de Hombre que Trabaja : " + porcentajeHombresTrabajan(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 5:
                    if (registroMatriz) {
                        System.out.println("Porcentaje de Mujeres que Trabaja :  " + porcentajeMujeresTrabajan(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 6:
                    if (registroMatriz) {
                        System.out
                                .println("El sueldo promedio de los hombres que trabajan : "
                                        + PromSueldoHombres(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 7:
                    if (registroMatriz) {
                        System.out
                                .println("El sueldo promedio de las Mujeres que trabajan : "
                                        + PromSueldoHombres(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que meter un valor entre 1 y 8");
            }
        } while (!salir);
        System.out.println("FIN");
    }

    // Rellena los datos de la personas con valores insertados por el usuario
    public static void rellenarPersonas(Scanner entrada, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Ingresar Datos de la Persona " + (i + 1));
            for (int j = 0; j < matriz[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Ingresa el Sexo " + (i + 1) + " (1=masculino, 2=femenino) : ");
                        matriz[i][j] = entrada.nextInt();
                        while (matriz[i][j] > 2 || matriz[i][j] < 1) {
                            System.out.print("Ingresa el Sexo " + (i + 1) + "  (1 o 2) : ");
                            matriz[i][j] = entrada.nextInt();
                        }
                        break;
                    case 1:
                        System.out.print("Ingresa el Trabaja " + (i + 1) + " (1=si trabaja, 2=no trabaja) : ");
                        matriz[i][j] = entrada.nextInt();
                        while (matriz[i][j] > 2 || matriz[i][j] < 1) {
                            System.out.print("Ingresa el Trabaja " + (i + 1) + " (1 o 2) : ");
                            matriz[i][j] = entrada.nextInt();
                        }
                        break;
                    case 2:
                        System.out.print("Ingresa su sueldo (si tiene un trabajo, sino sera un cero) : ");
                        matriz[i][j] = entrada.nextInt();
                        if (matriz[i][j] > 0) {
                            while (matriz[i][j] > 3000 || matriz[i][j] < 950) {
                                System.out.print("Ingresa su sueldo entre 950 y 3000 (valor entero) : ");
                                matriz[i][j] = entrada.nextInt();
                            }
                        }
                        break;
                    default:
                        System.out.print(" Error en el sistema ");
                        break;

                }
            }
        }
    }

    public static void menu() {
        System.out.println("  Menu ");
        System.out.println("1. Ingresar Personas");
        System.out.println("2. Porcentaje de hombres (tengan o no trabajo)");
        System.out.println("3. Porcentaje de mujeres (tengan o no trabajo)");
        System.out.println("4. Porcentaje de hombres que trabajan");
        System.out.println("5. Porcentaje de mujeres que trabajan");
        System.out.println("6. El sueldo promedio de las hombres que trabajan");
        System.out.println("7. EL sueldo promedio de las mujeres que trabajan");
        System.out.println("8. Salir");
    }

    // Porcentaje de Hombres
    public static double porcentajeHombres(int[][] matriz) {
        double Por = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j == 0 && matriz[i][j] == 1) {
                    Por++;
                }
            }
        }
        Por = (100 * Por) / 8;
        return Por;
    }

    // Porcentaje de Mujer
    public static double porcentajeMujeres(int[][] matriz) {
        double Por = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j == 0 && matriz[i][j] == 2) {
                    Por++;
                }
            }
        }
        Por = (100 * Por) / 8;
        return Por;
    }

    // Porcentaje de Hombres que trabajan
    public static double porcentajeHombresTrabajan(int[][] matriz) {
        int numero = 0;
        double trabajo = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j == 0 && matriz[i][0] == 1) {
                    numero++;
                    System.out.println(" numero " + numero);
                    if (j == 0 && matriz[i][1] == 1) {
                        trabajo++;
                        System.out.println(" numero " + trabajo);
                    }
                }
            }
        }
        trabajo = (100 * trabajo) / numero;
        return trabajo;
    }

    // Porcentaje de Mujeres que trabajan
    public static double porcentajeMujeresTrabajan(int[][] matriz) {
        int numero = 0;
        double trabajo = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j == 0 && matriz[i][0] == 2) {
                    numero++;
                    System.out.println(" numero " + numero);
                    if (j == 0 && matriz[i][1] == 1) {
                        trabajo++;
                        System.out.println(" numero " + trabajo);
                    }
                }
            }
        }
        trabajo = (100 * trabajo) / numero;
        return trabajo;
    }

    // Promedio de sueldo de Hombres que trabajan
    public static double PromSueldoHombres(int[][] matriz) {
        int numero = 0;
        double promedio = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j == 0 && matriz[i][0] == 1) {
                    System.out.println(" numero " + numero);
                    if (j == 0 && matriz[i][1] == 1) {
                        promedio = promedio + matriz[i][2];
                        numero++;
                        System.out.println(" numero para redondiar " + matriz[i][2]);
                    }
                }
            }
        }
        System.out.println(" numero " + promedio);

        promedio = promedio / numero;
        return promedio;
    }

    // Promedio de sueldo de Mujeres que trabajan
    public static double PromediosueldoMujeres(int[][] matriz) {
        int numero = 0;
        double promedio = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j == 0 && matriz[i][0] == 1) {
                    System.out.println(" numero " + numero);
                    if (j == 0 && matriz[i][1] == 1) {
                        promedio = promedio + matriz[i][2];
                        numero++;
                        System.out.println(" numero para redondiar " + matriz[i][2]);
                    }
                }
            }
        }
        System.out.println(" numero " + promedio);

        promedio = promedio / numero;
        return promedio;
    }
}
