package FichaPratica06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BibliotecaInput {

    public static int lerInteiro(){

        Scanner input = new Scanner(System.in);
        int numero=0;
        boolean correto=false;

        while (!correto) {
            try {
                System.out.print("Insira um número inteiro: ");
                numero = input.nextInt();
                correto=true;
            } catch (InputMismatchException exc) {
                System.out.println("Isso não é um número inteiro");
                input.nextLine();
                correto=false;
            }
        }

        return numero;

    }
}
