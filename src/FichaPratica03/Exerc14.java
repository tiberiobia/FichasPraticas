package FichaPratica03;
//Escreva um programa que leia uma sequência de números inteiros do utilizador e determine se a sequência está
//em ordem crescente.

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador;
        int atual, anterior=0;
        boolean crescente=true;
        System.out.print("Digite quantos numeros deseja inserir: ");
        contador = input.nextInt();

        for (int i = 0; i < contador; i++) {
            System.out.print("Digite um numero: ");
            atual= input.nextInt();
            if(i>0 && atual<=anterior){
                crescente=false;


            }
            anterior=atual;

        }
        if (crescente){
            System.out.println("crescente");
        }else {
            System.out.println("Não é crescente");
        }

    }
}
