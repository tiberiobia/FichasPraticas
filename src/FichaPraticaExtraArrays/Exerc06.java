package FichaPraticaExtraArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos quer inserir no Array: ");
        int tamanho= input.nextInt();
        int [] vetor=new int[tamanho];


        for (int i = 0; i < tamanho; i++) {
            System.out.print("Introduza o " + (i + 1) + "º elemento: ");
            vetor[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(vetor));
    }
}
