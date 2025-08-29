package aula04;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class app {
    public static void main(String[] args) {
        JFrame janela = new JFrame();

        JLabel labelUsuario = new JLabel("Usuario");
        labelUsuario.setBounds(50, 50, 150, 30);
        
        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(50, 80, 150, 30);

        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(50, 180, 150, 30);

        JLabel labelSenha = new JLabel("Senha");
        labelSenha.setBounds(50, 150, 150, 30);


        JButton botaoLogar = new  JButton("Login");
        botaoLogar.setBounds(50, 220, 200 , 30);
        botaoLogar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());
                System.out.println(String.format("Usuario : %s\nSenha: %s", usuario, senha));
                campoUsuario.setText("");
                campoSenha.setText("");
            }

            
        });


        //add = Adicionar
        janela.add(botaoLogar);
        janela.add(labelUsuario);
        janela.add(campoUsuario);
        janela.add(campoSenha);
        janela.add(labelSenha);

        janela.setLayout(null);

        //Definir tamanho da janela
        janela.setBounds(0,0,400,600);

        janela.setDefaultCloseOperation(3);
        janela.setVisible(true);
    }
    
}
