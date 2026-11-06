package FichaPraticaExtraArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos quer inserir no Array: ");
        int tamanho = input.nextInt();
        int[] vetorOriginal = new int[tamanho];


        for (int i = 0; i < tamanho; i++) {
            System.out.print("Introduza o " + (i + 1) + "º elemento: ");
            vetorOriginal[i] = input.nextInt();
        }
        System.out.print("Qual valor queres adicionar: ");
        int adicionar = input.nextInt();

        System.out.print("Em qual posição queres adicionar: ");
        int posicao = input.nextInt();
        int[] novoVetor = new int[tamanho + 1];


        if (posicao < 0 || posicao > tamanho) {
            System.out.println("Posição inválida!");
            return;
        }


        for (int i = 0; i < posicao; i++) {
            novoVetor[i] = vetorOriginal[i];
        }

        novoVetor[posicao] = adicionar;

        for (int i = posicao; i < tamanho; i++) {
            novoVetor[i + 1] = vetorOriginal[i];
        }

        System.out.println("Novo vetor: " + Arrays.toString(novoVetor));

    }
}
