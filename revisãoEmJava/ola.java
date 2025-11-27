import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ola {
    public static void main(String[] args) {
       JFrame janela =  new JFrame();

       JButton botao = new JButton("Clique aqui");
    botao.setBounds(0, 0, 200, 30);
    botao.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("ola, mundo");
        }
        });
        janela.add(botao);

        janela.setLayout(null);

       janela.setBounds(0, 0, 400, 600);
       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       janela.setVisible(true);
    }
}
