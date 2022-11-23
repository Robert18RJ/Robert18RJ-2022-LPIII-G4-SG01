package actividad2;

public class App {

	public static void main(String[] args) {
		//Instanciacion de la clase generica para Integer - Integer
		OrderedPair<Integer,Integer> parIntInt = 
				new OrderedPair<Integer,Integer>(4,2);
		System.out.println(parIntInt);
		
		//Instanciacion de la clase generica para Integer - String
		OrderedPair<Integer,String> parIntString = 
				new OrderedPair<Integer,String>(1,"hola");
		System.out.println(parIntString);
		
		//Instanciacion de la clase generica para String - Persona
		Persona p1 = new Persona("Robert Joel","Los Alamos 210","947398833");
		OrderedPair<String,Persona> parStringPersona = 
				new OrderedPair<String,Persona>("Bye",p1);
		System.out.println(parStringPersona);
		
	}

}
