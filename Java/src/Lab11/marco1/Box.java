package marco1;

public class Box<T> {
	private T item;

	public Box(T item) {
		this.item = item;
	}

	public T getItem() {
		return this.item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public String toString() {
		return this.item.toString();
	}
}
