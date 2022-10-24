package Lab08.GUI;

// PRUEBA DE Panel para administrar esquema complejo
// Prueba de MarcoPanel
import javax.swing.JFrame;

public class MarcoPanelEjecucion extends JFrame {
    public static void main(String[] args) {
        MarcoPanel marcoPanel = new MarcoPanel();
        marcoPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoPanel.setSize(450, 200);
        marcoPanel.setVisible(true);
    }
} // fin de la clase DemoPanel
