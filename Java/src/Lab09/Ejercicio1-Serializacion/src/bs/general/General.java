package bs.general;

import bs.bean.Empleado;
import bs.util.SerializarObjeto;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class General implements Serializable {

    ////Acceso a las Variables de Entorno - Compartidas
    public static General general = null;

    static {
        iniciarDatos();
    }

    public static void iniciarDatos() {
        General tmpGeneral = SerializarObjeto.deserializarObjeto("Estadoempleados.dat", General.class);
        if (tmpGeneral == null) {
            System.out.println("Creando los Datos Iniciales");
            General.general = new General();
        } else {
            System.out.println("Cargando Datos del Archivo");
            General.general = tmpGeneral;
        }
    }
    ////////////////////////////////////////////
    private List<Empleado> empleados = new LinkedList<>();

    public General() {
        iniciarListadoempleados();
    }

    private void iniciarListadoempleados() {

        Empleado empleado = new Empleado(1, 1, "Robert Dueñas", 7000);
        getEmpleado().add(empleado);

        Empleado empleado2 = new Empleado(2, 2, "Johan Mamani", 5000);
        getEmpleado().add(empleado2);

        empleado = new Empleado(3, 2, "Geral Roque", 3000);
        getEmpleado().add(empleado);
    }

    public void guardar() {
        SerializarObjeto.serializarObjeto("Estadoempleados.dat", this);
    }

    public List<Empleado> getEmpleado() {
        return empleados;
    }

    public void setempleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

}
