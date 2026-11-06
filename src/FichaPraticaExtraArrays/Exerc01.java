package FichaPraticaExtraArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        int tamanho=14;
        int[] vetor= new int[14];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Introduza o " + (i + 1) + "º número: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("Números pela ordem de inserção:");
        System.out.println(Arrays.toString(vetor));

        input.close();
    }
}
