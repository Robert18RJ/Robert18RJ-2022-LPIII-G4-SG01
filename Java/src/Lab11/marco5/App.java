package marco5;

public class App {
	 public static void main(String[] args) throws Exception{
	 Integer[] x = {23,56,78,1,6};
	 Verificadora<Integer> ver = new Verificadora<Integer>(x);
	 
	 String msg = ver.contiene(78)? "78 SI esta " : "78 NO esta ";
	 System.out.println(msg);
	 
	 msg = ver.contiene(-10)? "-10 SI esta " : "-10 NO esta ";
	 System.out.println(msg);
	 
	 Double[] str = {12.5,34.0,48.3,50.9};
	 Verificadora<Double> verStr = new Verificadora<Double>(str);
	 
	 msg = verStr.contiene(12.5)? "12.5 SI esta " : "12.5 NO esta ";
	 System.out.println(msg);
	 
	 
	 //No podriamos usar para cadenas ya que esta restringido
	/* 
	 String[] s = {"rojo","azul","verde","negro"};
	 Verificadora<String> verStr = new Verificadora<String>(s);
	 
	 msg = verStr.contiene("verdecito")? "verdecito SI esta " : "verdecito NO esta ";
	 System.out.println(msg);
	*/
	 
	 }
}