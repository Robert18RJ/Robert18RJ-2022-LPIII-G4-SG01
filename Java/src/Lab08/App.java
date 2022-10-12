package Lab08;
/*
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String primerNumero = JOptionPane.showInputDialog("Introduzca el segundo entero");
        String segundoNumero = JOptionPane.showInputDialog("Introduzca el segundo entero");
        // convierte las entradas String en valores int para usarlos en un cálculo
        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        int suma = numero1 + numero2;
        // muestra los resultados en un diálogo de mensajes de JOptionPane
        JOptionPane.showMessageDialog(null, "La suma es " + suma, "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE);
    }

}*/

// Prueba de CampoTextoMarco
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        CampoTextoMarco campoTextoMarco = new CampoTextoMarco();
        campoTextoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        campoTextoMarco.setSize(350, 100);
        campoTextoMarco.setVisible(true);
    }
} // fin de la App CampoTextoMarco
