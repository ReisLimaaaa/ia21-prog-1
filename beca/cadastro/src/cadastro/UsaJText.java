package cadastro;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UsaJText extends JFrame implements ActionListener  {
    private JLabel l1,l2,l3,l4,l5,l6;
    private JTextField t1,t2,t3,t4,t5;
    private JPasswordField p1;
    private JButton b1;
    private JPanel painel;
    
    public UsaJText() {
    this.l1 = new JLabel("Nome: ", JLabel.LEFT);
    this.t1 = new JTextField();
    
    this.l2 = new JLabel("Endereço: ", JLabel.LEFT);
    this.t2 = new JTextField();
    
    this.l3 = new JLabel("Telefone: ", JLabel.LEFT);
    this.t3 = new JTextField();
    
    this.l4 = new JLabel("Email: ", JLabel.LEFT);
    this.t4 = new JTextField();
    
    this.l5 = new JLabel("Login: ", JLabel.LEFT);
    this.t5 = new JTextField();
    
    this.l6 = new JLabel("Senha ", JLabel.LEFT);
    this.p1 = new JPasswordField();
    this.p1.setEchoChar('*');
     painel = new JPanel();
    this.b1 = new JButton("Mostrar");
    this.setTitle("Usando Caixas de Texto e de Senhas");
    this.setSize(500,300);
    this.setLocation(50,50);
    this.getContentPane().setBackground(new Color(180,180,180));
    this.montarLayout();
    }
    private void montarLayout () {
    this.getContentPane().setLayout(new GridLayout(7,2));
    this.getContentPane().add(this.l1);
    this.getContentPane().add(this.t1);
    this.getContentPane().add(this.l2);
    this.getContentPane().add(this.t2);
    this.getContentPane().add(this.l3);
    this.getContentPane().add(this.t3);
    this.getContentPane().add(this.l4);
    this.getContentPane().add(this.t4);
    this.getContentPane().add(this.l5);
    this.getContentPane().add(this.t5);
    this.getContentPane().add(this.l6);
    this.getContentPane().add(this.p1);
    this.getContentPane().add(this.painel);
    this.getContentPane().add(this.b1);
    this.b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
    if (e.getSource()== this.b1) {
    String s = "Nome: " + this.t1.getText() + "\nEndereço: " + this.t2.getText() + 
               "\nTelefone: " + this.t3.getText() + "\nEmail: " + this.t4.getText()  + "\nLogin: " + this.t5.getText() +
               "\nSenha: " + new String(this.p1.getPassword());
    JOptionPane.showMessageDialog(null,s, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }
    }  
} 
