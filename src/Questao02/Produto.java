package Questao02;

public class Produto {

    private int qtMax, qtMin, qtAtual, qtMedia;

    public void setQtAtual(int qtAtual){
        this.qtAtual = qtAtual;
    }
    public void setQtMax(int qtMax){
        this.qtMax = qtMax;
    }
    public void setQtMin(int qtMin){
        this.qtMin = qtMin;
    }
    public int getQtAtual(){
        return qtAtual;
    }
    public int getQtMax(){
        return qtMax;
    }
    public int getQtMin(){
        return qtMin;
    }

    public void calcularMedia(){
        qtMedia = (qtMax + qtMin) / 2;
       if(qtAtual >= qtMedia){
           System.out.println("A quantidade atual do produto é de " + qtAtual +" unidades.\nIsso está na média de " + qtMedia + "unidades. Não efetuar compra!");
       }else{
           System.out.println("A quantidade atual do produto é de " + qtAtual + " unidades.\nIsso está abaixo da média de " + qtMedia+ " unidades.\nEfetuar compra!");
       }
    }
}
