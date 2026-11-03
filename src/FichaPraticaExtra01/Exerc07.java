package FichaPraticaExtra01;

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, i=0;
        int maior = 0;
        int menor = 0;

        do {
            System.out.print("Digite o numero: ");
            num = input.nextInt();

            if (num != 0) {

                if (num > 0) {
                    maior ++;
                }

                if (num < 0) {
                    menor ++;
                }
                i++;


            }

        } while (num != 0);

        if (i > 0) {
            System.out.println("A quantidade de numeros positivos introduidos é: "+maior+" e a quantidade de numeros negativos é: "+menor);
        } else {
            System.out.println("Não foram introduzidos números.");
        }

        input.close();

    }
}
