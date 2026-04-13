

public class media {
        static double media01( double n1, double n2 , double n3, double n4){
        double media01 = ( n1+n2+ n3 + n4)/4;
        if(media01 <6 && media01>=5){
            System.out.println("Recuperação");
        }else if( media01 < 5 ){
            System.out.println("Reprovado");
        }else if ( media01 >= 6){
            System.out.println("Aprovado");
        }
        return media01;
        } 

}
