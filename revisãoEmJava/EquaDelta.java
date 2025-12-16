import java.util.Scanner;

public class EquaDelta {
    public static void main(String[] args) {
        Scanner  a = new Scanner(System.in);
        System.out.println("diginte um valor;");
         int va = a.nextInt();

        Scanner b = new Scanner(System.in);
        
        System.out.println("diginte outro valor;");
         int vb = b.nextInt();
        Scanner c = new Scanner(System.in);

        System.out.println("diginte outro valor;");
         int vc= c.nextInt();



        double d = Math.pow(vb,2) - 4 * va *vc;
        System.out.println(String.format("Delta = %.2f", d));

        if( d<0){
            System.out.println("Não exite raiz;");
        }else{
            System.out.println("Existem raizes;");
        }
    }

}
