package Lab06.Ejercicios;

public class Cubo extends FiguraTridimensional {
    // Atributos
    public double arista;

    // Constructor
    public Cubo( double arista) {
        super("Cubo");
        this.arista = arista;
    }

    // Método de la clase FiguraTridimensional
    @Override
    public double calcularArea() {
        return 6 * Math.pow(arista, 2);
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(arista, 3);
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "\nArea: " + calcularArea() + "\nVolumen: " + calcularVolumen();
    }

}
