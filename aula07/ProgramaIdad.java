package aula07;

import java.util.Scanner;

public class ProgramaIdad {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Em que ano vc naceu:");
        int nasc =t.nextInt();
        int idade = 2025 - nasc;
        System.out.println("Voçê tem " + idade + " anos");
        if(idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
    
}
