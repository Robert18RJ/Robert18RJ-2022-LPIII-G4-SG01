package Lab06.Ejercicios;

public abstract class FiguraBidimensional extends Figura {
    
    public abstract void ingresar();//método abstracto

    // Constructor implicito super
    public FiguraBidimensional(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "FiguraBidimensional";
    }
}
