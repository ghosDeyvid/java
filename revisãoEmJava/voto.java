public class voto {
    public static int idade(int a){
        if (a<16){
            System.out.println("você não tem idade para votar");
        }else if(a>=16 && a<18 || a>70){
            System.out.println("você tem voto opcional");
        }else{
            System.out.println("você tem voto obrigatório");
        }
        return a;
    }
}
