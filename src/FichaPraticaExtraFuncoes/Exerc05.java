package FichaPraticaExtraFuncoes;

import java.util.Scanner;

public class Exerc05 {
    public static String contarPiada(int piada) {

        String[] bibliotecaPiadas = new String[5];

        bibliotecaPiadas[0] = "Que nome se dá a uma ferramenta perdida? Foice.";
        bibliotecaPiadas[1] = "O que fazem 17 alentejanos em frente ao cinema? Esperam por mais um, porque o filme é para maiores de 18.";
        bibliotecaPiadas[2] = "Qual é a panela que está sempre triste? A panela depressão.";
        bibliotecaPiadas[3] = "O que acontece se o Pai Natal morrer? Ele não estará mais em trenós.";
        bibliotecaPiadas[4] = "Porque é que o livro de matemática estava triste? Porque tinha muitos problemas.";


        if (piada >= 0 && piada < bibliotecaPiadas.length) {
            return bibliotecaPiadas[piada];
        } else {
            return "A biblioteca de piadas só tem "
                    + bibliotecaPiadas.length + " piadas!";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número para ouvir uma piada: ");
        int numPiada = input.nextInt();

        System.out.println(contarPiada(numPiada));

        input.close();
    }
}
