import java.util.Scanner;

public class EstruturaDeRep {
    public static void main(String[] args) {
        /*int cc=0;
        do{
            System.out.println(cc);
            cc++;
        }while( cc < 4);*/
        int n, s=0;
        String resp ;
        Scanner t = new Scanner(System.in);
        do {
            System.out.println("Diginte um numero:");
            n=t.nextInt();
            s += n;
            System.out.println("Quer continuar? S/N");
            resp = t.next();
        }while(resp.equals("S"));
        System.out.println("A soma dos numeros e: " + s);
    }
}