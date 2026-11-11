package FichaPraticaExtraFuncoes;

import java.util.Scanner;

public class Exerc02 {
    public static double media(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.printf("Digite o primeiro numero" );
        int num1= input.nextInt();
        System.out.printf("Digite o segundo numero" );
        int num2= input.nextInt();
        System.out.printf("Digite o terceiro numero" );
        int num3= input.nextInt();

        double resultado = media(num1, num2, num3);
        System.out.println("A média é: " + resultado);
    }
}
