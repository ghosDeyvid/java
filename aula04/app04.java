package aula04;

import java.util.Scanner;

public class app04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nome do aluno:");
        String nome = teclado.nextLine();

         System.out.println("Sua idade é:");
        int idade = teclado.nextInt();

        System.out.println("Digite o salário:");
        float salario = teclado.nextFloat();

        System.out.printf("Nome: %s\nSua idade é: %d\nSeu salário é: %.1f",nome, idade, salario);
    }
    
}
