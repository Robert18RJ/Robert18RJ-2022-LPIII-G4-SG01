package Java.src.Lab02;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner entrada =new Scanner(System.in);            
        
        int peso,edad,temperatura;
        Perro Fido = new Perro("chihuahua", "marron");
        Perro Pelusa = new Perro("pequines", "blanco");
        System.out.println(Fido.toString());
        System.out.println(Pelusa.toString());
        Fido.increEdad(2);
        Pelusa.increEdad(5);
        System.out.println(Fido.toString());
        System.out.println(Pelusa.toString());
        
        System.out.println("Ingrese el nuevo peso para el perro : ");
        peso=entrada.nextInt();
        System.out.println("Ingrese la nueva edad para el perro : ");
        edad=entrada.nextInt();
        System.out.println("Ingrese la nueva temperatura para el perro : ");
        temperatura=entrada.nextInt();
        System.out.println("DIAGNOSTICO: " + Diagnostico.elegir(peso,edad,temperatura));

        entrada.close();
    }
}
