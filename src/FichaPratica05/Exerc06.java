package FichaPratica05;
//Escreva um programa que lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente.
import java.util.Scanner;
public class Exerc06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        boolean crescente = true;


        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduza o elemento " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }


        for (int i = 0; i < numeros.length-1; i++) {
            if (numeros[i] >= numeros[i + 1]) {
                crescente = false;
                break;
            }
        }


        if (crescente) {
            System.out.println("O array está em ordem crescente.");
        } else {
            System.out.println("O array não está em ordem crescente.");
        }
    }
}
