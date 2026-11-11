package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matriz3 = new int[3][3];


        System.out.println("Introduza os elementos da primeira matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = sc.nextInt();
            }
        }


        System.out.println("Introduza os elementos da segunda matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz2[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }


        System.out.println("\nMatriz resultante da soma:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz3[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
