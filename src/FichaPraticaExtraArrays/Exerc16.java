package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];


        System.out.println("Introduza os elementos da matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }


        int maior = matriz[0][0];
        int menor = matriz[0][0];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }


        System.out.println("O maior elemento é: " + maior);
        System.out.println("O menor elemento é: " + menor);

        sc.close();
    }
}
