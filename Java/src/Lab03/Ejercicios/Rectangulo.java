package Lab03.Ejercicios;

public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    // Constructor
    public Rectangulo(Coordenada C1, Coordenada C2) {
        this.esquina1 = C1;
        this.esquina2 = C2;
    }
    
    //A.2
    public Rectangulo(int base, int altura) {
        this.esquina1 = new Coordenada(0, altura);
        this.esquina2 = new Coordenada(base, 0);
    }

    // get se encarga de mostrar un valor a una propiedad o atributo de un objeto
    public Coordenada getEsquina1() {
        return esquina1;
    }

    // set permite modificar el valor de un atributo de un objeto
    public void setEsquina1(Coordenada C1) {
        this.esquina1 = C1;
    }

    
    public Coordenada getEsquina2() {
        return esquina2;
    }

    public void setEsquina2(Coordenada C2) {
        this.esquina2 = C2;
    }

    public String toString() {
        return ">>>Coordenada 1: " + esquina1 + ", Coordenada 2: " + esquina2;

    }
}
