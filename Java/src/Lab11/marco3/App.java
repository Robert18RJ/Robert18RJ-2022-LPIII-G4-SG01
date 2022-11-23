package marco3;


public class App {
	 public static void main(String[] args) throws Exception{
	 Integer[] x = {23,56,78,1,6};
	 Verificadora<Integer> ver = new Verificadora<Integer>(x);
	 
	 String msg = ver.contiene(78)? "78 SI esta " : "78 NO esta ";
	 System.out.println(msg);
	 
	 msg = ver.contiene(-10)? "-10 SI esta " : "-10 NO esta ";
	 System.out.println(msg);
	 
	 
	 String[] s = {"rojo","azul","verde","negro"};
	 Verificadora<String> verStr = new Verificadora<String>(s);
	 
	 msg = verStr.contiene("verdecito")? "verdecito SI esta " : "verdecito NO esta ";
	 System.out.println(msg);
	 
	 //Probando con un Arreglo Persona
	 Persona [] personArray = {
			 new Persona("72935398","Luis"),
			 new Persona("72935397","Juan"),
			 new Persona("72869478","Maria"),
			 new Persona("73965762","Rosa")
	 };
	 
	 Verificadora<Persona> verPerson = new Verificadora<Persona>(personArray);
	 msg = verPerson.contiene(new Persona("72935398","Luis"))? "72935398 SI esta " : "72935398 NO esta ";
	 System.out.println(msg);
	 
	 msg = verPerson.contiene(new Persona("72935390","Juan"))? " 72935390 SI esta " : "772935390 NO esta ";
	 System.out.println(msg);
	/*
	 if(ver.contiene(9.333)){
		 System.out.println("Si tiene 9.333");
		}
	 else{
		System.out.println("NO tiene 9.333");
		}
	*/
	 }
}