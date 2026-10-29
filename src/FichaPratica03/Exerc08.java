package FichaPratica03;
//Faça um programa que leia um número inteiro e imprima os 5 anteriores e os 5 seguintes.
//        Por exemplo: Leu 15, deve imprimir: 10 11 12 13 14 16 17 18 19 20
import java.util.Scanner;
public class Exerc08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Digite um numero: ");
        num= input.nextInt();
        for (int i=num-5;i<num;i++){
            System.out.println(i);
        }
        for (int j=num+1;j<=num+5;j++){
            System.out.println(j);
        }
    }
}
