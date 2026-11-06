package FichaPraticaExtraArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int tamanho = 12;
        int[] vetor = new int[tamanho];


        for (int i = 0; i < tamanho; i++) {
            System.out.print("Introduza o " + (i + 1) + "º elemento: ");
            vetor[i] = input.nextInt();
        }
        int[] semDuplicadas = Arrays.stream(vetor)
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(semDuplicadas));


    }
}
