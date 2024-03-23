package Questao03;

import java.util.Scanner;
public class VerificaTrianguloMain {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String repetir;

        do {
            Triangulo t1 = new Triangulo();

            System.out.print("Digite o valor do primeiro lado: ");
            t1.setLado1(input.nextInt());
            System.out.print("Digite o valor do segundo lado: ");
            t1.setLado2(input.nextInt());
            System.out.print("Digite o valor do terceiro lado: ");
            t1.setLado3(input.nextInt());

            System.out.println("Verificando triângulo... \nLado A: " + t1.getLado1() + "\nLado B: " + t1.getLado2() + "\nLado C: " + t1.getLado3() + "\n...............");
            t1.testarTriangulo();
            System.out.println("Deseja verificar outras medidas? (S ou N): ");
            repetir = input.next();

        }while (repetir.equalsIgnoreCase("S"));
    }
}
