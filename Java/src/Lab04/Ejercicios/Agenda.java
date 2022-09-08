package Lab04.Ejercicios;

public class Agenda {
    private Contacto contactos[];

    // Constructor por defecto para 10 contactos
    public Agenda() {
        contactos = new Contacto[10];
    }

    /*private Agenda(int tamaño) {
        contactos = new Contacto[tamaño];
    } */

    // Metodo para añadir contactos a la agenda
    public void añadirContacto(Contacto contacto) {
        if (comprobarSiExisteContacto(contacto)) {
            System.out.println("\n Ya existe un contacto con ese nombre, digite otro nombre: ");

        } else if (comprobarSiLaAgendaEstaLlena()) {
            System.out.println("\nLa agenda esta llena");
        } else {
            boolean registrado = false;
            for (int i = 0; i < contactos.length && !registrado; i++) {
                if (contactos[i] == null) {
                    contactos[i] = contacto;
                    registrado = true;
                }
            }
            if (registrado == true) {
                System.out.println("\n¡El contacto se ha registrado con éxito!");
            } else {
                System.out.println("\nNose ha podido registrar el contacto");
            }

        }
    }

    // Creamos el metodo para comprobar si existe el mismo contacto
    public boolean comprobarSiExisteContacto(Contacto contacto) {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals(contacto)) {
                return true;
            }
        }
        return false;
    }

    // Comprobar si la agenda esta llena
    public boolean comprobarSiLaAgendaEstaLlena() {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                return false;
            }

        }
        return true;
    }

    // Creamos el metodo para listar

    public void listarContactos() {
        if (comprobarSiHayHuecosLibres() == contactos.length) {
            System.out.println("\nNo hay contactos para listar");
        } else {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null) {
                    System.out.println("Nombre: " + contactos[i].getNombre());
                    System.out.println("Telefono: " + contactos[i].getTelefono());
                }

            }
        }

    }

    // Creamos para comprobar si hay espacios libres en el arreglo
    public int comprobarSiHayHuecosLibres() {
        int contadorVacios = 0;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                contadorVacios++;
            }
        }
        return contadorVacios;
    }

}
