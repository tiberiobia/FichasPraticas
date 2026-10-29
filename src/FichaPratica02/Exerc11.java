package FichaPratica02;
//Implemente um programa que, após pedir ao utilizador o saldo da conta bancária e montante a creditar/debitar
//        (montante positivo ou negativo, respetivamente), apresente se a operação é válida, ou seja, se o saldo final se
//mantém positivo depois da operação. Finalmente, mostre o novo saldo.

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo, montante;
        System.out.print("introduza seu saldo da conta: ");
        saldo = input.nextDouble();
        System.out.print("Introduza o montante q quer adicionar ou retirar(neste caso adicione - antes do valo): ");
        montante = input.nextDouble();
        if (saldo + montante >= 0) {
            saldo += montante;
            System.out.println("Operação realizada com sucesso!");
            System.out.println("Novo saldo da conta: " + saldo);
        } else {
            System.out.println("Operação invalida!");
        }

    }
}
