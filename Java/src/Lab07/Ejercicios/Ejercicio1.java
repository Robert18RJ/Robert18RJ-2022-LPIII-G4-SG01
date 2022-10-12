package Lab07.Ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        double[] v = new double[15];
        // aqui
        acceso(v, 16);
    }

    public static double acceso(double[] v, int j) throws Exception {
        try {
            if (j >= 0 && j <= v.length)
                return v[j];
            else
                throw new Exception("El indice " + j + "no existe en el vector");
        } catch (Exception exc) {
            // throw exc;
            System.out.println(exc.getLocalizedMessage());
            return 0;
        }
    }
}