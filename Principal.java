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
        if (fl == true)
            System.out.println("Adivinaste!!!");
            System.out.println("Ganaste una Laptop");            
        else
            System.out.println("Ups, perdiste...");

        sc.close();
    }
}
