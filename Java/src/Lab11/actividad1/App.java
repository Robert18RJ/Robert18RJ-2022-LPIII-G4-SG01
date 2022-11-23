package actividad1;

public class App {

	public static void main(String[] args) {
		Integer[] x = { 23, 56, 78, 1, 6 };
		Verificadora<Integer> ver = new Verificadora<Integer>(x);

		String msg = ver.contiene(78) ? "78 SI esta " : "78 NO esta ";
		System.out.println(msg);

		msg = ver.contiene(-10) ? "-10 SI esta " : "-10 NO esta ";
		System.out.println(msg);

		String[] s = { "rojo", "azul", "verde", "negro" };
		Verificadora<String> verStr = new Verificadora<String>(s);

		msg = verStr.contiene("verdecito") ? "verdecito SI esta " : "verdecito NO esta ";
		System.out.println(msg);

		// Probando con un Arreglo Persona
		Persona[] personArray = {
				new Persona("Robert Dueñas", "Jr. Jaely Morales", "947398833"),
				new Persona("Ana Agurto", "Los Alamos 210", "938177733"),
				new Persona("Maria Angela", "Av Arequipa", "938177755"),
				new Persona("Rosa Elena", "Av Ejercito", "968692871")
		};

		Verificadora<Persona> verPerson = new Verificadora<Persona>(personArray);
		msg = verPerson.contiene(new Persona("Robert Dueñas", "Jr. Jaely Morales", "947398833"))
				? "La Persona Robert Dueñas SI esta "
				: "La Persona Robert Dueñas NO esta ";
		System.out.println(msg);

		msg = verPerson.contiene(new Persona("Maria Elena", "Av Ejercito", "938192871"))
				? "La Persona Maria Elena SI esta "
				: "La Persona Maria Elena NO esta ";
		System.out.println(msg);

		// Probando con un Arreglo Goddie
		Goodies goodiesArray[] = {
				new Goodies(1, "Gomitas", (float) 2.0),
				new Goodies(2, "Chicle", (float) 0.2),
				new Goodies(3, "Galletas", (float) 1.2),
				new Goodies(4, "Donas", (float) 2.5),
				new Goodies(5, "Chocolate", (float) 1.5) };

		Verificadora<Goodies> verGoodies = new Verificadora<Goodies>(goodiesArray);
		msg = verGoodies.contiene(new Goodies(5, "Chocolate", (float) 1.5)) ? "La Golosina Chocolate SI esta "
				: "La Golosina Chocolate NO esta ";
		System.out.println(msg);

		msg = verGoodies.contiene(new Goodies(7, "Papas", (float) 1.5)) ? " La Golosina Papas SI esta "
				: "La Golosina Papas NO esta ";
		System.out.println(msg);

		// Probando con un Arreglo Estudiante
		Estudiante estudianteArray[] = {
				new Estudiante("Robert Dueñas", "Jr. Jaely Morales", "947398833",
						"Ingenieria Sistemas", new Procedencia("Arequipa", "Arequipa")),
				new Estudiante("Ana Agurto", "Los Alamos 210", "938177733",
						"Derecho", new Procedencia("Lima", "Lima")),
				new Estudiante("Maria Angela", "Av Arequipa", "938177755",
						"Odontologia", new Procedencia("Tumbes", "Tumbes")),
				new Estudiante("Rosa Elena", "Av Ejercito", "968692871",
						"Medicina", new Procedencia("Cusco", "Cusco")),
		};

		Verificadora<Estudiante> verEstudiante = new Verificadora<Estudiante>(estudianteArray);
		msg = verEstudiante.contiene(new Estudiante("Ana Agurto", "Los Alamos 210", "938177733",
				"Derecho", new Procedencia("Lima", "Lima"))) ? "EL Estudiante Ana Agurto SI esta "
						: "EL Estudiante Ana Agurto NO esta ";
		System.out.println(msg);

		msg = verEstudiante.contiene(new Estudiante("Carlos Rodriguez", "Mariano Melgar 101", "962734035",
				"Ingenieria Sistemas", new Procedencia("Lima", "Lima"))) ? "EL Estudiante Carlos Rodriguez SI esta "
						: "EL Estudiante Carlos Rodriguez NO esta ";
		System.out.println(msg);
	}

}
