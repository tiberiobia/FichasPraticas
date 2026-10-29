package FichaPratica01;

//Escreva um programa que calcule e apresente a área e o perímetro de um retângulo. As dimensões devem ser requisitadas ao utilizador.

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base, altura, area, perimetro;

        System.out.print("Digite a base do retangulo: ");
        base = input.nextDouble();

        System.out.print("Digite a altura do retangulo: ");
        altura = input.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("A area do retangulo é " + area);
        System.out.println("O perimetro do retangulo é " + perimetro);


    }
}
