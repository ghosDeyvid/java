public class ex01 {
    public static void main(String[] args) {
        int c=0;
        while (c<10) {
           
            c++;
                if( c==6 || c==1 || c==9){
                    continue;
                    
                }
                if(c==7){
                    break;
                }
                 System.out.println("cabalhota" +c);
        }
    }
}
