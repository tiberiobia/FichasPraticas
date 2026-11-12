
package FichaPratica07;

import java.util.Scanner;

public class Exerc09Funcoes {

    public static void pesqGenero(String[][] matriz, Scanner sc) {

        System.out.println("Digite o género que quer pesquisar:");
        String genero = sc.nextLine().trim().toLowerCase();

        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i][2].equals(genero)) {

                System.out.println("- " + matriz[i][0]
                        + ", " + matriz[i][1]);

                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Não foram encontradas músicas.");
        }
    }

    public static void pesqArtista(String[][] matriz, Scanner sc) {

        System.out.println("Digite o artista que quer pesquisar:");
        String artista = sc.nextLine().trim().toLowerCase();

        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i][1].equals(artista)) {

                System.out.println("- " + matriz[i][0]
                        + ", " + matriz[i][1]);

                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Não foram encontradas músicas.");
        }
    }

    public static void maiorDuracao(String[][] matriz) {

        if (matriz.length == 0) {
            System.out.println("Não existem músicas.");
            return;
        }

        double maiorMusica = Double.parseDouble(matriz[0][3]);

        int indice = 0;

        for (int i = 1; i < matriz.length; i++) {

            double duracaoAtual =
                    Double.parseDouble(matriz[i][3]);

            if (duracaoAtual > maiorMusica) {

                maiorMusica = duracaoAtual;
                indice = i;
            }
        }

        System.out.println("A música com maior duração é: "
                + matriz[indice][0] + ", "
                + matriz[indice][1]);
    }

    public static void duracaoValor(String[][] matriz, Scanner sc) {

        System.out.println("Qual a duração que quer analisar:");

        double duracao = sc.nextDouble();
        sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {

            double duracaoAtual =
                    Double.parseDouble(matriz[i][3]);

            if (duracaoAtual > duracao) {

                System.out.println("- " + matriz[i][0]
                        + ", " + matriz[i][1]);

                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Não foram encontradas músicas.");
        }
    }
}
