package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Exerc18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantas linhas quer na matriz? ");
        int linhas = sc.nextInt();

        System.out.print("Quantas colunas quer na matriz? ");
        int colunas = sc.nextInt();


        int[][] matriz = new int[linhas][colunas];

        System.out.println("Introduza os elementos da matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }


        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }


        System.out.println("\nMatriz original:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("\nMatriz transposta:");

        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(transposta[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
