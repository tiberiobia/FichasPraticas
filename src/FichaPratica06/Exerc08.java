package FichaPratica06;

import java.util.Arrays;

public class Exerc08 {
    public static void main(String[] args) {
        int tamanho=3;
        int[ ][ ] matriz1 = new int[tamanho][tamanho];
        int[ ][ ] matriz2 = new int[tamanho][tamanho];
        int somatorio;


        somarMatrizes(matriz1,matriz2,tamanho);

        int soma=somatorioMatrizes(matriz1,matriz2,tamanho);
        System.out.println(soma);

    }
    public static void somarMatrizes(int[ ][ ] matriz1, int[ ][ ] matriz2,int tamanho){
        int[][] matrizSoma= new int[tamanho][tamanho];
        for (int i=0;i<tamanho;i++){
            for (int j=0; j<tamanho;j++){
                matrizSoma[i][j]= matriz1[i][j]+matriz2[i][j];
            }
        }
        System.out.println("Soma das matrizes: ");
        System.out.println(Arrays.toString(matrizSoma));
    }

    public static int somatorioMatrizes(int[ ][ ] matriz1, int[ ][ ] matriz2, int tamanho){
        int somatorio=0;

        for (int i=0;i<tamanho;i++){
            for (int j=0; j<tamanho;j++){
                somatorio+= matriz1[i][j]+matriz2[i][j];
            }
        }
        return somatorio;
    }

}
