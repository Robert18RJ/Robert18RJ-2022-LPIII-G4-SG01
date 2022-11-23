package ejercicio1;

import java.util.Arrays;

public class App {

	public static void main(String[] args) throws IsFull, IsEmpty, ObjectNoExist, ExistsList {
		try {
			// Creacion del objeto b1
			CandyBags b1 = new CandyBags(5, "Ambrosito");

			Goodies g1 = new Goodies(1, "Papitas", (float) 1.8);
			Chocolates choc1 = new Chocolates(2, "Chocolate", (float) 1.5, "Amargo");
			Biscuits bis1 = new Biscuits(3, (float) 2.3, "Chocolate", "Estrella");
			Soda sal1 = new Soda(4, (float) 1.60, "Cuadrado", 2.2);
			Sweet dul1 = new Sweet(5, (float) 1.70, "Corazon", 9.2);

			// Usando el metodo add
			b1.add(g1);
			b1.add(choc1);
			b1.add(bis1);
			b1.add(sal1);
			b1.add(dul1);

			System.out.println(b1);

			System.out.println(" ");
			System.out.println("cheapest");
			System.out.println("--------");

			System.out.println(b1.cheapest());

			System.out.println(" ");
			System.out.println("mostExpensive");
			System.out.println("-------------");
			System.out.println(b1.mostExpensive(2));

		} catch (IsFull | ExistsList exc) {
			System.out.println(exc.getMessage());
		}

	}

}
