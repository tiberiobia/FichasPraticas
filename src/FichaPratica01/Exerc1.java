package FichaPratica01;

import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //criar as variaveis
        int num1, num2, soma;

        //ler valores do utilizador
        System.out.print("Introduza o primeiro numero: ");
        num1 = input.nextInt( );


        System.out.print("Introduza o segundo numero: ");
        num2 = input.nextInt( );

        //somar valores
        soma= num1 + num2;

        //exibir resultado
        System.out.println("A soma dos numeros é: " + soma);







    }
}
