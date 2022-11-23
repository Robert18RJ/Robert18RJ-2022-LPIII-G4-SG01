package marco4;

public class Agua extends Tropicales {
	private String procedencia;

	public Agua(String nombre, String color, String procedencia) {
		super(nombre, color);
		this.procedencia = procedencia;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	@Override
	public String toString() {
		return super.toString() +", "+this.procedencia;
	}
}
