import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
       /*Scanner t = new Scanner(System.in);
       System.out.println("Ano de nascimento: ");
        int nasc = t.nextInt();
        int idade = 2025 - nasc;
        System.out.println("Você tem " + idade + " anos");
       if( idade < 16 ){
         System.out.println("Você não pode votar");
       } else if (idade >=18 && idade <70){
        System.out.println("Você é eleitor obrigatório");
       }else{
        System.out.println("Você é eleitor facultativo");
       } */
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o ano do seu nascimento: ");
        int  n = t.nextInt();
        int idade = 2025 - n;
        System.out.println("Voce tem " + idade + " anos");
        if(idade <16){
            System.out.println("Voce nao pode votar");
    }else if( idade >=18 && idade <70){
       System.out.println("Voce e eleitor obrigatorio"); 
    }else{
        System.out.println("Voce e eleitor facultativo");
    }
 }
}