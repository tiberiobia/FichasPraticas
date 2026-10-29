package FichaPratica02;
//Escreva um programa que leia dois números reais e pergunte ao utilizador qual a operação aritmética que quer
//realizar e apresente o resultado. O utilizador deve responder usando o símbolo da operação (exemplo: para fazer
//        a soma, o utilizador deve escrever '+'). Se for inválido apresente erro.

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, resultado;
        String operacao;

        System.out.print("Digite o numero 1:  ");
        num1 = input.nextDouble();

        System.out.print("Digite o numero 2:  ");
        num2 = input.nextDouble();

        System.out.print("Digite a operação que quer executar (+ , - , * , /: ");
        operacao = input.next();
        if (operacao.equals("+")) {
            resultado = num1 + num2;
            System.out.println(resultado);
        } else if (operacao.equals("-")) {
            resultado = num1 - num2;
            System.out.println(resultado);
        } else if (operacao.equals("*")) {
            resultado = num1 * num2;
            System.out.println(resultado);
        } else if (operacao.equals("/")) {
            resultado = num1 * num2;
            System.out.println(resultado);
        } else {
            System.out.println("Erro - opção invalida");
        }


    }
}
