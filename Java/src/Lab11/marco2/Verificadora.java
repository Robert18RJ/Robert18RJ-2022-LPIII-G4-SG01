package marco2;

public class Verificadora<T> implements Contenedora<T> {
	private T [] datos;
	public Verificadora(T [] x) {
		this.datos = x;
	}

	public boolean contiene (T valor) {
		for(T ele: datos)
			if(ele != null && valor.equals(ele))
				return true;
	return false;
	}
}
