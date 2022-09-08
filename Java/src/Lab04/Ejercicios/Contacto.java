package Lab04.Ejercicios;

public class Contacto {
    private String nombre;
    private String telefono;
    private String direccion;

    public Contacto(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public String getNombre() {
        return this.nombre;

    }
    public String getTelefono() {
        return this.telefono;

    }
    public String getDirecion() {
        return this.direccion;

    }
    public void setNombre(String nombre) {
        this.nombre = nombre;

    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;

    }
    public void setDirecion(String direccion) {
        this.direccion = direccion;
    }

    public boolean equals(Contacto contacto){
        if (this.nombre.trim().equalsIgnoreCase(contacto.getNombre().trim())){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return "\nNombre: "+nombre+ "\nTelefono: " + telefono+ "\n";
    }
}