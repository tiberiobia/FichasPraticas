package FichaPratica04;

//Crie um jogo, que peça ao jogador 1 um valor entre 0 e 100. De seguida, deverá permitir ao jogador 2 tentar
//acertar no valor inserido pelo jogador 1. A cada iteração, enquanto o valor não for descoberto, deverá informar
//se o valor introduzido pelo jogador 2 é inferior ou superior ao valor inserido pelo jogador 1. No final (quando o
//valor é descoberto) deverá apresentar o número de tentativas que o jogador 2 necessitou para acertar.

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, tentativa, totalTentativas = 0;

        System.out.println("Jogador 1");
        System.out.print("Digite um numero de 0 a 100:");
        num = input.nextInt();

        do {
            System.out.println("Jogador 2");
            System.out.print("digite o numero do jogador 1: ");
            tentativa = input.nextInt();
            if (tentativa == num) {
                System.out.println("Acertou!!");
                totalTentativas++;
            } else {
                System.out.println("Errou!");
                if (tentativa < num) {
                    System.out.println("O numero do jogador 1 é maior q o numero digitado");
                    totalTentativas++;
                } else {
                    System.out.println("O numero do jogador 1 é menor q o numero digitado");
                    totalTentativas++;
                }
            }
        } while (tentativa != num);
        System.out.println("Total de tentativas: " + totalTentativas);
    }
}

