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

import static FichaPratica07.Exerc10Funcoes.*;

public class Exerc10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String caminhoFicheiro = "Files/exercicio_10.csv";

        String[][] matriz = lerFicheiroParaMatriz(caminhoFicheiro);
        int opcao = -1;
        do {


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

                    //função menu pesquisa- vai chamar outras funçoes
                    menuPesquisa(matriz);

                    break;

                // CRIAR FORMANDO
                case 2:
                    //função que add linha ao ficheiro


                    break;

                // EDITAR FORMANDO
                case 3:

                    //função que modifica linha do ficheiro

                    break;

                // ELIMINAR FORMANDO
                case 4:

                    //função que exclui linha do ficheiro
                    break;

                case 0:
                    System.out.println("Programa terminado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
        input.close();
    } catch(Exception e){

        System.out.println("Erro: " + e.getMessage());
    }


}



