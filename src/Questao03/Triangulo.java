package Questao03;

public class Triangulo {

    private int lado1, lado2, lado3;

    public void setLado1(int lado1){
        this.lado1 = lado1;
    }
    public void setLado2(int lado2){
        this.lado2 = lado2;
    }
    public void setLado3(int lado3){
        this.lado3 = lado3;
    }

    public int getLado1(){
        return lado1;
    }
    public int getLado2(){
        return lado2;
    }
    public int getLado3(){
        return lado3;
    }

    public void testarTriangulo(){

        if(lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2){
            System.out.println("É possível formar um triângulo com essas medidas!");
            if(lado1 == lado2 && lado2 == lado3){
                System.out.println("Eles formam um triângulo equilátero!");
            }else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Eles formam um triângulo  isósceles.");
            }else{
                System.out.println("Eles formam um triângulo escaleno");
            }
        }else{
            System.out.println("Não é possivel formar um triângulo com essas medidas!");
        }
    }
}
