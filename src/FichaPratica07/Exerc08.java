package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Escreva um programa que leia um ficheiro CSV contendo informações de vendas (tipo de produto, produto,
 // quantidade vendida, valor unitario) e calcule o valor total das vendas.
public class Exerc08 {
    public static void main(String[] args) {

        File ficheiro= new File("Files/exercicio_08.csv");
        int totalLinhas=0;
        double totalVendas=0;

        try{
            Scanner leitor= new Scanner(ficheiro);
            while (leitor.hasNextLine()){
                String linhaAtual = leitor.nextLine();
                totalLinhas++;
                if (totalLinhas>1){
                    String linhaLimpa = linhaAtual.trim();
                    if (!linhaLimpa.isEmpty()) {
                        String[] info = linhaLimpa.split(",");
                        //quero indice 2 e 3
                        int quant= Integer.parseInt(info[2].trim());
                        double valorProduto= Double.parseDouble(info[3].trim());

                        totalVendas+= quant*valorProduto;

                    }
                }

            }
            leitor.close();
            System.out.println("Valor total das vendas: " + totalVendas);
        } catch (FileNotFoundException e) {
            System.out.println("Erro: O ficheiro não foi encontrado.");
        }

    }
}
