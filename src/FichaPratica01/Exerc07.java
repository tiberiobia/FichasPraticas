package FichaPratica01;
//Escreva um programa que requisite ao utilizador o preço de 3 produtos adquiridos. Apresente o valor a pagar,
//considerando que deverá ter um desconto de 10% sobre o total dos produtos.

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double prod1, prod2, prod3, valorFinal;

        System.out.print("Introduza o valor do primeiro produto: ");
        prod1 = input.nextDouble();

        System.out.print("Introduza o valor do segundo produto: ");
        prod2 = input.nextDouble();

        System.out.print("Introduza o valor do terceiro produto: ");
        prod3 = input.nextDouble();

        valorFinal = (prod1 + prod2 + prod3) * 0.9;
        System.out.println("O valor final a pagar ja com desconto é de: " + valorFinal);

    }
}
