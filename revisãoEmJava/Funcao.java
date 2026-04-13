import java.util.Stack;

public class Funcao {
    /*static void soma(int a, int b){
        int s = a+b;
        System.out.println("A soma e:"+ s);
    }
    public static void main(String[] args) {
      soma(7,7);
    }
    
} */
static int soma (int a, int b){
   int s = a + b;
   return s;
}
public static void main(String[] args) {
 int sm = soma (5,5);   
 System.out.println("A soma e: " + sm);
}
}