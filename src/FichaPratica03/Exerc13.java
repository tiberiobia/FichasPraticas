package FichaPratica03;
//Faça um algoritmo que leia dois números inteiros, representando os valores início e fim de um intervalo e imprima
//os múltiplos de 5 entre eles.

import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Digite o numero de inicio: ");
        num1= input.nextInt();

        System.out.print("Digite o numero de fim: ");
        num2= input.nextInt();

        for (int i=num1;i<=num2;i++){
            if (i%5==0){
                System.out.println(i);
            }
        }

    }
}
