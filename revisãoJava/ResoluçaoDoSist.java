
import java.awt.Dimension;

public class ResoluçaoDoSist {
    public static void main(String[] args) {
        Dimension tela = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("A resolução do sistema é: " + tela.width + "x" + tela.height);
    }
    
}
