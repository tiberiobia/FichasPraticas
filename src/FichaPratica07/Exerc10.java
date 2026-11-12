package FichaPratica07;

import java.io.File;
import java.util.Scanner;

//10. Escreva um programa que leia um ficheiro CSV contendo informações de formandos (nome, matrícula,
//                                                                                    curso, email e idade) para uma matriz.
//                                                                                    (Para estar inscrito em dois cursos, um aluno terá mais que uma
//linha)
//a. Crie um menu com opções, sendo que cada uma delas albergará as seguintes alíneas.
//        b. Pesquisas (Novo Menu Aninhado)
//i. Imprimir todos os formandos.
//ii. Dado um número de matrícula, retorne todas as informações do formando.
//iii. Dado um curso, imprima todos os seus formandos (nome e matrícula), no final deve
//aparecer a contagem de formandos inscritos nesse curso.
//iv. Imprimir o aluno mais velho.
//v. Imprimir alunos que estão inscritos em mais de um curso.
//vi. Número de formandos no ficheiro.
//        c. Criar Formando
//i. Permita adicionar novas entradas ao ficheiro.
//d. Editar Formando
//i. Dado um número de matrícula, permita editar as informações do formando.
//        e. Eliminar Formando
//i. Dado um número de matrícula, permita eliminar as informações do formando.


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Exerc10 {

    public static void main(String[] args) {

        File ficheiro = new File("Files/exercicio_10.csv");

        Scanner input = new Scanner(System.in);

        try {

            int opcao = -1;

            do {

                // Contar linhas do ficheiro
                int totallinhas = 0;

                Scanner leitor = new Scanner(ficheiro);

                leitor.nextLine(); // Ignorar cabeçalho

                while (leitor.hasNextLine()) {

                    String linha = leitor.nextLine().trim();

                    if (!linha.isEmpty()) {
                        totallinhas++;
                    }
                }

                leitor.close();


                String[][] matriz = new String[totallinhas][5];

                Scanner sc = new Scanner(ficheiro);

                sc.nextLine();

                int linhaMatriz = 0;

                while (sc.hasNextLine()) {

                    String linha = sc.nextLine().trim();

                    if (!linha.isEmpty()) {

                        String[] info = linha.split(",", -1);

                        for (int i = 0; i < 5; i++) {
                            matriz[linhaMatriz][i] = info[i].trim();
                        }

                        linhaMatriz++;
                    }
                }

                sc.close();

                // MENU PRINCIPAL
                System.out.println("\n===== MENU PRINCIPAL =====");
                System.out.println("1 - Pesquisas");
                System.out.println("2 - Criar Formando");
                System.out.println("3 - Editar Formando");
                System.out.println("4 - Eliminar Formando");
                System.out.println("0 - Sair");

                System.out.print("Escolha uma opção: ");
                opcao = input.nextInt();
                input.nextLine();

                switch (opcao) {

                    // PESQUISAS
                    case 1:





                    // CRIAR FORMANDO
                    case 2:



                        break;

                    // EDITAR FORMANDO
                    case 3:



                        break;

                    // ELIMINAR FORMANDO
                    case 4:


                        break;

                    case 0:
                        System.out.println("Programa terminado!");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } while (opcao != 0);

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());
        }

        input.close();
    }
}
