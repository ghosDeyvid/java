import java.util.Scanner;

public class ProgramaPernas {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o número de pernas: ");
        int perna= tec.nextInt();
        String tipo;
        System.out.println("isso e uma(a)");
        switch(perna){
            case 1:
                tipo = "saci";
                break;
                case 2:
                tipo = "Bipede";
                break;
                case 3:
                tipo = "Trípede";
                break;
                case 4:
                tipo = "Quadrípede";
                break;
                case 6:
                tipo = "Aranha";
                break;
                default:
                tipo = "ET";
                
        }
        System.out.println(tipo);
    }
    
}
