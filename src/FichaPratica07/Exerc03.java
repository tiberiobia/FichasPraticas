package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Escreva um programa que leia o conteúdo de um ficheiro de texto e grave-o num outro ficheiro
public class Exerc03 {
    public static void main(String[] args) {
        File ficheiro= new File("Files/exercicio_03.txt"); //Caminho relativo
        File ficheiroNovo= new File("Files/exerc03_resultado.txt");
        try {
            Scanner leitor = new Scanner(ficheiro);
            PrintWriter escritor= new PrintWriter(ficheiroNovo);

            while (leitor.hasNextLine()) {
                String linhaAtual = leitor.nextLine();

                escritor.println(linhaAtual);

            }
            leitor.close();
            escritor.close();
            System.out.println("Ficheiro copiado com sucesso!");

        } catch (FileNotFoundException e) {
            System.out.println("Erro: Ficheiro ou pasta não encontrados. " + e.getMessage());
        }
    }
}
