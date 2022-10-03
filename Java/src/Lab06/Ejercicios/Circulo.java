package Lab06.Ejercicios;

public class Circulo extends FiguraBidimensional {

    // Atributos
    private double radio;

    // Constructor
    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    // Metodo de la clase FiguraBidimensional
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    // Metodo abstracto de la clase abstracta Figura
    @Override
    public void ingresar() {
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "\nArea: " + calcularArea();
    }

}
