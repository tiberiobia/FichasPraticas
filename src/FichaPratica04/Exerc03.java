package FichaPratica04;
//Implemente um programa que solicite um número ao utilizador, seguidamente, apresente todos os seus
//        divisores.

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero: ");
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println("O numero " + num + " é divisivel por: " + i);
            }
        }
    }
}
