package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Escreva um programa que leia um ficheiro de texto contendo nomes e idades separados por vírgulas e
// imprima o nome da pessoa mais velha na consola.
public class Exerc06 {
    public static void main(String[] args) {
        String nomeMaisVelho = "";
        int maiorIdade = -1;

        try {
            Scanner leitor = new Scanner(new File("Files/exercicio_06.txt"));

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine().trim();
                if (!linha.isEmpty()) {
                    String[] dados = linha.split(",");
                    if (dados.length == 2) {
                        String nomeAtual = dados[0].trim();
                        int idadeAtual = Integer.parseInt(dados[1].trim());

                        if (idadeAtual > maiorIdade) {
                            maiorIdade = idadeAtual;
                            nomeMaisVelho = nomeAtual;
                        }
                    }
                }
            }

            leitor.close();

            if (maiorIdade != -1) {
                System.out.println("A pessoa mais velha é: " + nomeMaisVelho + " (" + maiorIdade + " anos)");
            } else {
                System.out.println("O ficheiro não contém dados válidos.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Erro: O ficheiro não foi encontrado. Verifique o caminho.");
        } catch (NumberFormatException e) {
            System.out.println("Erro: Formato de idade inválido no ficheiro.");
        }
    }
}

