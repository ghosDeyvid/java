import java.util.Scanner;

public class ExMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua nota:");
        float n1 = teclado.nextFloat();
        System.out.println("Digite sua outra Nota");
        float n2 = teclado.nextFloat();
        float s = (n1 + n2)/ 2;
        System.out.println("Sua media foi: " + s);
        if( s > 6 ){
            System.out.println("Voçê foi APROVADO");
        }else{
            System.out.println("Você foi REPROVADO");
        }
    }
    
}
