package Lab06.Ejercicios;

public abstract class Figura {
    private String nombre;

    public abstract double calcularArea(); // método abstracto

    // Constructor    
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    // get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
