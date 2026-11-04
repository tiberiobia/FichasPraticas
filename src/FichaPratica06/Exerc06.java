package FichaPratica06;
import java.util.Scanner;

import static FichaPratica06.Exerc05.*;

public class Exerc06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tamanho do array que queres analisar:  ");
        int tamanho=input.nextInt();
        int opcao;
        int[] array= new int[tamanho];

        for (int i=0; i<array.length;i++){
            System.out.print("Digite o numero para a posição "+i+": ");
            array[i]=input.nextInt();
        }

        do{
            System.out.println("--Menu--");
            System.out.println("Digite o numero da opção desejada:");
            System.out.println("1- Maior Elemento");
            System.out.println("2- Menor Elemento");
            System.out.println("3- Crescente ou Não Crescente");
            System.out.println("0. Sair");
            opcao=input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("O maior elemento é: "+maior(array));
                    break;
                case 2:
                    System.out.println("O menor elemento é: "+menor(array));
                    break;
                case 3:
                    if (crescente(array)){
                        System.out.println("Os números do array estão em ordem crescente");
                    } else {
                        System.out.println("Os números do array nao estão em ordem crescente");
                    }
                    break;
                default:
                    System.out.println("Opção invalida");
                    continue;
            }

        } while (opcao!=0);

    }
}
