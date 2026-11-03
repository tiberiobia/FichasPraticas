package FichaPraticaExtra01;

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numero;
        int digito;
        int invertido=0;
        System.out.print("Digite um numero: ");
        numero= input.nextInt();
        int numeroOrig=numero;
        while (numero>0){
            digito=numero%10;
            invertido= (invertido*10)+digito;
            numero/=10;
        }
        System.out.println("A soma dos digitos do numero "+numeroOrig+" é: "+invertido);

    }
}
