package Lab04;

public class Prueba {

    //Main
    public static void main(String[] args) {
        //Declaracion del arreglo unidimensional
        int[] arregloUnidi = { 1, 2, 3, 4, 5 };
        System.out.println("El arreglo unidimensional es: ");
        //Bucle: la variable i recorre por todo el arreglo
        for (int i : arregloUnidi) {
            System.out.println(i);
        }
        System.out.println();//Salto de linea

        //Declaracion del arreglo bidimensional
        int[][] arregloBidi = { { 1, 2, 3 }, { 4,5, 6 }, { 7, 8, 9 } };
        
        System.out.println("Los arreglos bidimensionales on: ");
        //Llamado del metodo
        imprimirArreglo(arregloBidi);
    }

    //Metodo (funcion o procedimiento que pertenece a una clase)para imprimir
    public static void imprimirArreglo(int[][] arreglo) {
        for (int[] arreglo1 : arreglo) {
            for (int columna = 0; columna < arreglo.length; columna++) {
                System.out.println(arreglo1[columna]);
            }
        }
    }
}
