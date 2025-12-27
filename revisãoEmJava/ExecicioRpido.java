import javax.swing.JOptionPane;

public class ExecicioRpido {
    public static void main(String[] args) {
       /*  int n ,s=0,conta=0,par=0, impar=0, mais_cem=0;
        float media;
        do{
            n = Integer.parseInt
            (JOptionPane.showInputDialog(null,
            "<html>Informe um numero:<br><em>(Valor 0 para sair)</em></html>"));
            s+= n;
            conta++;
            if(n % 2 ==0){
                par++;
            }else{
                impar++;
            }
            if(n >=100){
                mais_cem++;
            }
        }while(n !=0);
        media = s / conta;
        JOptionPane.showMessageDialog(null,"<html> Resultados <br>"+"Total de numeros: " + conta + "<br>" +
        "Total de numeros pares: " + par + "<br>" +
        "Total de numeros impares: " + impar + "<br>" +
        "Total de numeros maiores que 100: " + mais_cem + "<br>" +
        "Soma dos valores: " + s + "<br>" +"media dos valores "+ media +"</html>");*/

        int n, s=0, conta =0, par = 0, impar =0, mais_cem =0;
        float media;
        do{
            n = Integer.parseInt
            (JOptionPane.showInputDialog(null,
            "<html> informe um numeros:<br><em>(Valor 0 para sair )</em></html."));
        s=+n;
        conta++;
        if( n % 2 ==0){
            par++;
        }else{
            impar++;
        }
        if( n >=100){
            mais_cem++;
        }
    }while(n !=0);
    media = s / conta;

    JOptionPane.showMessageDialog(null,"<html> Resultados <br>"+ "total de numeros:" + conta +"<br>"  
    + "total de numeros pares " + par + "<br>" + "total de numeros impares: " + impar +"<br>" + 
"total de numeros maiores que 100: " + mais_cem + "<br>"+
 "media dos valores: " + media +
"<br>" +"</html>"  );
    }   
}
