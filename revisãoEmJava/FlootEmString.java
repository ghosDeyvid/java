import java.util.Scanner;

public class FlootEmString {
    public static void main(String[] args) {
        /*float n1, n2, s;
        n1 = 5.5f;
        n2 = 6.25f;
        s = (n1 + n2)/2;
        System.out.format(Float.toString(s));*/
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        System.out.println("Digite um numero;");
        float n= n1.nextFloat();
        System.out.println("Digite outro numero;");
        float m = n2.nextFloat();
        float s = (n + m / 2);
        System.out.println("O valor da soma é: " + s);
        if ( s >= 10){
            System.out.println("Valor de mair ;");
        }else{
            System.out.println("Valor de menor;");
        }

    }

}
