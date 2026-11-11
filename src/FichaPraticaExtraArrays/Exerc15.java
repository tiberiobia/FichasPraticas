package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][2];
        int soma = 0;
        double media;


        System.out.println("Introduza os elementos da matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();

                soma = soma + matriz[i][j];
            }
        }


        media = (double) soma / 6;


        System.out.println("A soma dos elementos é: " + soma);
        System.out.println("A média dos elementos é: " + media);

        sc.close();
    }
}
