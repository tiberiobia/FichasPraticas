package FichaPratica07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exerc02 {
    public static void main(String[] args) {
        try {
            // Criar o ficheiro
            FileWriter ficheiro = new FileWriter("mensagem.txt");

            // Criar o escritor
            PrintWriter escritor = new PrintWriter(ficheiro);

            // Escrever uma mensagem
            escritor.println("Olá! Este é o meu primeiro ficheiro.");

            escritor.close();

            System.out.println("Ficheiro criado com sucesso!");

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o ficheiro.");
        }
    }
}


