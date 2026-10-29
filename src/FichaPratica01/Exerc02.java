package FichaPratica01;
//Escreva um programa que requisite dois valores. O programa deverá utilizá-los como operandos para as seguintes
//operações aritméticas: soma, subtração, multiplicação e divisão. Apresente o resultado das operações e teste os
//resultados obtidos com vários casos.

import java.util.Scanner;
public class Exerc02 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int num1,num2,soma,subt,mult,div;

        System.out.print("Introduza o primeiro numero: ");
        num1 = input.nextInt( );


        System.out.print("Introduza o segundo numero: ");
        num2 = input.nextInt( );

        soma= num1+num2;
        subt= num1-num2;
        mult= num1* num2;
        div= num1/ num2;

        System.out.println("A soma dos numeros é: " + soma);
        System.out.println("A subtração dos numeros é: " + subt);
        System.out.println("A multiplicação dos numeros é: " + mult);
        System.out.println("A divisão dos numeros é: " + div);

    }
}
