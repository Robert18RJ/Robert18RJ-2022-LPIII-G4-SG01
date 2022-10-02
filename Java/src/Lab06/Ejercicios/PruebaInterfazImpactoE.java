package Lab06.Ejercicios;

import java.util.ArrayList;

public class PruebaInterfazImpactoE {
    public static void main(String[] args) {
        int countAuto = 0;
        int countBicleta = 0;
        int countEdificio = 0;

        ArrayList<ImpactoEcologico> objetoImpactoEcologico = new ArrayList<ImpactoEcologico>();
        objetoImpactoEcologico.add(new Edificio(280000, 10000, 20));
        objetoImpactoEcologico.add(new Edificio(320000, 15000, 25));
        objetoImpactoEcologico.add(new Auto(15, 14000, 5));
        objetoImpactoEcologico.add(new Auto(30, 28000, 10));
        objetoImpactoEcologico.add(new Bicicleta(10, 12, 5));
        objetoImpactoEcologico.add(new Bicicleta(15, 15, 7));

        System.out.println("\nImpactoEcologico procesados en forma polimorfica:\n");

        for (ImpactoEcologico ImpactoEcologicoActual : objetoImpactoEcologico) {
            System.out.printf("%s\n%s: %,.2f\n\n", ImpactoEcologicoActual.toString(), "Impacto ambiental",
                    ImpactoEcologicoActual.obtenerlmpactoEcologico());

            if (ImpactoEcologicoActual instanceof Auto) {
                countAuto++;
            }
            if (ImpactoEcologicoActual instanceof Bicicleta) {
                countBicleta++;
            }
            if (ImpactoEcologicoActual instanceof Edificio) {
                countEdificio++;
            }
        }

        System.out.println("\nEn el arreglo de Impacto Ecologico hay: " + countAuto + " Carros");
        System.out.println("\nEn el arreglo de Impacto Ecologico hay: " + countBicleta + " Biciletas");
        System.out.println("\nEn el arreglo de Impacto Ecologico hay: " + countEdificio + " Edificios");
    }
}
