package actividad1;

public class Estudiante extends Persona {
	//Atributos
	private String especilidad;
	private Procedencia procedencia;

	//Constructor
	public Estudiante(String nombres, String direccion, String telefono, String especilidad, Procedencia procedencia) {
		super(nombres, direccion, telefono);
		this.especilidad = especilidad;
		this.procedencia = procedencia;
	}

	//Getters y Setters

	public String getEspecilidad() {
		return this.especilidad;
	}

	public void setEspecilidad(String especilidad) {
		this.especilidad = especilidad;
	}

	public Procedencia getProcedencia() {
		return this.procedencia;
	}

	public void setProcedencia(Procedencia procedencia) {
		this.procedencia = procedencia;
	}
	
	//Equals
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Estudiante) {
			Estudiante estComparar = (Estudiante) obj;
			return this.getNombres().equals(estComparar.getNombres()) && 
					this.getProcedencia().getDepartamento().equals(estComparar.getProcedencia().getDepartamento()) 
					&& this.getProcedencia().getProvincia().equals(estComparar.getProcedencia().getProvincia());
		}
		return false;
	}

	//To String
	@Override
	public String toString() {
		return "Estudiante"+"\nNombres : "+ this.getNombres() +"\nDireccion : "
				+this.getDireccion()+"\nTelefono : "+this.getTelefono()+
				"\nEspecilidad : " + this.especilidad + "\nProcedencia : " + this.procedencia 
				+ "\n";
	}
}
