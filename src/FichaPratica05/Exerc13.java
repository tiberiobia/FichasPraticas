package FichaPratica05;

import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[][] matriz= new int[4][4];
        int soma=0;

        for (int i=0;i<4;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("digite um numero para posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
                if (i==j){
                    soma+= matriz[i][j];
                }
            }
        }

        System.out.println("Matriz: ");
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("A soma da diagona é: "+soma);
    }
}
