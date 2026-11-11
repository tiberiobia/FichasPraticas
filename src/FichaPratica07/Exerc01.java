package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {

        File ficheiro= new File("Files/exercicio_01.txt"); //Caminho relativo
        try {
            // Inicializar o leitor (Scanner)
            Scanner leitor = new Scanner(ficheiro);


            // Ler o ficheiro original linha a linha enquanto houver texto
            while (leitor.hasNextLine()) { //hasNextLine vai rodar o ciclo enquanto existir linhas
                String linhaAtual = leitor.nextLine(); //guarda na variavel a linha atual

                System.out.println(linhaAtual);
            }


            leitor.close();



        } catch (FileNotFoundException e) {
            System.out.println("Erro: O ficheiro não foi encontrado. Verifique o caminho.");
        }
    }
}
