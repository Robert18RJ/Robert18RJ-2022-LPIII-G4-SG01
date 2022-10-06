package Lab06.EjercicioRefuerzo;

public class Edificio {
    private int numPisos;
    private Elevador elevador; //composición

        public Edificio(int numPisos, Elevador elevador) {
        this.numPisos = numPisos;
        this.elevador = elevador;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public Elevador getElevador() {
        return elevador;
    }

    public void setElevador(Elevador elevador) {
        this.elevador = elevador;
    }
    
}
