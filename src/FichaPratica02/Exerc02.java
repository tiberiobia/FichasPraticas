package FichaPratica02;
//Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
//a) Salário até 15.000€ inclusive paga taxa de 20%
//b) Salário superior a 15.000€ paga taxa de 30%.

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario, imposto;
        System.out.print("Introduza um salario: ");
        salario = input.nextDouble();
        if (salario <= 15000) {
            imposto = salario * 0.2;
            System.out.println("Paga taxa de 20% no total de: " + imposto);
        } else {
            imposto = salario * 0.3;
            System.out.println("Paga taxa de 30% no total de: " + imposto);
        }

    }
}
