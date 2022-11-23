package marco4;

public class Tropicales extends Frutas {
	protected String color;

	public Tropicales(String nombre, String color) {
		super(nombre);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() +", " + this.color ;
	}
	
	

}
