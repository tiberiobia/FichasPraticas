package FichaPratica07;
//Escreva um programa que leia um ficheiro de texto contendo informações de eventos (nome, dia, mês,
//        ano, local, lotação) e exiba as informações dos eventos que irão ocorrer num determinado mês.
import java.io.File;
import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        File ficheiro = new File("Files/exercicio_11.csv");
        int totalLinhas=0;
        try {
            Scanner leitor=new Scanner(ficheiro);
            leitor.nextLine(); // Ignorar cabeçalho

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine().trim();

                if (!linha.isEmpty()) {
                    totalLinhas++;
                }
            }

            leitor.close();
            // Criar matriz
            String[][] matriz = new String[totalLinhas][5];

            Scanner sc = new Scanner(ficheiro);

            sc.nextLine(); // Ignorar cabeçalho

            int linhaMatriz = 0;

            while (sc.hasNextLine()) {

                String linha = sc.nextLine().trim();

                if (!linha.isEmpty()) {

                    String[] info = linha.split(",");

                    for (int i = 0; i < 5; i++) {
                        matriz[linhaMatriz][i] =
                                info[i].trim().toLowerCase();
                    }

                    linhaMatriz++;
                }
            }
            sc.close();
            //------------------------------------------------------------------------------
            Scanner input=new Scanner(System.in);
            System.out.println("Digite o mes:");
            String mes= input.next();
            boolean encontrado=false;
            for (int i=0;i<matriz.length;i++){
                if (matriz[i][2].equals(mes)){
                    for (int j=0;j<5;j++){
                        System.out.print(matriz[i][j]+", ");
                    }
                    System.out.println();
                }

            }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
