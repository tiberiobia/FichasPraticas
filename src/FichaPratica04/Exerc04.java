package FichaPratica04;

//Implemente um programa que peça ao utilizador dois valores e um carácter representando uma das quatro
//operações aritméticas (+, -, *, /). Apresente o resultado de aplicar a operação correspondente aos valores. No
//final, deverá perguntar ao utilizador se deseja repetir, permitindo-lhe efetuar novos cálculos. Exemplo: Deseja
//continuar? (introduza s/n).

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, resultado;
        char operador, continuar = 's';
        do {
            System.out.print("digite o primeiro numero: ");
            num1 = input.nextDouble();

            System.out.print("digite o segundo numero: ");
            num2 = input.nextDouble();

            System.out.print("Digite a operação que quer realizar (+, -,*,/): ");
            operador = input.next().charAt(0);

            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    break;

                case '-':
                    resultado = num1 - num2;
                    break;

                case '*':
                    resultado = num1 * num2;
                    break;

                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: divisao por zero!");
                        continue;
                    }
                    break;

                default:
                    System.out.println("Operador invalido!");
                    continue;
            }

            System.out.println("Resultado: " + resultado);

            System.out.println("Deseja continuar? (introduza s/n): ");
            continuar = input.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        input.close();
    }
}
            

