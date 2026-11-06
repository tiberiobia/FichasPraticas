package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        int tamanho=10;
        int [] vetor=new int[tamanho];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Introduza o " + (i + 1) + "º número: ");
            vetor[i] = input.nextInt();
        }

        for (int i= vetor.length-1;i>=0;i--){
            System.out.println(vetor[i]);
        }
    }
}
