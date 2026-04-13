public class PcGamer {
    public String placamae;
    public String processador;
    public int memoria;
    public String placaDeVideo;
    public int armazenamento;
    public boolean ligando;

    void statos(){
        System.out.println("Placa mae "+ this.placamae);
        System.out.println("Processador "+ this.processador);
        System.out.println("Memoria "+ this.memoria);
        System.out.println("Placa de video "+ this.placaDeVideo);
        System.out.println("Armazenamento "+ this.armazenamento);
    }
    public void pcligando(){
        if( this.ligando == true){
            System.out.println("PC ligado");
        }else{
            System.out.println("PC desligado");
        }
    }
    public  void linado(){
        this.ligando = true;
    }
    public void deligando(){
        this.ligando = false;
    }
    }
    


