package FichaPratica02;
//Escreva um programa que leia 3 números, seguidamente deve perguntar ao utilizador se quer ordem crescente
//'C' ou decrescente 'D', e deve colocar os números no ecrã por ordem decrescente ou crescente de acordo com a
//escolha.

import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        String opcao;
        System.out.print("Digite o numero 1: ");
        num1 = input.nextInt();
        System.out.print("Digite o numero 2: ");
        num2 = input.nextInt();
        System.out.print("Digite o numero 3: ");
        num3 = input.nextInt();
        System.out.println("menu ");
        System.out.println("D - para ordenar em ordem decrescente ");
        System.out.println("C - para ordenar em ordem crescente ");
        System.out.println("escolha uma opção: ");
        opcao = input.next();
        switch (opcao) {
            case "C":
                if (num1 <= num2 && num1 <= num3) {//numero um é o menor
                    if (num2 <= num3) {
                        System.out.println("Ordem crescente: " + num1 + "," + num2 + "," + num3);
                    } else {
                        System.out.println("Ordem crescente: " + num1 + "," + num3 + "," + num2);
                    }
                } else if (num2 <= num1 && num2 <= num3) {
                    if (num1 <= num3) {
                        System.out.println("Ordem crescente: " + num2 + "," + num1 + "," + num3);
                    } else {
                        System.out.println("Ordem crescente: " + num2 + "," + num3 + "," + num1);
                    }

                } else {
                    if (num1 <= num2) {
                        System.out.println("Ordem crescente: " + num3 + "," + num1 + "," + num2);
                    } else {
                        System.out.println("Ordem crescente: " + num3 + "," + num2 + "," + num1);
                    }
                }
                break;
            case "D":
                if (num1 >= num2 && num1 >= num3) {//numero um é o menor
                    if (num2 >= num3) {
                        System.out.println("Ordem crescente: " + num1 + "," + num2 + "," + num3);
                    } else {
                        System.out.println("Ordem crescente: " + num1 + "," + num3 + "," + num2);
                    }
                } else if (num2 >= num1 && num2 >= num3) {
                    if (num1 >= num3) {
                        System.out.println("Ordem crescente: " + num2 + "," + num1 + "," + num3);
                    } else {
                        System.out.println("Ordem crescente: " + num2 + "," + num3 + "," + num1);
                    }

                } else {
                    if (num1 >= num2) {
                        System.out.println("Ordem crescente: " + num3 + "," + num1 + "," + num2);
                    } else {
                        System.out.println("Ordem crescente: " + num3 + "," + num2 + "," + num1);
                    }
                }
                break;

            default:
                System.out.println("Opção invalida");
        }


    }
}
