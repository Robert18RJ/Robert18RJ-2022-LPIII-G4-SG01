package Lab08.GUI;

// Archivo "CampoTextoMarco.java"
// Los componentes JTextField y JPasswordField.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class CampoTextoMarco extends JFrame {
    private final JTextField campoTexto1; // campo de texto con tamaño fijo
    private final JTextField campoTexto2; // campo de texto con texto
    private final JTextField campoTexto3; // campo de texto con texto y tamaño
    private final JPasswordField campoContrasenia; // campo de contraseña con texto
    private final JLabel campoTexto5; // campo de texto con tamaño fijo
    private final JTextField campoTexto6; // campo de texto con texto
    private final JTextField campoTexto7; // campo de texto con texto y tamaño
    private final JPasswordField campoContrasenia2; // campo de contraseña con texto

    // El constructor de CampoTextoMarco agrega objetos JTextField a JFrame
    public CampoTextoMarco() {

        super("Prueba de JTextField y JPasswordField");
        setLayout(new FlowLayout());

        campoTexto5 = new JLabel("Label 1");
        add(campoTexto5); // agrega campoTexto5 a JFrame

        // construye campo de texto con 10 columnas
        campoTexto1 = new JTextField(10);
        add(campoTexto1); // agrega campoTexto1 a JFrame

        // construye campo de texto con texto predeterminado
        campoTexto2 = new JTextField("Escriba el texto aqui");
        add(campoTexto2); // agrega campoTexto2 a JFrame

        campoTexto6 = new JTextField("Escriba el texto aqui");
        add(campoTexto6); // agrega campoTexto6 a JFrame

        // construye campo de texto con texto predeterminado y 21 columnas
        campoTexto3 = new JTextField("Campo de texto no editable", 21);
        campoTexto3.setEditable(false); // deshabilita la edición
        add(campoTexto3); // agrega campoTexto3 a JFrame

        campoTexto7 = new JTextField("Campo de texto no editable", 21);
        campoTexto7.setEditable(false); // deshabilita la edición
        add(campoTexto7); // agrega campoTexto7 a JFrame

        // construye campo de contraseña con texto predeterminado
        campoContrasenia = new JPasswordField("Texto oculto");
        add(campoContrasenia); // agrega campoContrasenia a JFrame

        campoContrasenia2 = new JPasswordField("Texto oculto");
        add(campoContrasenia2); // agrega campoContrasenia2 a JFrame

        // registra los manejadores de eventos
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
        campoContrasenia.addActionListener(manejador);

        campoTexto5.setToolTipText("");
        campoTexto6.addActionListener(manejador);
        campoTexto7.addActionListener(manejador);
        campoContrasenia2.addActionListener(manejador);
    }

    // clase interna privada para el manejo de eventos
    private class ManejadorCampoTexto implements ActionListener {
        // procesa los eventos de campo de texto
        @Override
        public void actionPerformed(ActionEvent evento) {
            String cadena = "";

            // el usuario oprimió Intro en el objeto JTextField campoTexto1
            if (evento.getSource() == campoTexto1)
                cadena = String.format("Label 1: %s", evento.getActionCommand());

            // el usuario oprimió Intro en el objeto JTextField campoTexto2
            else if (evento.getSource() == campoTexto2)
                cadena = String.format("campoTexto2: %s", evento.getActionCommand());

            // el usuario oprimió Intro en el objeto JTextField campoTexto3
            else if (evento.getSource() == campoTexto3)
                cadena = String.format("campoTexto3: %s", evento.getActionCommand());

            // el usuario oprimió Intro en el objeto JTextField campoContrasenia
            else if (evento.getSource() == campoContrasenia)
                cadena = String.format("campoContrasenia: %s",
                        evento.getActionCommand());

            else if (evento.getSource() == campoTexto5)
                cadena = String.format("campoTexto5: %s", evento.getActionCommand());
            else if (evento.getSource() == campoTexto6)
                cadena = String.format("campoTexto6: %s", evento.getActionCommand());
            else if (evento.getSource() == campoTexto7)
                cadena = String.format("campoTexto7: %s", evento.getActionCommand());
            else if (evento.getSource() == campoContrasenia)
                cadena = String.format("campoContrasenia2: %s",
                        evento.getActionCommand());

            // muestra el contenido del objeto JTextField
            JOptionPane.showMessageDialog(null, cadena);
        }
    } // fin de la clase privada interna ManejadorCampoTexto
} // fin de la clase CampoTextoMarco
