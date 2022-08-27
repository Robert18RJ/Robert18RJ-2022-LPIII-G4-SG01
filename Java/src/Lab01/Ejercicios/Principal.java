package Lab01.Ejercicios;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vida, rp;
        boolean fl = false;
        vida = 0;

        do {
            vida++;
            System.out.println("Vida:" + vida + "\t¿Cual es el numero secreto? ");
            rp = sc.nextInt();
            if (rp == 1234)
                fl = true;
        } while (vida < 3 && !fl);

        if (vida == 1) {
            System.out.println("Su premio ganado es: " + Regalo.elegir(vida));
        } else if (vida == 2) {
            System.out.println("Su premio ganado es: " + Regalo.elegir(vida));
        } else if ((vida == 3) && (rp==1234)) {
            System.out.println("Su premio ganado es: " + Regalo.elegir(vida));
        } else {
            System.out.println("Siga intentando");
        }
        sc.close();
    }
}
