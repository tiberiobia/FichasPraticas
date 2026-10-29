package FichaPratica04;
//Implemente um programa que imprima os números ímpares de 11 a 51 (inclusive) usando o ciclo for, no final,
//apresente o somatório de todos estes números.

public class Exerc02 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 11; i <= 51; i += 2) {
            System.out.println(i);
            soma += i;
        }
        System.out.println("soma: " + soma);
    }
}
