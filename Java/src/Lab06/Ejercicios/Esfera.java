package Lab06.Ejercicios;

public class Esfera extends FiguraTridimensional {
    // Atributos
    public double radio;

    public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	// Constructor
    public Esfera( double radio) {
        super("Esfera");
        this.radio = radio;
    } 

    public double calcularArea() {
        return (4.0 * Math.PI * (radio*radio));
    }

    public double calcularVolumen() {
        return (4.0 / 3.0) * Math.PI * (Math.pow(radio, 3));
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString()+"\nArea: "+calcularArea()+"\nVolumen: "+calcularVolumen();        
    }

}