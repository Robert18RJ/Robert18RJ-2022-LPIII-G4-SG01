package Lab07.Actividades;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int num, den, rpta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero para el numerador");
        num = sc.nextInt();
        System.out.println("Ingrese un numero entero para el denominador");
        den = sc.nextInt();

        rpta = num / den;

        System.out.println("La rpta: " + rpta);

        try {
            rpta = num / den;
            throw new MiException("Exception desconocida");
        } catch (ArithmeticException e) {
            System.out.println("vExcepcionn aritmetica");
        } catch (NullPointerException m) {
            System.out.println("Excepcion puntero nulo");
        } catch (MiException n) {
            System.out.println("Se manejo la excepcion desconocida");
        } finally {
            System.out.println("Se cerraron todos los recursos");
        }

        System.out.println("Continua el flujo del programa 20");

        //sc.close();
    }
