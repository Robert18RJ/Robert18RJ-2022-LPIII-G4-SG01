package Lab02;

import java.util.Scanner;

public class BancoRJ {
    public static void main(String[] args) {
        String nombre, inicial;
        String opc;
        int edad=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre : ");
        nombre = sc.nextLine();
        System.out.println("\t **** Desea ingresar cuota inicial (S/N) ***\t");
        opc = sc.nextLine();
        if (opc == "S") {
            System.out.println("Ingresa Cantidad inicial : ");
            inicial = sc.nextLine();
            CuentaBanco Persona = new CuentaBanco(nombre, inicial);
        } else {
            CuentaBanco Persona = new CuentaBanco(nombre);
        }
        System.out.println(edad);
        System.out.println(Persona.toString());
        sc.close();


    }

}
