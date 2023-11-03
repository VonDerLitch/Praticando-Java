package meuprojeto;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout  extends JFrame {
    public Layout() {
        super("Meu Layout");

        getContentPane().add(new JButton("Botão Centralizado"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    public static void main (String[]args){
        new Layout();
    }
}
