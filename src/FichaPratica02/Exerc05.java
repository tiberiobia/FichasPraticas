package FichaPratica02;
//Escreva um programa que leia dois valores numéricos e apresente o menor e depois o maior.

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, maior, menor;
        System.out.print("Introduza o primeiro numero: ");
        num1 = input.nextDouble();
        System.out.print("Introduza o segundo numero: ");
        num2 = input.nextDouble();
        if (num1 > num2) {
            maior = num1;
            menor = num2;
        } else {
            maior = num2;
            menor = num1;
        }
        System.out.println("o maior numero é o numero " + menor + " e o menor é " + maior);

    }
}
