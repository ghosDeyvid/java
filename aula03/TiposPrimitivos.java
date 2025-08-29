package aula03;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite sua Nota: ");
        float nota = teclado.nextFloat();
        System.out.format("A Nota de %s e %.2f: ", nome,nota ); 
    }
}
