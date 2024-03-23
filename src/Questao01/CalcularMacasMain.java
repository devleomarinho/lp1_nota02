package Questao01;

import java.util.Scanner;
public class CalcularMacasMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Maca m1 = new Maca();

        System.out.print("Digite a quantidade de maçãs compradas: ");
        m1.setQuantidade(input.nextInt());
        System.out.println("Foram compradas " + m1.getQuantidade() + " maçãs");
        m1.calcularTotal();
    }
}
