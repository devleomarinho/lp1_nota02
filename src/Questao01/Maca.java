package Questao01;

public class Maca {
        double valorTotal;
        private int quantidade;

        public void setQuantidade(int quantidade){
                this.quantidade = quantidade;
        }
        public int getQuantidade(){
                return quantidade;
        }
        public void calcularTotal(){
                if (quantidade < 12){
                        valorTotal = quantidade * 1.30;
                }else{
                        valorTotal = quantidade * 1.00;
                }
                System.out.println("O valor total foi: R$" + valorTotal);
        }
}
