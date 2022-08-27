package Lab02.Actividades;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {    
        Scanner entrada =new Scanner(System.in);         
        
        Perro Fido = new Perro("chihuahua", "marron");
        Perro Pelusa = new Perro("pequines", "blanco");
        System.out.println(Fido.toString());
        System.out.println(Pelusa.toString());
        Fido.increEdad(2);
        Pelusa.increEdad(5);
        System.out.println(Fido.toString());
        System.out.println(Pelusa.toString());        
        entrada.close();
    }
}
