package marco2;

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