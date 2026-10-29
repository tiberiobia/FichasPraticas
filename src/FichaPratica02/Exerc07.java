package FichaPratica02;
//Escreva um programa que leia um número, depois apresente se é par ou ímpar.

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("digite um numero: ");
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("O numero " + num + " é par");
        } else {
            System.out.println("O numero " + num + " é impar");
        }
    }
}
