package FichaPraticaExtraArrays;
//Escreve um programa que permita preencher um array de tamanho 12 e, seguidamente, encontre todos os
//valores que estão duplicados no Array.

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tamanho=12;
        int [] vetor=new int[tamanho];


        for (int i = 0; i < tamanho; i++) {
            System.out.print("Introduza o " + (i + 1) + "º número: ");
            vetor[i] = input.nextInt();
        }



        for (int i = 0; i < vetor.length; i++) {
            boolean isDuplicado = false;


            boolean jaVerificado = false;
            for (int k = 0; k < i; k++) {
                if (vetor[k] == vetor[i]) {
                    jaVerificado = true;
                    break;
                }
            }


            if (!jaVerificado) {
                for (int j = i + 1; j < vetor.length; j++) {
                    if (vetor[i] == vetor[j]) {
                        isDuplicado = true;
                        break;
                    }
                }
            }


            if (isDuplicado) {
                System.out.println(vetor[i]);
            }
        }
    }
}
