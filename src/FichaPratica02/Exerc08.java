package FichaPratica02;
//Escreva um programa que leia três notas (0-20 valores) de um aluno, calcule a sua média final ponderada, e diga
//se está aprovado ou não (mais de 9.5). Ponderações: Nota 1: 25%; Nota 2: 35%; Nota 3: 40%.

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, mediaPond;
        System.out.print("Digite a nota 1: ");
        nota1 = input.nextDouble();

        System.out.print("Digite a nota 2: ");
        nota2 = input.nextDouble();

        System.out.print("Digite a nota 3: ");
        nota3 = input.nextDouble();
        mediaPond = (nota1 * 0.25) + (nota2 * 0.35) + (nota3 * 0.40);
        if (mediaPond > 9.5) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
