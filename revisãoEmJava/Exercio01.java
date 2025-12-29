import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;



public class Exercio01 {
    public static void main(String[] args) {
       /*  Scanner ii = new Scanner(System.in);
        System.out.println("digite numero de Inicio");
        int i = ii.nextInt();
        Scanner ff = new Scanner(System.in);
        System.out.println("digite numero final");
        int f = ff.nextInt();
        Scanner pp = new Scanner(System.in);
        System.out.println("digite passo a passo");
        int p = pp.nextInt();

       DefaultListModel lista = new DefaultListModel();

        for(int c = i; c <= f ; c += p){
            lista.addElement(c);
        }
        System.out.println(lista);*/
       
        int i ;
        int f ;
        int p ;
        i = Integer.parseInt(JOptionPane.showInputDialog(null , "Infome o numer do inicio")) ;
        f = Integer.parseInt(JOptionPane.showInputDialog(null , "informr o numero do fim"));
        p = Integer.parseInt(JOptionPane.showInputDialog(null, "Infome o numero Passo a Passo"));
        
        DefaultListModel lista = new DefaultListModel();

        for( int c= i; c<=f; c+=p){
            lista.addElement(c);

        }
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, lista));
    }
}