package actividad1;

public class Procedencia {
	//Atributos
	private String departamento;
	private String provincia;

	//Constructor 
	public Procedencia(String departamento, String provincia) {
		this.departamento = departamento;
		this.provincia = provincia;
	}

	//Getters y Setters
	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	//To String
	@Override
	public String toString() {
		return "Procedencia"+"\nDepartamento : " + this.departamento 
				+ "\nProvincia : " + this.provincia + "\n";
	}
	
	

}
