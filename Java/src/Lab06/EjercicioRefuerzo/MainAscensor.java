package Lab06.EjercicioRefuerzo;

import java.util.Scanner;

public class MainAscensor {
	// Este será nuestro Ascensor
	private static Elevador ascensor = null;

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		/// Intentamos construir un elevador, necesitamos usuario propocione un piso
		/// máximo aceptable
		while (ascensor == null) {
			System.out.print("Indique cuál es el piso más alto del edificio: ");
			try {
				int pisoFinal = Integer.parseInt(teclado.nextLine());
				if (pisoFinal < 2)
					System.out.println("Valor inaceptable. Edificio ha de tener mínimo dos pisos");
				else
					ascensor = new Elevador(pisoFinal); // Podemos construir un Ascensor
			} catch (NumberFormatException ex) {
				System.out.println("Introduzca un valor entero mayor que 1");
			}
		}

		// Menu
		int opcion = 0;
		while (opcion != 2) {
			System.out.println("\nPiso Actual: " + ascensor.getPisoActual());
			System.out.println("[1] - Utilizar ascensor");
			System.out.println("[2] - Salir del programa");
			System.out.print("Escoja opción: ");
			try {
				opcion = Integer.parseInt(teclado.nextLine());
				switch (opcion) {
					case 1:
						desplazar();
						break;
					case 2:
						System.out.println("\nFIN DE PROGRAMA");
						break;
					default:
						System.out.println("Elija entre los valores 1 y 2");
				}
			} catch (NumberFormatException ex) {
				System.out.println("Elija entre los valores 1 y 2");
			}
		}

	}

	// Pide el número de personas que suben al ascensor y el piso destino para
	// ordenar al ascensor que se desplace.
	static void desplazar() {
		try {
			System.out.print("\n¿Cuántas personas suben al ascensor?: ");
			int personas = Integer.parseInt(teclado.nextLine());
			System.out.print("¿Piso destino?: ");
			int destino = Integer.parseInt(teclado.nextLine());
			ascensor.desplazar(personas, destino);
		} catch (NumberFormatException ex) {
			System.out.println("Error. Solo se admiten números enteros.");
		} catch (Exception e) { // Aquí capturamos las excepciones que lanza el Ascensor
			System.out.println(e.getMessage());
		}
	}

}
