package FichaPratica03;
import java.util.Scanner;
public class Exerc06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio, fim;

        System.out.print("Introduza um número de início: ");
        inicio= input.nextInt();
        System.out.print("Introduza um número de fim: ");
        fim= input.nextInt();

        for (int i=inicio;i<=fim;i++){
            System.out.println(i);
        }

    }
}
