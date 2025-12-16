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
       
      Scanner n1 = new Scanner(System.in);
      System.out.println(" Digite nota1: ");
      float nota = n1.nextFloat();
        
      Scanner n2 = new Scanner(System.in);
      System.out.println(" Digite nota2: ");
      Float nota2 = n2.nextFloat();
    float media = ( nota + nota2) / 2;
    System.out.println("Sua média é " + media);
    if ( media >= 7.0){
      System.out.println("Aprovado");
    } else if ( media >=5.0 && media < 7.0){
      System.out.println("Recuperação");
    } else {
      System.out.println("Reprovado");
    }
    }


}
