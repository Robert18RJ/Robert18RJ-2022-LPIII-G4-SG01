package Lab06.EjercicioRefuerzo;

public class Elevador {
    private final int PESO_MAX = 750;
    private int pisoFinal;
    private int pisoActual;

    //Constructor
    public Elevador(int pisoFinal) {
        this.pisoFinal = pisoFinal;
        pisoActual = 1; 
    }
    //Excepciones
    public void desplazar(int personas, int pisoDestino) throws Exception {

        if (personas * 50 > PESO_MAX)
            throw new Exception("Peso máximo superado");
        if (pisoDestino < 1)
            throw new Exception("No existen plantas por debajo del piso 1");
        if (pisoDestino > pisoFinal)
            throw new Exception("No existen plantas por encima del piso " + pisoFinal);
        if (pisoActual == pisoDestino)
            throw new Exception("Ascensor ya se encuentra en el piso " + pisoDestino);
        // Si no ha saltado ninguna excepción, podemos desplazar el Ascensor
        pisoActual = pisoDestino;
    }

    //Retorna el piso actual
    public int getPisoActual() {
		return pisoActual;
	}
}
