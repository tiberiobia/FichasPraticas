package FichaPratica03;
//Faça um programa que leia um número inteiro e imprima os números pares entre 2 e o número lido inclusive.
//        Suponha que o número lido da entrada será maior que 2.
import java.util.Scanner;


public class Exerc10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Digite um numero: ");
        num= input.nextInt();
        if (num>2){
            for (int i=2;i<=num;i++){
                if (i%2==0){
                    System.out.println(i);
                }
            }
        }
    }
}
