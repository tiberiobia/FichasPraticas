package FichaPraticaExtraArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int tamanho = 10;
        int[] vetor = new int[tamanho];


        for (int i = 0; i < tamanho; i++) {
            System.out.print("Introduza o " + (i + 1) + "º elemento: ");
            vetor[i] = input.nextInt();
        }
        Arrays.sort(vetor);
        System.out.println(Arrays.toString(vetor));


    }
}
