package Lab06.Ejercicios;

public class Cuadrado extends FiguraBidimensional {
    // Atributos
    public double lado;

    // Constructor
    public Cuadrado( double lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    // Metodo abstracto de la clase abstracta Figura
    @Override
    public void ingresar() {
    }

    // Método de la clase FiguraBidimensional
    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "\nArea: " + calcularArea();
    }

}
