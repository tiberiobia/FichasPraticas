package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tamanho = 8;
        int[] array1 = new int[tamanho];
        int[] array2 = new int[tamanho];
        int[] resultado = new int[8];

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
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    boolean existe = false;

                    // Evitar valores repetidos no resultado
                    for (int k = 0; k < tamanho; k++) {
                        if (resultado[k] == array1[i]) {
                            existe = true;
                            break;
                        }
                    }

                    if (!existe) {
                        resultado[tamanho] = array1[i];
                        tamanho++;
                    }

                    break;
                }
            }
        }

        // Criar um novo array com o tamanho adequado
        int[] arrayFinal = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            arrayFinal[i] = resultado[i];
        }

        // Mostrar o resultado
        System.out.println("Valores comuns aos dois arrays:");

        for (int i = 0; i < arrayFinal.length; i++) {
            System.out.print(arrayFinal[i] + " ");
        }

        input.close();
    }

}
