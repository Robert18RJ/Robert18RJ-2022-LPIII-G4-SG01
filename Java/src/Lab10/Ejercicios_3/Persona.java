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

    // El campo que nos permite distinguir si dos personas son el mismo o no es el DNI
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Persona) {
            // casting para la comparación
            Persona persona = (Persona) obj;
            if (this.DNI == persona.DNI) {
                return true;
            } else {
                return false;
            }
            // Si no es una instacia de persona
        } else {
            return false;
        }
    }
}