package FichaPratica07;
//i. Imprimir todos os formandos.
//ii. Dado um número de matrícula, retorne todas as informações do formando.
//iii. Dado um curso, imprima todos os seus formandos (nome e matrícula), no final deve
//aparecer a contagem de formandos inscritos nesse curso.
//iv. Imprimir o aluno mais velho.
//v. Imprimir alunos que estão inscritos em mais de um curso.
//vi. Número de formandos no ficheiro.

import java.io.File;
import java.util.Scanner;

public class Exerc10Funcoes {


    public static String[][] lerFicheiroParaMatriz(String caminhoFicheiro) {
        File ficheiro = new File(caminhoFicheiro);
        String[][] matriz;
        try {
            Scanner leitor = new Scanner(ficheiro);
            int totallinhas = 0;

            leitor.nextLine(); // Ignorar cabeçalho

            while (leitor.hasNextLine()) {

                String linha = leitor.nextLine().trim();

                if (!linha.isEmpty()) {
                    totallinhas++;
                }
            }

            leitor.close();


            matriz = new String[totallinhas][5];

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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return matriz;
    }

    // PESQUISA-------
    //1.
    public static void imprimirFormandos(String[][] matriz) {
        System.out.println("\n---Lista de todos os formandos---");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Nome: " + matriz[i][0] + ", matricula: " + matriz[i][1] +
                    ", curso: " + matriz[i][2]);
        }
    }

    //2.
    public static void pesquisarPorMatricula(String[][] matriz, int matricula) {
        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][1].equals(matricula)) {
                System.out.println("formando encontrado");
                System.out.println("Nome: " + matriz[i][0] + ", matricula: " + matriz[i][1] +
                        ", curso: " + matriz[i][2] + ", email: " + matriz[i][3] +
                        ", idade: " + matriz[i][4]);
                encontrado = true;
            }
            if (!encontrado) {
                System.out.println("Matricula não encontrada");
            }
        }
    }


    //3.
    public static void pesquisarPorCurso(String[][] matriz, int curso){
        boolean encontrado = false;
        int totalFormandos=0;
        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i][2].equals(curso)) {
                System.out.println("curso encontrado");
                System.out.println("Nome: " + matriz[i][0] + ", matricula: " + matriz[i][1] );
                encontrado = true;
                totalFormandos++;
            }

            if (!encontrado) {
                System.out.println("Curso não encontrado");
            }
            System.out.println("Total formandos: "+totalFormandos);
        }

    }

    public static void alunoMaisVelho(String[][] matriz){
        int maiorIdade=0;
        int indiceIdade=Integer.parseInt(matriz[0][4]);
        for (int i = 0; i < matriz.length ; i++) {
            if (matriz.length==0) return;
            for (int i = 1; i < matriz.length; i++) {
                int idadeAtual=Integer.parseInt(matriz[i][4]);


            }


        }


    }




    public static void menuPesquisa(String[][] matriz) {
        Scanner input = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("-----Pesquisas-------");
            System.out.println("1. Imprimir formandos");
            System.out.println("2. Informação de formando especifico");
            System.out.println("3. Informação por curso");
            System.out.println("4. Aluno mais velho");
            System.out.println("5. Alunos escritos em mais de um curso");
            System.out.println("6. Total de alunos");
            System.out.println("0. Sair....");
            System.out.print("Escolha uma opção:");
            opcao=input.nextInt();

            switch (opcao) {
                case 1:
                    imprimirFormandos(matriz);
                    break;
                case 2:
                    System.out.print("Digite a matricula que quer consultar:");
                    int matricula =input.nextInt();
                    pesquisarPorMatricula(matriz, matricula);
                    break;
                case 3:
                    System.out.print("Digite o curso que quer consultar:");
                    int curso =input.nextInt();
                    pesquisarPorCurso(matriz, curso);
                    break;
                case 4:

                    break;
                case 5:

                    break;

                case 6:
                    System.out.println("Total de alunos: ");
                    break;
                case 0:

                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
    }


}

