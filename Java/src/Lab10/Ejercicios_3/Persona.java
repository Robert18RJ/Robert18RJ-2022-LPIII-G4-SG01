package Ejercicios_3;

public class Persona {
    private String DNI;
    private String primerNombre;
    private String primerApellido;

    public Persona(String DNI) {
        this.DNI = DNI;
    }

    public Persona(String DNI, String primerNombre, String primerApellido) {
        this.DNI = DNI;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
    }

    // El campo que nos permite distinguir si dos personas son el mismo o no es el DNI
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Persona) {
            // casting para la comparacion
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