package Lab02.Actividades;

public class Diagnostico {

    public static String aptoVacunaA(Perro mascota) {
        if (mascota.getTemp() > 36 && mascota.getTemp() < 41 && mascota.getEdad() > 1 && mascota.peso > 5)
            return "El Perro esta SANO";
        else
            return "El Perro esta ENFERMO";
    }

    public static String aptoVacunaB(Perro mascota) {
        if (mascota.getTemp() > 36 && mascota.getTemp() < 41 && mascota.getEdad() > 1 && mascota.peso > 5)
            return "El Perro esta SANO";
        else
            return "El Perro esta ENFERMO";
    }
}
