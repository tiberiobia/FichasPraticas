package FichaPraticaExtraArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int tamanho = 15;
        int[] vetor = new int[tamanho];


        for (int i = 0; i < tamanho; i++) {
            System.out.print("Introduza o " + (i + 1) + "º elemento: ");
            vetor[i] = input.nextInt();
        }

        int numPares=0;
        int numImpares=0;

//        The for-each Loop
//        for (type variableName : arrayName) {
//            // code block to be executed
//        }
        for (int num: vetor){
            if (num%2==0){
                numPares++;
            }else {
                numImpares++;
            }

        }
        int [] vetorPares= new int[numPares];
        int [] vetorImpares= new int[numImpares];

        int idxPar=0;
        int idxImpar=0;

        for (int i=0;i< vetor.length;i++){
            if (vetor[i]%2==0){
                vetorPares[idxPar]=vetor[i];
                idxPar++;
            } else{
                vetorImpares[idxImpar]=vetor[i];
                idxImpar++;
            }
        }

        System.out.println("Vetor original: "+ Arrays.toString(vetor));
        System.out.println("Vetor par: "+ Arrays.toString(vetorPares));
        System.out.println("Vetor ímpar: "+ Arrays.toString(vetorImpares));

    }
}
