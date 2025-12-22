import java.util.Scanner;

public class Contador02 {
    public static void main(String[] args) {
        /*Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor final do contador: ");
        int valorFinal = teclado.nextInt();
        
        int c = 0;
        while (c < valorFinal){
            c++;
            System.out.println("Cabanhota" + c);
        }
        teclado.close();*/
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor inicial do contador: ");
        int valor = teclado.nextInt();
        int c= 0;
        while ( c < valor){
            c++;
            System.out.println(" Deus e fiel " + c);
        }
 }
}