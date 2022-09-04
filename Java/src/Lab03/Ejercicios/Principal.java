package Lab03.Ejercicios;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int ComponenteX, ComponenteY;

        System.out.println("Ingrese Componente X: ");
        ComponenteX = entrada.nextInt();
        System.out.println("Ingrese Componente Y: ");
        ComponenteY = entrada.nextInt();         
        System.out.println("Área: " + Manejador.area(ComponenteX, ComponenteY));
        System.out.println("Perimetro: " + Manejador.perimetro(ComponenteX, ComponenteY));
        entrada.close();
    }

}
