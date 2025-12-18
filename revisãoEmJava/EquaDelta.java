import java.util.Scanner;

public class EquaDelta {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("digite um valor");
        int a1 = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("digite um valor");
        int b1 = b.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.println("digite um valor");
        int c1 = c.nextInt();

        double delta = Math.pow(b1, 2) - 4 * a1 * c1;
        System.out.println("O valor do delta é: " + delta);
        if(delta < 0){
            System.out.println(" Não existem Raízes:");
        }else{
            System.out.println("Existem Raízes:");
        }
    }
}    