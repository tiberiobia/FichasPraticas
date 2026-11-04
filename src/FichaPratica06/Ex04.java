package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex03.*;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, opcao;
        System.out.println("Insira um número: ");
        num = input.nextInt();
        do {
            System.out.println("\n===== ANÁLISE DE UM NÚMERO =====");
            System.out.println("1. Par ou Ímpar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Não Primo");
            System.out.println("4. Perfeito ou Não Perfeito");
            System.out.println("5. Triangular ou Não Triangular");
            System.out.println("6. Trocar de Número");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    if (par(num)) {
                        System.out.println("O numero é par");
                    } else {
                        System.out.println("O numero não é par");
                    }
                    break;

                case 2:
                    if (positivo(num)) {
                        System.out.println("O numero é positivo");
                    } else {
                        System.out.println("O numero não é positivo");
                    }
                    break;

                case 3:
                    if (primo(num)) {
                        System.out.println("O numero é primo");
                    } else {
                        System.out.println("O numero não é primo");
                    }
                    break;
                case 4:
                    if (perfeito(num)) {
                        System.out.println("O numero é perfeito");
                    } else {
                        System.out.println("O numero não é perfeito");
                    }
                    break;

                case 5:
                    if (triangular(num)) {
                        System.out.println("O numero é perfeito");
                    } else {
                        System.out.println("O numero não é perfeito");
                    }
                    break;
                case 6:
                    System.out.println("Introduza um novo numero");
                    num = input.nextInt();
                    break;
                default:
                    System.out.println("Opção invalida");


            }

        } while (num != 0);


    }
}
