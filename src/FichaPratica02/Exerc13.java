package FichaPratica02;
//Faça um programa que leia um horário no sistema de 24 horas e imprima esse horário no sistema de 12 horas.

import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horas, minutos, novaHora;
        String periodo;
        System.out.print("digite a hora: ");
        horas = input.nextInt();

        System.out.print("digite os minutos: ");
        minutos = input.nextInt();

        //pm ou am
        periodo = (horas >= 12) ? "PM" : "AM";
        //tranforma emtre 0 a 12
        novaHora = horas % 12;

        //meia noite e meio dia da 0 quando dividido por 12
        if (novaHora == 0) {
            novaHora = 12;
        }
        System.out.println(novaHora + ":" + minutos + periodo);


    }
}
