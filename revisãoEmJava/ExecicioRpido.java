import javax.swing.JOptionPane;

public class ExecicioRpido {
    public static void main(String[] args) {
        int n, s=0;   
        do{
         n = Integer.parseInt(JOptionPane.showInputDialog(null,
          "<html>Informe um numero:<br><em>(Valor 0 para sair)</em></html>"));
          s+=n;
        }while(n !=0);
        JOptionPane.showMessageDialog(null,"Soma dos valores " + s);
    }
    
}
