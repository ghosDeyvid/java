import java.lang.reflect.Array;
import java.util.Arrays;

public class Vetor01 {
    public static void main(String[] args) {
        int n[] = {3,5,1,8,4};
        Arrays.sort(n);
        for(int c= 0; c<=n.length-1;c++){
            System.out.println("Na posição  " + c + " temos o valor " + n[c]);

        }

    }
    
}
