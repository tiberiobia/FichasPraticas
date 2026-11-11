package FichaPraticaExtraFuncoes;

import java.util.Scanner;

public class Exerc08 {
    public static boolean vogal(String letra) {
        letra = letra.toLowerCase();

        if (letra.equals("a") || letra.equals("e") ||
                letra.equals("i") || letra.equals("o") ||
                letra.equals("u")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza uma letra: ");
        String letra = input.nextLine();

        System.out.println(vogal(letra));

        input.close();
    }
}
