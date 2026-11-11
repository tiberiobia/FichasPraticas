package FichaPraticaExtraFicheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        File ficheiro= new File("Files/exercicio_01.txt"); //Caminho relativo
        File ficheiro1= new File("Files/exercicio_01_Alternativa01.txt"); //Caminho relativo

        //novo ficheiro
        File ficheiroNovo= new File("Files/exerc01_filtrado.txt");
        String palavraProcurada = "Vitor";

        try {
            // Inicializar o leitor (Scanner) e o escritor (PrintWriter)
            Scanner leitor = new Scanner(ficheiro1);
            PrintWriter escritor = new PrintWriter(ficheiroNovo);

            // Ler o ficheiro original linha a linha enquanto houver texto
            while (leitor.hasNextLine()) { //hasNextLine vai rodar o ciclo enquanto existir linhas
                String linhaAtual = leitor.nextLine(); //guarda na variavel a linha atual

                // Verificar se a linha contém a palavra específica
                if (linhaAtual.contains(palavraProcurada)) {
                    // Escrever a linha no novo ficheiro
                    escritor.println(linhaAtual);
                }
            }

            // Fechar ambos os ficheiros (obrigatório para gravar os dados)
            leitor.close();
            escritor.close();

            System.out.println("Ficheiro filtrado gravado com sucesso!");

        } catch (FileNotFoundException e) {
            System.out.println("Erro: O ficheiro não foi encontrado. Verifique o caminho.");
        }
    }
}
