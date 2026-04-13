public class dia {
    static byte dias ( byte d){
        switch(d){
            case 1:
            System.out.println("Domingo");
            break;
            case 2: 
            System.out.println("Segunda-feira");
            break;
            case 3:
            System.out.println("Terça-feira");
            break;
            case 4:
            System.out.println("Quarta-feira");
            break;
            case 5:
            System.out.println("Quinta-feira");
            break;
            case 6:
            System.out.println("Sexta-feira"); 
            case 7:
            System.out.println("Sábado");
            break;
            
            
        }
        return d;
    } 
    static String diaUtil(byte d){
        if(d==1 || d==7){
            
            return "Não é dia útil";
        }else{
            
            return "É dia útil";
        }
        
    }
}
