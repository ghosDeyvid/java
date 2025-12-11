import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        /*Scanner teclado = new Scanner(System.in);
        float n1 = teclado.nextFloat();
        float n2 = teclado.nextFloat();
        float media = ( n1 + n2) / 2;
        System.out.println("A sua media foi: " + media);
        if (media >= 9){
            System.out.println("Parabens!");
            
        }*/
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o ano do seu nascimento: ");
        int  nasc = t.nextInt();
        int idade = 2025 - nasc;
        System.out.println("Voce tem " + idade + " anos");
        if(idade>=18){
            System.out.println("Voce e maior de idade");
        }else{
            System.out.println("Voce e menor de idade");
        }

    }

    
}
