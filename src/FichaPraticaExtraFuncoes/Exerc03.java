package FichaPraticaExtraFuncoes;

import java.util.Scanner;

public class Exerc03 {
    public static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza a base do retângulo: ");
        double base = sc.nextDouble();

        System.out.print("Introduza a altura do retângulo: ");
        double altura = sc.nextDouble();

        double area = calcularAreaRetangulo(base, altura);

        System.out.println("A área do retângulo é: " + area);

        sc.close();
    }
}
