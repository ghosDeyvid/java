import java.lang.reflect.Array;
import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {
        int v[] = new int[20];
        Arrays.fill( v, 0);
        for(int valor: v){
            System.out.println(valor + "");
        }
    }
}
