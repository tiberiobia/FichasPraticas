package FichaPraticaExtraFuncoes;

import java.util.Scanner;

public class Exerc07 {
    public static int inverterInteiro(int numero) {
        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        return invertido;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número inteiro: ");
        int numero = input.nextInt();

        System.out.println("Número invertido: " + inverterInteiro(numero));

        input.close();
    }
}
