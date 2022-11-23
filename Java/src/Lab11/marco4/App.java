package marco4;

public class App {
	 public static void main(String[] args) throws Exception{
		 Box<Frutas> boxFruit = new Box<Frutas>(new Frutas("fruta1"));
		 Box<Secos> boxSecos = new Box<Secos>(new Secos("fruta2",23));
		 Box<Agua> boxAgua = new Box<Agua>(new Agua("fruta3","Rojo","Peru"));
		 //Box<Integer> boxInt = new Box<Integer>(10);
		 //No es valido ya que esta restringido 
		 
		 System.out.println("Caja de frutas: " + boxFruit);
		 System.out.println("Caja de fruto secos: " + boxSecos);
		 System.out.println("Caja de fruta de agua: " + boxAgua);
	 }
	}

