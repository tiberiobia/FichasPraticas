package FichaPratica03;
//Faça um programa que imprima os números inteiros de 1 a 100 inclusive, e no final imprima também o valor do
//seu somatório. (Não necessita de Scanner ou input do utilizador)
public class Exerc07 {
    public static void main(String[] args) {
        int soma=0;
        for (int i=1;i<=100;i++){
            System.out.println(i);
            soma+=i;
        }
        System.out.println("Somatório: "+ soma);

    }
}
