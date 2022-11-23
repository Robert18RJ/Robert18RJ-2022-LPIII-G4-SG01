package Ejercicios_3;

public class Persona {
    private String DNI;
    private String Nombre;
    private String Apellido;

    public Persona(String DNI) {
        this.DNI = DNI;
    }

    public Persona(String DNI, String Nombre, String Apellido) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
    
}