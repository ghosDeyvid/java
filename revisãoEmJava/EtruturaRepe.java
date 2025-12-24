import java.util.Scanner;

public class EtruturaRepe {
    public static void main(String[] args) {
        int n, s = 0;
        String resp;
        Scanner t = new Scanner(System.in);
        do{
            System.out.println("digite um numero:");
            n = t.nextInt();
            s+=n;
            System.out.println("Quer continuar? S/N");
            resp = t.next();

        }while(resp.equals("S"));
        System.out.println("A soma dos numeros e: " + s);
    }
}