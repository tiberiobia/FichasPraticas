package FichaPratica02;
//Crie um programa que mostre o menor de três números inteiros lidos.

import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, menor;
        System.out.print("Digite o numero 1:  ");
        num1 = input.nextInt();

        System.out.print("Digite o numero 2:  ");
        num2 = input.nextInt();

        System.out.print("Digite o numero 3:  ");
        num3 = input.nextInt();
        menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("O menor numero é: " + menor);


    }
}
