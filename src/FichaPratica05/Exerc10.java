package FichaPratica05;
//Faça um programa que preencha cada posição de uma matriz 3x5 com valores inteiros introduzidos pelo
//utilizador. Deverá depois ler um outro valor do utilizador e indicar quantos vezes existe na matriz.

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[][] matriz= new int[3][5];
        int num, vezes=0;
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("digite um numero para posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }
        System.out.print("digite o numero que quer consultar: ");
        num= input.nextInt();

        for (int i=0;i<3;i++) {
            for (int j = 0; j < 5; j++) {
                if(matriz[i][j]==num){
                    vezes++;
                }
            }
        }
        System.out.print("A quantidade de vezes que o numero "+num+" aparece é: "+vezes);
    }
}
