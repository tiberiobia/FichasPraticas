package FichaPratica01;
//Escreva um programa que leia dois valores inteiros e os armazene na variáveis valor1 e valor2. Permute o valor
// das variáveis e apresente o resultado. De seguida, verifique se consegue efetuar esta troca sem criar variáveis
//adicionais.

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1, valor2, temp;
        System.out.print("Introduza o primeiro valor: ");
        valor1 = input.nextInt();

        System.out.print("Introduza o segundo valor ");
        valor2 = input.nextInt();

        System.out.println("Os valores originais são: valor 1=  " + valor1 + " e valor 2 = " + valor2);

        valor1 = valor1 + valor2;  // valor1 agora tem a soma dos dois e o valor2 segue igual
        valor2 = valor1 - valor2;  //valor2 recebe (soma dos doid - valor2 original) sobra o valor 1 original
        valor1 = valor1 - valor2;  // valor1 recebe (soma dos dois - valor1 original), sobra é o valor2 original

        System.out.println("Os valores finais são: valor 1=  " + valor1 + " e valor 2 = " + valor2);


    }
}
