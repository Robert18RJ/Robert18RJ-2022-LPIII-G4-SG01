package Lab06.Polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        EmpleadoAsalariado empAsalariado = new EmpleadoAsalariado();
        EmpleadoPorComision empPorComision = new EmpleadoPorComision();
        EmpleadoPorHoras empPorHoras = new EmpleadoPorHoras();
        EmpleadoBaseMasComision empBaseMasComision = new EmpleadoBaseMasComision();

        Empleado[] empleados = new Empleado[4];
        empleados[0] = empAsalariado;
        empleados[1] = empPorComision;
        empleados[2] = empPorHoras;
        empleados[3] = empBaseMasComision;

        for (Empleado empPolimorfico : empleados) {
            empPolimorfico.ingreso();
        }
    }

}
