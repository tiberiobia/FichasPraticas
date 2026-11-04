package FichaPratica05;
//Escreva um programa que lê um array de tamanho 10 e calcula a média dos elementos
public class Exerc05 {
    public static void main(String[] args) {
        double[] array = {5, 10, 20, 7, 30, 4, 18, 9, 10, 2};
        double media;
        double soma=0;
        for (int i=0; i<array.length; i++){
            soma+=array[i];
        }
        media=soma/array.length;
        System.out.println("A media dos elementos do array é: "+ media);
    }

}
