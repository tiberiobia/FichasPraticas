package FichaPratica03;
//Faça um programa que leia um número inteiro (variável limite), um incremento (variável salto) e imprima os
//números inteiros de 0 até limite inclusive, com incremento de salto. Suponha que limite e salto são maiores que
//zero.
import java.util.Scanner;
public class Exerc11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limite, incremento;
        System.out.print("Digite um numero limite: ");
        limite= input.nextInt();

        System.out.print("Digite um numero de salto: ");
        incremento= input.nextInt();
        for (int i=0; i<=limite;i+=incremento){
            System.out.println(i);
        }



    }

}
