package FichaPratica03;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int i1 = 0, i2 = 0, i3 = 0, i4 = 0;

        System.out.print("Introduza um número inteiro: ");
        num = input.nextInt();

        while (num >= 0) {
            if (num >= 0 && num <= 25) {
                i1++;
            } else if (num >= 26 && num <= 50) {
                i2++;
            } else if (num >= 51 && num <= 75) {
                i3++;
            } else if (num >= 76 && num <= 100) {
                i4++;
            }

            System.out.print("Introduza outro número: ");
            num = input.nextInt();
        }

        System.out.println("Intervalo [0,25]: " + i1);
        System.out.println("Intervalo [26,50]: " + i2);
        System.out.println("Intervalo [51,75]: " + i3);
        System.out.println("Intervalo [76,100]: " + i4);

        input.close();
    }
}