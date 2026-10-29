package FichaPratica02;
//Leia dois números inteiros e escreva na consola o maior deles.

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Indroduza o primeiro numero: ");
        num1 = input.nextInt();
        System.out.print("Indroduza o segundo numero: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("O maior numero é o primeiro numero: " + num1);

        } else if (num1 < num2) {
            System.out.println("O maior numero é o segundo numero: " + num2);

        } else {
            System.out.println("Os dois numeros são iguais");
        }


    }

}
