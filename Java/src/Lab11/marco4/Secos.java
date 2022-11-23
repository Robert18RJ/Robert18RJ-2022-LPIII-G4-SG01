package marco4;

public class Secos extends Frutas {
	private int humedad;

	public Secos(String nombre, int humedad) {
		super(nombre);
		this.humedad = humedad;
	}

	public int getHumedad() {
		return humedad;
	}

	public void setHumedad(int humedad) {
		this.humedad = humedad;
	}

	@Override
	public String toString() {
		return super.toString() +", "+ this.humedad ;
	}
	
	

}
