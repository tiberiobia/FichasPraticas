package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Escreva um programa que leia um ficheiro de texto contendo números inteiros separados por espaço e
// calcule a soma desses números.
public class Exerc05 {
    public static void main(String[] args) {
        File ficheiro = new File("Files/exercicio_05_31.txt");
        int soma = 0;

        try {
            Scanner leitor = new Scanner(ficheiro);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine().trim(); // Remove espaços no início e no fim da linha

                // Ignora a linha se estiver completamente vazia
                if (!linha.isEmpty()) {
                    String[] itensDaLinha = linha.split(" ");

                    for (int i = 0; i < itensDaLinha.length; i++) {

                        soma += Integer.parseInt(itensDaLinha[i]);// Converte a String em int antes de somar
                    }
                }
            }

            leitor.close();

            System.out.println("A soma dos números é: " + soma);

        } catch (FileNotFoundException e) {
            System.out.println("Erro: O ficheiro não foi encontrado. Verifique o caminho.");
        } catch (NumberFormatException e) {
            System.out.println("Erro: O ficheiro contém texto que não é um número inteiro válido.");
        }
    }
}
