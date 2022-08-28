package Lab02.Ejercicios;

import java.util.Scanner;

public class MainPerfilMedico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creación de variables
        String nombre;
        String apellido;
        String sexo;
        int dia;
        int mes;
        int anio;
        double altura;
        double peso;

        // Solicitud de datos
        System.out.println("Ingrese nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese apellido: ");
        apellido = entrada.nextLine();
        System.out.println("Ingrese género: ");
        sexo = entrada.next();
        System.out.println("Ingrese dia: ");
        dia = entrada.nextInt();
        System.out.println("Ingrese mes: ");
        mes = entrada.nextInt();
        System.out.println("Ingrese año: ");
        anio = entrada.nextInt();
        System.out.println("Ingrese altura (cm): ");
        altura = entrada.nextDouble();
        System.out.println("Ingrese peso (kg): ");
        peso = entrada.nextDouble();

        // Instancia
        PerfilMedico p1 = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        // Impresión de datos con la funcion toString
        System.out.println(p1.toString());

        entrada.close();
    }
}
