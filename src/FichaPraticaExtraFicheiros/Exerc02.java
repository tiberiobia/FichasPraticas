package FichaPraticaExtraFicheiros;
//Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima a palavra mais frequente no
//ficheiro.
//        Desafio: Crie um programa que leia o conteúdo de um ficheiro de texto e imprima as 10 palavras mais
//frequentes no ficheiro

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {


        File ficheiro = new File("Files/extraExercicio_01.txt");
        try {
            Scanner leitor1 = new Scanner(ficheiro);
            int totalPalavras=0;
            while (leitor1.hasNext()) {
                leitor1.next();
                totalPalavras++;
            }

            leitor1.close();


            //arrays para guardar a info
            String [] palavrasUnicas= new   String[totalPalavras];
            int [] frequencia=new int[totalPalavras];
            int numUnicas=0;

            // cotabilizar frequencias
            Scanner leitor2=new Scanner(ficheiro);
            while (leitor2.hasNext()){
                String palavra= leitor2.next().toLowerCase();
                if (!palavra.isEmpty()){
                    //verificar se ja existe a palavra
                    int indice=-1;
                    for (int i = 0; i < numUnicas; i++) {
                        if (palavrasUnicas[i].equals(palavra)){
                            indice=i;
                            break;
                        }

                    }
                    if (indice!=-1){
                        frequencia[indice]++;

                    }else {
                        palavrasUnicas[numUnicas]=palavra;
                        frequencia[numUnicas]=1;
                        numUnicas++;
                    }

                }
            }
            leitor2.close();
            // 1. Ordenar os arrays por ordem decrescente de frequência (Bubble Sort)
            for (int i = 0; i < numUnicas - 1; i++) {
                for (int j = 0; j < numUnicas - 1 - i; j++) {
                    if (frequencia[j] < frequencia[j + 1]) {
                        // Troca as frequências
                        int tempFreq = frequencia[j];
                        frequencia[j] = frequencia[j + 1];
                        frequencia[j + 1] = tempFreq;

                        // Troca as palavras na mesma posição para manter a correspondência
                        String tempPalavra = palavrasUnicas[j];
                        palavrasUnicas[j] = palavrasUnicas[j + 1];
                        palavrasUnicas[j + 1] = tempPalavra;
                    }
                }
            }

            // 2. Imprimir os resultados
            if (numUnicas > 0) {
                // Exercício principal
                System.out.println("Palavra mais frequente: " + palavrasUnicas[0] + " (" + frequencia[0] + " vezes)");

                // Desafio: Top 10
                System.out.println("\n--- Top 10 palavras mais frequentes ---");
                int limite = Math.min(10, numUnicas); // Garante que não dá erro se o ficheiro tiver menos de 10 palavras
                for (int i = 0; i < limite; i++) {
                    System.out.println((i + 1) + "º: " + palavrasUnicas[i] + " - " + frequencia[i] + " vezes");
                }
            } else {
                System.out.println("O ficheiro está vazio.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Erro: O ficheiro não foi encontrado. Verifique o caminho.");
        }


    }
}
