package ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;

public class Dictionary {
	// Atributos
	private ArrayList<OrderedPair> list;

	// Constructores
	public Dictionary(int n) {
		this.list = new ArrayList<OrderedPair>(n);
	}

	public Dictionary() {
		this.list = new ArrayList<OrderedPair>();
	}

	// Getters y Setters
	public ArrayList<OrderedPair> getList() {
		return list;
	}

	public void setList(ArrayList<OrderedPair> list) {
		this.list = list;
	}

	// Metodo add (agrega un par ordenado a list)
	public <K, V> void add(K key, V value) {
		OrderedPair parAgregar = new OrderedPair(key, value);
		list.add(parAgregar);
	}

	// Metodo delete(quita un par ordenado del arreglo
	// a traves del key que se manda como parametro)
	// Devuelve true en el caso se elimine el objeto
	// Devuelve false en el caso no se encuentre la key
	public <K> boolean delete(K key) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getKey().equals(key)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}

	// Obtiene el par ordenado a traves de la key
	// En el caso la key no se encuentre en la list
	// Lanza una excepcion
	public <K, V> V getValue(K key) throws ObjectNoExist {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getKey().equals(key)) {
				V value = (V) list.get(i).getValue();
				return value;
			}
		}
		throw new ObjectNoExist();
	}

	@Override
	public String toString() {
		return "Dictionary" + list;
	}
}
