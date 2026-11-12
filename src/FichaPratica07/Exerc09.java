
package FichaPratica07;

import java.io.File;
import java.util.Scanner;

import static FichaPratica07.Exerc09Funcoes.*;

public class Exerc09 {
    public static void main(String[] args) {

        File ficheiro = new File("Files/exercicio_09.csv");

        int totalMusicas = 0;

        try {
            Scanner leitor = new Scanner(ficheiro);

            // Contar músicas
            leitor.nextLine(); // Ignorar cabeçalho

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine().trim();

                if (!linha.isEmpty()) {
                    totalMusicas++;
                }
            }

            leitor.close();

            // Criar matriz
            String[][] matrizMusicas = new String[totalMusicas][4];

            Scanner sc = new Scanner(ficheiro);

            sc.nextLine(); // Ignorar cabeçalho

            int linhaMatriz = 0;

            while (sc.hasNextLine()) {

                String linha = sc.nextLine().trim();

                if (!linha.isEmpty()) {

                    String[] info = linha.split(",");

                    for (int i = 0; i < 4; i++) {
                        matrizMusicas[linhaMatriz][i] =
                                info[i].trim().toLowerCase();
                    }

                    linhaMatriz++;
                }
            }

            sc.close();

            Scanner input = new Scanner(System.in);

            int opcao;

            do {
                System.out.println("---Menu---");
                System.out.println("1. Pesquisar por género");
                System.out.println("2. Pesquisar por artista");
                System.out.println("3. Música com maior duração");
                System.out.println("4. Músicas acima de uma duração");
                System.out.println("5. Número de músicas");
                System.out.println("0. Sair");

                System.out.println("Escolha uma opção:");

                opcao = input.nextInt();
                input.nextLine();

                switch (opcao) {

                    case 1:
                        pesqGenero(matrizMusicas, input);
                        break;

                    case 2:
                        pesqArtista(matrizMusicas, input);
                        break;

                    case 3:
                        maiorDuracao(matrizMusicas);
                        break;

                    case 4:
                        duracaoValor(matrizMusicas, input);
                        break;

                    case 5:
                        System.out.println(
                                "Total de músicas: " + totalMusicas);
                        break;

                    case 0:
                        System.out.println("A sair...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } while (opcao != 0);

            input.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
