package FichaPratica01;
// um programa que determine a média aritmética de um conjunto de 3 notas introduzidas pelo utilizador.
//        Seguidamente, tendo em consideração os valores introduzidos, também deve apresentar a média ponderada
//       considerando as seguintes ponderações: 20%, 30%, 50% respetivamente.

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, aritmetica, ponderada;

        System.out.print("Introduza a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("Introduza a segunda nota: ");
        nota2 = input.nextDouble();

        System.out.print("Introduza a terceira nota: ");
        nota3 = input.nextDouble();

        aritmetica = (nota1 + nota2 + nota3) / 3;
        ponderada = (nota1 * 0.20) + (nota2 * 0.30) + (nota3 * 0.50);

        System.out.println("A media aritmetica e: " + aritmetica);
        System.out.println("A media ponderada e: " + ponderada);


    }
}
