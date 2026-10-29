package FichaPratica03;
import java.util.Scanner;
public class Exerc15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, i = 1, fatorial=0;
        System.out.print("digite um numero: ");
        num= input.nextInt();
        while (i<=num){
            if (i==1){
                fatorial=1;
            }
            fatorial=fatorial*i;
            i++;
        }
        System.out.println(" Fatorial de "+ num+" é: " +fatorial);

    }
}
