package aula06;

public class ComparaçãoString {
    
    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        res = (nome1 .equals(nome3)) ? "igual" : "diferente";
        System.out.println(res);
    }
}
