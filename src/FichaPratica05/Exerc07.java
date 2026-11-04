package FichaPratica05;
//Implemente um programa que armazene num array 10 valores pedidos ao utilizador, e retorne o maior valor par
//inserido. Caso não exista, deverá informar o utilizador.

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];

        boolean existePar=false;
        int maiorPar=0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduza o elemento " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
            if(numeros[i]%2==0){
                if (!existePar || numeros[i] > maiorPar) {
                    maiorPar = numeros[i];
                    existePar = true;
                }
            }

        }
        if (existePar){
            System.out.println("O maior numero par inserido é: "+ maiorPar);
        }else {
            System.out.println("Não foram inceridos numeros pares");
        }


    }
}
