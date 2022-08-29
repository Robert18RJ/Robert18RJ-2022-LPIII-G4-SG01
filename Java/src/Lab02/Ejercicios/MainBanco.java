package Java.src.Lab02.Ejercicios;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MainBanco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creación de variables
        String nombre;
        double cantidad;
        boolean salir = false;
        int opc;

        // Solicitud de datos
        System.out.println("Ingrese el nombre del titular: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese cantidad: ");
        cantidad = entrada.nextDouble();

        // Instancia
        CuentaBanco p1 = new CuentaBanco(nombre, cantidad);

        // Impresión de datos con la funcion toString
        System.out.println(p1.toString());

        while (!salir) {
            System.out.println("\n-----MENÚ-----");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Mostrar saldo actual");
            System.out.println("4. Salir");
            
            //Excepciones
            try {

                System.out.println("\nElija una de las opciones: ");
                opc = entrada.nextInt();
                double deposito, retiro;

                switch (opc) {
                    case 1:
                        System.out.println("Ingrese la cantidad a depositar: ");
                        deposito = entrada.nextDouble();
                        p1.Ingresar(deposito);                        
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad a retirar: ");
                        retiro = entrada.nextDouble();
                        p1.Retirar(retiro);                        
                    case 3:
                        System.out.println("\n>>>SALDO ACTUAL: " + p1.getCantidad());
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                entrada.next();
            }
        }
        entrada.close();
    }
}
