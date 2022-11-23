package marco1;

public class App {
	public static void main(String[] args) throws Exception {
		Box<Integer> boxInt = new Box<Integer>(10);
		Box<String> boxStr = new Box<String>("hola");

		Box<Double> boxDou = new Box<Double>(34.67);

		System.out.println("Caja de enteros: " + boxInt);
		System.out.println("Caja de cadenas: " + boxStr);
		System.out.println("Caja de doubles: " + boxDou);
	}
}
