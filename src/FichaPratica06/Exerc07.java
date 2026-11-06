package FichaPratica06;
//Escreva um programa para desenhar um quadrado no ecrã. Esse quadrado deverá ser desenhado por uma
//função para a qual são passados três argumentos: caracter a utilizar, número de linhas e número de colunas.

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print(" Introduza um caracter: ");
        char caracter=input.next().charAt(0);

        System.out.print(" Introduza número de linhas: ");
        int linhas= input.nextInt();

        System.out.print(" Introduza número de colunas: ");
        int colunas= input.nextInt();

        desenharQuadrado(caracter,linhas,colunas);




    }
    public static void desenharQuadrado(char caracter,int linhas, int colunas){
        for(int i=0;i<linhas;i++){
            for (int j=0;j<colunas;j++){
                if(i==0 || i==linhas-1 || j==0 || j==colunas-1){
                    System.out.print(caracter);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
