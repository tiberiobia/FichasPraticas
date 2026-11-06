package FichaPraticaExtraArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos quer inserir no Array: ");
        int tamanho= input.nextInt();
        int [] vetorOriginal=new int[tamanho];


        for (int i = 0; i < tamanho; i++) {
            System.out.print("Introduza o " + (i + 1) + "º elemento: ");
            vetorOriginal[i] = input.nextInt();
        }
        System.out.print("Qual valor queres remover: ");
        int remover= input.nextInt();

        int ocorrencias=0;
        for (int j=0;j<tamanho;j++){
            if (vetorOriginal[j]==remover){
                ocorrencias++;
            }
        }
        int tamanhoNovo=tamanho-ocorrencias;
        int[] vetorNovo=new int[tamanhoNovo];
        int index=0;
        for (int i=0;i<tamanho;i++){
            if (vetorOriginal[i]!=remover){
                vetorNovo[index]=vetorOriginal[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(vetorNovo));
    }
}
