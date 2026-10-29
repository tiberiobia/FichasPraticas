package FichaPratica01;
// um programa para calcular a área da circunferência. As dimensões devem ser requisitadas ao utilizador.

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.1415;
        double raio, area;
        System.out.print("Digite o raio da circunferencia: ");
        raio = input.nextDouble();
        area = PI * (raio * raio);
        System.out.println("A area da circunferencia é: " + area);


    }
}
