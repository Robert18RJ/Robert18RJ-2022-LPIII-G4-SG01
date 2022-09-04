package Lab03.Ejercicios;

public class Manejador {
    public static double area(int ComponenteX, int ComponenteY) {
        double area, altura, base;
        Rectangulo R = new Rectangulo(ComponenteX, ComponenteY);
        altura = Coordenada.distancia(R.getEsquina1());
        base = Coordenada.distancia(R.getEsquina2());
        area = altura * base;
        return area;
    }
    public static double perimetro(int ComponenteX, int ComponenteY) {
        double Perimetro, altura, base;
        Rectangulo R = new Rectangulo(ComponenteX, ComponenteY);
        altura = Coordenada.distancia(R.getEsquina1());
        base = Coordenada.distancia(R.getEsquina2());
        Perimetro = (altura * 2) + (base * 2);
        return Perimetro;
    }
}
