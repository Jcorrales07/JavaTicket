package nvm;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Login extends JFrame {
    JLabel mensajeLogin;
    JPanel pPrincipal;
    public Login() {
        crearVentana(1500, 900, "Login");
        crearPanel();
        crearEtiqueta("Login to Javaticket");
    }
    
    public void iniciarComponentes() {
        
    }
    
    public void crearVentana(int ancho, int largo, String titulo) {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Cierra el programa
        this.setBounds(0, 0, ancho, largo); //Le da el tamaño
        this.setLocationRelativeTo(null); //Centra la ventana
        this.setTitle(titulo);
    }
    
    public void crearPanel() {
        pPrincipal = new JPanel();
        pPrincipal.setBackground(Color.DARK_GRAY);
        pPrincipal.setLayout(null);
        this.getContentPane().add(pPrincipal);
    }
    
    public void crearEtiqueta(String mensaje) {
        mensajeLogin = new JLabel(mensaje);
        pPrincipal.add(mensajeLogin);
    }
}
