public class VetorEx01 {
    public static void main(String[] args) {
        String mes []= {"jan", "Fev", "Mar", "Abr", "Mai","Jun", "Jul", "Ago", "Set", "Out" , "Nov","Des"};
        int tot[] = {  31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } ;
        for(int i=0; i<mes.length; i++ ){
            System.out.println("Mes de "+ mes[i] + " tem " + tot[i] + " dias ao todo ");

        }
    }
    
}
