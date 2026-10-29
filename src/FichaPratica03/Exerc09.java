package FichaPratica03;
import java.util.Scanner;
public class Exerc09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, contador=0;
        double soma=0;
        do{
            System.out.print("Digite um numero: ");
            num= input.nextInt();
            if (num!= -1){
                soma+=num;
                contador++;
            }
        }
        while (num!= -1);
        if (contador>0){
            double media= soma/contador;
            System.out.println("Media: "+ media);


        }

    }
}
