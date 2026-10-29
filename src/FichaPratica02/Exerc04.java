package FichaPratica02;
//Na Fórmula 1, os pontos no final de cada corrida são atribuídos da seguinte forma:
//        • 1.º lugar: 10 pontos
//• 2.º lugar: 8 pontos
//• 3.º lugar: 6 pontos
//• 4.º lugar: 5 pontos
//• 5.º lugar: 4 pontos
//• 6.º lugar: 3 pontos
//• 7.º lugar: 2 pontos
//• 8.º lugar: 1 ponto.
//Escreva um programa que leia o lugar em que o piloto terminou e escreva quantos pontos ganhou.
import java.util.Scanner;
public class Exerc04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int posicao, pontos;
        System.out.print("Introduza o seu lugar na corrida: ");
        posicao=input.nextInt();
        if (posicao == 1) {
            pontos = 10;
        } else if (posicao == 2) {
            pontos = 8;
        } else if (posicao == 3) {
            pontos = 6;
        } else if (posicao == 4) {
            pontos = 5;
        } else if (posicao == 5) {
            pontos = 4;
        } else if (posicao == 6) {
            pontos = 3;
        } else if (posicao == 7) {
            pontos = 2;
        } else if (posicao == 8) {
            pontos = 1;
        } else {
            pontos = 0; // Fora das 8 primeiras posições
        }
        System.out.println("Ganhou " +pontos+ " pontos.");

    }
}
