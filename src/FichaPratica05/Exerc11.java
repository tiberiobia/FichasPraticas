package FichaPratica05;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[][] matriz=new int[3][3];


        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("digite um numero para posição ["+i+"]["+j+"]: ");
                matriz[i][j]= input.nextInt();

            }
        }
        int maior=matriz[0][0];
        int menor=matriz[0][0];


        System.out.println("\nMatriz:");
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+"  ");
                if(matriz[i][j]>maior){
                    maior=matriz[i][j];
                }
                if(matriz[i][j]<menor){
                    menor=matriz[i][j];
                }

            }
            System.out.println();
        }
        System.out.println("O maior numero da matriz é : "+ maior);
        System.out.println("O menor numero da matriz é : "+ menor);

    }
}
