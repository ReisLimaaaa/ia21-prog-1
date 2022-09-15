package cadastro;
import javax.swing.JFrame;

public class Cadastro {

    public static void main(String[] args) {
        JFrame janela = new UsaJButton();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        JFrame robison = new UsaJText();
        robison.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        robison.setVisible(true);
    }   
}