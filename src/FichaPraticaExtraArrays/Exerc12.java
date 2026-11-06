package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int tamanho=8;
        int[] array1=new int[tamanho];
        int[] array2=new int[tamanho];

        System.out.println("----- Primeiro array-----");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Introduza o " + (i + 1) + "º elemento: ");
            array1[i] = input.nextInt();
        }

        System.out.println("----- Segundo array-----");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Introduza o " + (i + 1) + "º elemento: ");
            array2[i] = input.nextInt();
        }
        for (int i=0; i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                

            }
        }


    }
}
