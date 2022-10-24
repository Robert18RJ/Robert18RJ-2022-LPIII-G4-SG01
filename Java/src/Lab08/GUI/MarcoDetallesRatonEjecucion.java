package Lab08.GUI;

// PRUEBA DE Evento de Raton con Clase Adaptadora
// Prueba de MarcoDetallesRaton.
import javax.swing.JFrame;

public class MarcoDetallesRatonEjecucion {
    public static void main(String[] args) {
        MarcoDetallesRaton marcoDetallesRaton = new MarcoDetallesRaton();
        marcoDetallesRaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoDetallesRaton.setSize(400, 150);
        marcoDetallesRaton.setVisible(true);
    }
} // fin de la clase DetallesRaton
