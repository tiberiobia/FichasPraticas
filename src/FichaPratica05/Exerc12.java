package FichaPratica05;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] array1=new int[10];
        int[] array2=new int[10];

        int[][] matriz= new int[10][2];

        System.out.println("Primeiro Array");
        for (int i=0;i< array1.length;i++){
            System.out.print("digite um numero para posição [" + i + "]: " );
            array1[i]= input.nextInt();

        }
        System.out.println();
        System.out.println("Segundo Array");
        for (int i=0;i< array2.length;i++){
            System.out.print("digite um numero para posição [" + i + "]: " );
            array2[i]= input.nextInt();

        }

        for (int i=0;i<10;i++){
            matriz[i][0]=array1[i];
            matriz[i][1]=array2[i];

        }

        System.out.println("Matriz: ");
        for (int i=0;i<10;i++){
            for (int j=0;j<2;j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
