package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.BibliotecaInput.*;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num=lerInteiro();
        imprimirAsteriscos(num);

    }
    public static void imprimirAsteriscos(int numero){
        for(int i=1;i<numero;i++){
            System.out.print("*");
        }

    }
}
