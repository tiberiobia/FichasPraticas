package FichaPratica02;
//Escreva um programa que lê um valor em euros (múltiplo de 5) e calcula qual o menor número possível de notas
//de 200, 100, 50, 20, 10, 5 em que o valor pode ser decomposto. Escrever o valor lido e a relação de notas
//necessárias.

import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int euros, notas200, notas100, notas50, notas20, notas10, notas5;


        System.out.print("Digite o valor em euros:");
        euros = input.nextInt();

        if (euros % 5 == 0) {
            System.out.println("valor inserido de " + euros + "é valido");
            int valorRestante = euros;

            notas200 = valorRestante / 200;
            valorRestante = valorRestante % 200;

            notas100 = valorRestante / 100;
            valorRestante = valorRestante % 100;

            notas50 = valorRestante / 50;
            valorRestante = valorRestante % 50;

            notas20 = valorRestante / 20;
            valorRestante = valorRestante % 20;

            notas10 = valorRestante / 10;
            valorRestante = valorRestante % 10;

            notas5 = valorRestante / 5;

            System.out.println("Notas de 200: " + notas200);
            System.out.println("Notas de 100: " + notas100);
            System.out.println("Notas de 50: " + notas50);
            System.out.println("Notas de 20: " + notas20);
            System.out.println("Notas de 10: " + notas10);
            System.out.println("Notas de 5: " + notas5);


        } else {
            System.out.println("valor inserido não é valido!");
        }

    }
}
