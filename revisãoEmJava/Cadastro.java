import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        int opcao = 0;

        while (opcao != 3) {

            System.out.println("\n1 - Cadastrar nome");
            System.out.println("2 - Listar nomes");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            if (opcao == 1) {
                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();
                nomes.add(nome);
                System.out.println("Nome cadastrado com sucesso!");

            } else if (opcao == 2) {

                if (nomes.isEmpty()) {
                    System.out.println("Nenhum nome cadastrado.");
                } else {
                    System.out.println("Lista de nomes:");
                    for (String nome : nomes) {
                        System.out.println(nome);
                    }
                }

            } else if (opcao == 3) {
                System.out.println("Programa encerrado.");

            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
    }

