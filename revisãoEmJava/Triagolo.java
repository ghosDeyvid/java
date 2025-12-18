import java.util.Scanner;

public class Triagolo {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        System.out.println("Diginte numero do A:");
        int A = a.nextInt();
        System.out.println("diginte numero do B:");
        int B = b.nextInt();
        System.out.println("diginte Nimero do C;");
        int C = c.nextInt();
        if(A + B > C && A + C > B && B + C > A){
        System.out.println("Esses lados formam um triangulo");
        }else if( A == B && B == C){
            System.out.println("Triangulo Equilatero");
        }else if ( A != B && B != C && A != C){
            System.out.println("Triangulo Escaleno");
        }else{
            System.out.println("Triangulo Isosceles");
        }
    }
    
}
