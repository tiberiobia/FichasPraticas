package FichaPratica02;
//Escreva um programa que leia 3 números, seguidamente deve colocar os números no ecrã por ordem crescente.

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Digite o numero 1: ");
        num1 = input.nextInt();
        System.out.print("Digite o numero 2: ");
        num2 = input.nextInt();
        System.out.print("Digite o numero 3: ");
        num3 = input.nextInt();

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

    }
}
