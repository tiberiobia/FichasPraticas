package FichaPraticaExtra01;

import java.util.Scanner;

public class exerc06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, i = 0;
        int maior = 0;
        int menor = 0;

        do {
            System.out.print("Digite o numero: ");
            num = input.nextInt();

            if (num != 0) {

                if (i == 0) {
                    maior = num;
                    menor = num;
                }

                if (num > maior) {
                    maior = num;
                }

                if (num < menor) {
                    menor = num;
                }

                i++;
            }

        } while (num != 0);

        if (i > 0) {
            System.out.println("O maior numero é " + maior +
                    " e o menor é " + menor);
        } else {
            System.out.println("Não foram introduzidos números.");
        }

        input.close();
    }
}
