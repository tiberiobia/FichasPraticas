package FichaPraticaExtra01;

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        long resultado=1;
        System.out.print("digite o primeiro numero: ");
        num1= input.nextInt();

        System.out.print("digite o segundo numero: ");
        num2= input.nextInt();

        for (int i=0; i<num2;i++){
            resultado*=num1;
        }
        System.out.println("O numero "+ num1+ "elevado a "+num2+ " é: " +resultado);


    }
}
