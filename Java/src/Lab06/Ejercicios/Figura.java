package Lab06.Ejercicios;

public abstract class Figura {
    private String nombre;

    public abstract void ingresar(); // método abstracto

    // Este constructor no puede ser invocado directamente
    // solo lo usan las clases derivadas
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
