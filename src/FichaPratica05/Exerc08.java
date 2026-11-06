package FichaPratica05;
//Implemente um programa que permita adicionar 9 números inteiros (ler input do utilizador) a uma matriz 3x3

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[][] matriz=new int[3][3];

        for (int i=0;i< matriz.length;i++){
            for(int j=0;j< matriz[i].length;j++){
                System.out.print("digite um numero para posição ["+i+"]["+j+"]: ");
                matriz[i][j]= input.nextInt();

            }
        }
        System.out.println("\nResultado:");
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
