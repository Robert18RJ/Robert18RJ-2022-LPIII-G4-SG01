package Lab07.Cuestionario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static int conciente(int numerador, int denominador) {
        return numerador / denominador;
    }

    public static void main(String[] args){
        Scanner explorador = new Scanner(System.in);
        boolean fl = true;
        do{
	        try{
            System.out.print("Introduzca un numerador entero: ");
            int numerador = explorador.nextInt();
            System.out.print("Introduzca un denominador entero: ");
            int denominador = explorador.nextInt();

            int resultado = conciente(numerador, denominador);
            System.out.printf("\nResultado: %d / %d = %d\n",numerador,denominador,resultado);
            fl = false;
            }
            catch ( ArithmeticException arithmeticE){
                System.out.printf("\nExcepcion : %s\n", arithmeticE);
                explorador.nextLine();
                System.out.println("Cero no es un denominador válido... Intente nuevamente con un valor diferente");
            }
            catch ( InputMismatchException inputE){
                System.out.printf("\nExcepcion : %s\n", inputE);
                explorador.nextLine();
                System.out.println("El valor ingresado no es válido... Intente nuevamente");
            }
	    }while (fl);
        explorador.close();

}
