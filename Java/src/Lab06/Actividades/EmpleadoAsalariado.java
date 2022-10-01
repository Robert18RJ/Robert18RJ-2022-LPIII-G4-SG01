package Lab06.Actividades;
// 4. La clase EmpleadoAsalariado extiende a Empleado, que implemente a PorPagar
public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

    //Constructor de EmpleadoAsalariado
    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double salarioSemanal) {

        super(primerNombre, apellidoPaterno, numeroSeguroSocial);//pasa argumentos al constructor empleado
        setSalarioSemanal(salarioSemanal);//valida y almacena el salario            
    }

    //get y set de salarioSemanal
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    //calcula los ingresos: implementa el metodo de la interfaz PorPagar
    //que era abstracto en la superclase Empledo
    
    @Override
    public double getMontoPago() {
        return getSalarioSemanal();// calcula el costo total
    }

    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s\nSalario Semanal: $%,.2f",super.toString(),salarioSemanal);
    }

}
