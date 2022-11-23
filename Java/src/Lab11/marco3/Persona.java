package marco3;

public class Persona  {
	private String dni;
	private String nombre;
	
	public Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Persona: "+this.dni+", " + this.nombre +"\t";
	}
	
	//Equals
	@Override
	public boolean equals(Object obj) {
		Persona personaComparar = (Persona) obj;
		return this.getDni().equals(personaComparar.getDni());
	}

}
