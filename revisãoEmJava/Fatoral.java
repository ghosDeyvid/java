import java.util.Scanner;

public class Fatoral {
    public static void main(String[] args) {
        /*Scanner ts = new Scanner(System.in);
        System.out.println("Digite um numero para calcular o fatorial: ");
        int num = ts.nextInt();
        int fa =1;
        String fato = "" +num;
        while (num >=1) {
            fa *= num;
            num--;
            if(num >= 1){
                fato += " x " + num;

            }
        }
        System.out.println(fato + " = " + fa);*/
        Scanner ts = new Scanner(System.in);
        System.out.println("Digite um numero para calcular o fatorial: ");
        int num = ts.nextInt();
        int f = 1;
        String fa = "" + num;
        while ( num >=1){
            f *= num;
            num--;

            fa += " x " + num;
        }
        System.out.println(fa + " = " + f);
    }
}
