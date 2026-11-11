package FichaPraticaExtraFuncoes;

import java.util.Scanner;

public class Exerc09 {
    public static String nomeMes(int numero) {
        switch (numero) {
            case 1: return "Janeiro";
            case 2: return "Fevereiro";
            case 3: return "Março";
            case 4: return "Abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "Número inválido!";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número de 1 a 12: ");
        int numero = input.nextInt();

        System.out.println(nomeMes(numero));

        input.close();
    }
}
