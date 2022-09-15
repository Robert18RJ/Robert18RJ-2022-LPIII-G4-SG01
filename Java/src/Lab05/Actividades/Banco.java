package Lab05.Actividades;

public class Banco {
    private String nombre;
    private Persona clientes[];

    public Banco(String nombre) {
        this(nombre, 20);
    }

    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
    }

    // setter y getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getClientes() {
        return clientes;
    }

    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", clientes=" + clientes + '}';
    }

    public void agregarCliente(Persona persona) {
        if (comprobarSiExisteCliente(persona)) {
            System.out.println("\nYa existe un contacto con ese nombre, por favor digite otro nombre");
        } else if (comprobarSiLaAgendaEstaLlena()) {
            System.out.println("\nLa agenda esta llena");
        } else {
            boolean registrado = false;
            for (int i = 0; i < clientes.length && !registrado; i++) {
                if (clientes[i] == null) {
                    clientes[i] = persona;
                    registrado = true;
                }
            }
            if (registrado == true) {
                System.out.println("\nEl contacto se ha registrado con exito !!");
            } else {
                System.out.println("\nNo se ha podido registrar el contacto");
            }
        }
    }

    public void darBajaCliente(Persona[] persona) {
        boolean eliminado = false;
        for (int i = 0; i < clientes.length && !eliminado; i++) {
            if (clientes[i] != null && clientes[i].equals(persona)) {
                clientes[i] = null;
                eliminado = true;
            }
        }
        if (eliminado == true) {
            System.out.println("\nEl contacto se ha eliminado");
        } else {
            System.out.println("\nEl contacto no se ha eliminado");
        }
    }

    /*public boolean buscarCliente(Persona persona) {
        boolean encontrado = false;

        for (int i = 0; i < clientes.length; i++) {
            if (nombre.equals(this.clientes[i].getNombre())) {
                System.out.println(
                        this.clientes[i].getNombre() + "-" + "Tf:" + this.clientes[i].getNombre());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("cliente encontrado");
        }
        return encontrado;

    }*/
    
    public void buscarCliente(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < clientes.length && !encontrado; i++) {
            if (clientes[i] != null && clientes[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                System.out.println("\n¡Contacto encontrado!");
                System.out.println("\nNombre: " + clientes[i].getNombre());
                System.out.println("Apellido: " + clientes[i].getApellido());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("\nNo se ha encontrado el contacto");
        }
    }

    public void clienteTipo(char tipo) {
        // Completa
    }

    public boolean comprobarSiExisteCliente(Persona persona) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].equals(persona)) {
                return true;
            }
        }
        return false;
    }

    public boolean comprobarSiLaAgendaEstaLlena() {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                return false;
            }
        }
        return true;
    }

}
