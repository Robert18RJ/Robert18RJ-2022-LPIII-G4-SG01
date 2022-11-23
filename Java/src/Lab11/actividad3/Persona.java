package actividad3;

public class Persona {
	//Atributos
	private String nombres;
	private String direccion;
	private String telefono;
	
	//Constructor
	public Persona(String nombres, String direccion, String telefono) {
		this.nombres = nombres;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	
	//Getters y Setters
	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	//Equals
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Persona) {
			Persona personaComparar = (Persona) obj;
			return this.nombres.equals(personaComparar.getNombres());
		}
		return false;
	}

	//To String
	@Override
	public String toString() {
		return "Persona" + "\tNombres : " + this.nombres + "\nDireccion : " + this.direccion 
				+ "\tTelefono : " + this.telefono + "\n";
	}	
	
}
