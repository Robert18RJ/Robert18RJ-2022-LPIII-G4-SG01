package ejercicio2;

public class App {

	public static void main(String[] args) throws ObjectNoExist {
		try {
			Dictionary dict1 = new Dictionary();
			//Agregamos los pares Ordenados
			dict1.add("user", "Jaely");
			dict1.add("YouTube", "www.youtube.com");
			dict1.add(77001820, "Robert Joel Dueñas Vasquez ");
			System.out.println("ADD");
			System.out.println(dict1);
			System.out.println(" ");

			//Usando el metodo delete
			System.out.println("DELETE");
			System.out.println(dict1.delete("YouTube"));
			System.out.println(dict1);
			System.out.println(" ");
			
			//Usando el metodo getValue
			System.out.println("GETVALUE");
			System.out.println(dict1.getValue("user").toString());
			System.out.println(dict1.getValue(29313952).toString());
		} 
		catch(ObjectNoExist e) {
			System.out.println(e.getMessage());
		}
		
	}
}
