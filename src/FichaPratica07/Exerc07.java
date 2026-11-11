package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima o número de linhas e o
//número de palavras presentes nesse ficheiro.
public class Exerc07 {
    public static void main(String[] args) {
        File ficheiro= new File("Files/exercicio_07.txt");
        int totalLinhas=0;
        int totalPalavras=0;

        try {

            Scanner leitor = new Scanner(ficheiro);
            while (leitor.hasNextLine()){
                String linhaAtual = leitor.nextLine();
                totalLinhas++;

                String linhaLimpa = linhaAtual.trim();
                if (!linhaLimpa.isEmpty()) {
                    String[] palavras = linhaLimpa.split("\\s+");
                    totalPalavras += palavras.length;
                }

            }
            leitor.close();
            System.out.println("Número de linhas: " + totalLinhas);
            System.out.println("Número de palavras: " + totalPalavras);

        } catch (FileNotFoundException e) {
            System.out.println("Erro: O ficheiro não foi encontrado.");
        }
    }
}
