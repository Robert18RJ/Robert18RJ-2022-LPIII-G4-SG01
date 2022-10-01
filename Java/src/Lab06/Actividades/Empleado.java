package Lab06.Actividades;

//3. Declaracion de la superclase abstracta Empleado que implementa PorPagar
public abstract class Empleado implements PorPagar {

    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    
    //NOTA: Aqui no implementamos el metodo getMontoPago de PorPagar, asi que
    //esta clase debe declararse como abstract para evitar un error de compilacion.

    //set y get de la clase Empleado
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    @Override
    public String toString() {
        return String.format("%s  %s \nNumero de seguro social: %s",primerNombre, apellidoPaterno,numeroSeguroSocial);
    }
}
