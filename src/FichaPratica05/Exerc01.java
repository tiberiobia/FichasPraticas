package FichaPratica05;

import java.util.Arrays;

//Implemente um programa que permita adicionar 10 números inteiros a um array e que os imprima pela ordem
//de inserção.
public class Exerc01 {
    public static void main(String[] args) {
        int tamanho=10;
        int[] vetor= new int[10];
        for(int i=0;i<tamanho;i++){
            vetor[i]=i+1;
        }
        System.out.println(Arrays.toString(vetor));
    }
}
