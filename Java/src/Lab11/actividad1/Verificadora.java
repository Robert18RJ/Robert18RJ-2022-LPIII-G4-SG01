package actividad1;

public class Verificadora<T> implements Contenedora<T> {
	//Atributo
	private T [] datos;
	
	//Constructor
	public Verificadora(T [] x) {
		this.datos = x;
	}

	//Metodo 
	public boolean contiene (T valor) {
		for(T ele: datos)
			if(ele != null && valor.equals(ele))
				return true;
	return false;
	}
}
