package Questao02;

import java.util.Scanner;
public class MediaProdutosMain {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Produto p1 = new Produto();

        System.out.print("Digite a quantidade atual do produto em estoque: ");
        p1.setQtAtual(input.nextInt());
        System.out.print("Digite a quantidade máxima do produto: ");
        p1.setQtMax(input.nextInt());
        System.out.print("Digite a quantidade mínima do produto: ");
        p1.setQtMin(input.nextInt());
        p1.calcularMedia();

    }

}
