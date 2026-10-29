package FichaPratica03;

import java.util.Scanner;

public class Exerc15v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("digite um numero: ");
        num= input.nextInt();
        int fatorial=num;
        for(int i=num-1;i>=1;i--){
            int soma=0;
            for(int j=0; j<i;j++){
                soma+=fatorial;

            }
            fatorial=soma;
        }

        System.out.println("fatoria do  numero "+ num+ " é: "+ fatorial);
    }
}
