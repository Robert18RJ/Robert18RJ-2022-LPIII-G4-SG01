package Lab06.Ejercicios;

public class MainFigura {
    public static void main(String[] args) {

        //Crea arregloFigura con seis elementos
        Figura[] objetosFiguras = new Figura[6];

        //Llena el arreglo con objetos que implementan la interfaz PorPagar
        objetosFiguras[0] = new Circulo("Circulo", 10);
        objetosFiguras[1] = new Cuadrado("Cuadrado", 10);
        objetosFiguras[2] = new Triangulo("Triangulo", 10,5);
        objetosFiguras[3] = new Esfera("Esfera", 15);
        objetosFiguras[4] = new Cubo("Cubo", 5);
        objetosFiguras[5] = new Tetraedro("Tetraedro", 5);

        System.out.println("\nFiguras:");

        //Procesa en forma genérica cada elementos en el arreglo objetosFiguras
        for (Figura figuritas : objetosFiguras) {            
            //imprime nombre de  las figuras y el respectivo toString         
            System.out.printf("\n%s \n%s\n","Figura: "+ figuritas.getNombre(),figuritas.toString());                       
        }   
    }
}
