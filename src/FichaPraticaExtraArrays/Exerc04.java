package FichaPraticaExtraArrays;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        int tamanho=10;
        int [] vetor=new int[tamanho];
        int numero, totalVezes=0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Introduza o " + (i + 1) + "º número: ");
            vetor[i] = input.nextInt();
        }


        System.out.print("valor que queres encontrar: ");
        numero= input.nextInt();

        for (int i=0; i< vetor.length;i++){
            if (vetor[i]==numero){
                System.out.println("- O valor " + numero + " foi encontrado no índice: " + i);
                totalVezes++;
            }
        }
        if (totalVezes>0){
            System.out.println("Número "+ numero+" aparece "+totalVezes+" vezes");
        }else {
            System.out.println(numero+" não existe no array");
        }

    }
}
