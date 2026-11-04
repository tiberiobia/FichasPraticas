package FichaPratica05;

//Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento.
public class Exerc03 {
    public static void main(String[] args) {
        int[] array = {5, 10, 20, 7, 30, 4, 18, 9, 10, 2};

        int maior = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }

        System.out.println("O maior elemento do array é: " + maior);
    }
}
