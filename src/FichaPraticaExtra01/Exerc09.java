package FichaPraticaExtra01;

import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numero;
        int soma=0;
        int digito;
        System.out.print("Digite um numero: ");
        numero= input.nextInt();
        int numeroOrig=numero;
        while (numero>0){
            digito=numero%10;
            soma+=digito;
            numero/=10;
        }
        System.out.println("A soma dos digitos do numero "+numeroOrig+" é: "+soma);
    }
}
