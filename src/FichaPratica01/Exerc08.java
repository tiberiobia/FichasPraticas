package FichaPratica01;
//Escreva um programa que calcule a duração (no formato hh:mm:ss) de um álbum musical com 5 canções. A
//duração de cada canção é lida em minutos e segundos.

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int somaMin = 0, somaSeg = 0, totalSeg, resto, horasAlbum, minAlbum, segAlbum;


        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduza os segundos da música " + i + ":");
            somaSeg += input.nextInt();
            System.out.println("Introduza os segundos da música " + i + ":");
            somaMin += input.nextInt();
        }

        totalSeg = (somaMin * 60) + somaSeg;
        horasAlbum = totalSeg / 3600;
        resto = totalSeg % 3600;
        minAlbum = resto / 60;
        segAlbum = resto % 60;

        System.out.println("Total do Álbum: " + horasAlbum + "h " + minAlbum + "m " + segAlbum + "s");


    }
}
