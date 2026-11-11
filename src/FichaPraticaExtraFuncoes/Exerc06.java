package FichaPraticaExtraFuncoes;

import java.util.Scanner;

public class Exerc06 {
    public static double somatorio(int numero) {
        int soma = 0;

        while (numero != 0) {
            soma += numero % 10;
            numero = numero / 10;
        }

        return soma;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número inteiro: ");
        int numero = input.nextInt();

        System.out.println("O somatório dos dígitos é: " + somatorio(numero));

        input.close();
    }
}
