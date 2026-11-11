package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Escreva um programa que leia um ficheiro CSV (Comma-Separated Values) e imprima o conteúdo na
//consola.
public class Exerc04 {
    public static void main(String[] args) {
        File ficheiro= new File("Files/exercicio_04.csv");
        try {

            Scanner leitor = new Scanner(ficheiro);

            while (leitor.hasNextLine()) {
                String linhaAtual = leitor.nextLine();

                System.out.println(linhaAtual);
            }

            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Erro: O ficheiro não foi encontrado. Verifique o caminho.");
        }
    }
}
