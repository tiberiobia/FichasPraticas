package FichaPratica07;
//i. Imprimir todos os formandos.
//ii. Dado um número de matrícula, retorne todas as informações do formando.
//iii. Dado um curso, imprima todos os seus formandos (nome e matrícula), no final deve
//aparecer a contagem de formandos inscritos nesse curso.
//iv. Imprimir o aluno mais velho.
//v. Imprimir alunos que estão inscritos em mais de um curso.
//vi. Número de formandos no ficheiro.

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Exerc10Funcoes {

// ler o ficheiro csv
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
                    if (info.length == 5) {
                        for (int i = 0; i < 5; i++) {
                            matriz[linhaMatriz][i] = info[i].trim();
                        }

                        linhaMatriz++;
                    }
                }
            }

            sc.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return matriz;
    }
// quardar os dados no ficheiro csv-reescrever
public static void guardarMatriz(String[][] matriz, String caminhoFicheiro) {

    try {

        FileWriter escritor = new FileWriter(caminhoFicheiro);

        // Escrever cabeçalho
        escritor.write("Nome,Matricula,Curso,Email,Idade\n");

        // Escrever os dados da matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < 5; j++) {

                escritor.write(matriz[i][j]);

                if (j < 4) {
                    escritor.write(",");
                }
            }

            escritor.write("\n");
        }

        escritor.close();

    } catch (Exception e) {

        System.out.println("Erro ao guardar ficheiro: " + e.getMessage());
    }
}
//---------------------------------------------


    // PESQUISA-------
    //1.
    public static void imprimirFormandos(String[][] matriz) {
        System.out.println("\n---Lista de todos os formandos---");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Nome: " + matriz[i][0]
                    + ", Matricula: " + matriz[i][1]
                    + ", Curso: " + matriz[i][2]
                    + ", Email: " + matriz[i][3]
                    + ", Idade: " + matriz[i][4]);
        }
    }


    //2.
    public static void pesquisarPorMatricula(String[][] matriz, String matricula) {
        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][1].equals(matricula)) {
                System.out.println("formando encontrado");
                System.out.println("Nome: " + matriz[i][0] + ", matricula: " + matriz[i][1] +
                        ", curso: " + matriz[i][2] + ", email: " + matriz[i][3] +
                        ", idade: " + matriz[i][4]);
                encontrado = true;
            }

            }
        if (!encontrado) {
                System.out.println("Matricula não encontrada");
        }
    }


    //3.
    public static void pesquisarPorCurso(String[][] matriz, String curso){
        boolean encontrado = false;
        int totalFormandos=0;
        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i][2].equals(curso)) {
                System.out.println("curso encontrado");
                System.out.println("Nome: " + matriz[i][0] + ", matricula: " + matriz[i][1] );
                encontrado = true;
                totalFormandos++;
            }

        }
        if (!encontrado) {
            System.out.println("Curso não encontrado");
        }
        System.out.println("Total formandos: "+totalFormandos);

    }

    public static void alunoMaisVelho(String[][] matriz){
        if (matriz.length == 0) {
            System.out.println("Nao existem formandos!");
            return;
        }
        int maiorIdade=Integer.parseInt(matriz[0][4]);
        int indice=0;

        for (int i = 1; i < matriz.length ; i++) {
            int idadeAtual = Integer.parseInt(matriz[i][4]);
            if (idadeAtual > maiorIdade) {
                maiorIdade = idadeAtual;
                indice=i;
            }

        }
        System.out.println("\n--- Aluno mais velho ---");
        System.out.println("Nome: " + matriz[indice][0] + ", matricula: " + matriz[indice][1] +
                ", curso: " + matriz[indice][2] + ", email: " + matriz[indice][3] +
                ", idade: " + matriz[indice][4]);


    }

//5.
    public static void alunosVariosCursos(String[][] matriz){

        boolean encontrou =false;
        for (int i = 0; i < matriz.length; i++) {
            boolean matriculaRepetida=false;

            //verifica se ja apareceu a matricula
            for (int k = 0; k < i; k++) {

                if (matriz[i][1].equals(matriz[k][1])) {
                    matriculaRepetida = true;
                }
            }
            //so trabalho com matriculas que ainda nao apareceram
            if (!matriculaRepetida){
                int contadorCursos = 0; //quantos cursos o aluno i frequenta

                for (int j=0;j< matriz.length;j++){
                    if (matriz[i][1].equals(matriz[j][1])){ //procuro em toda a matriz a matricula
                        boolean cursoRepetido=false;
                        // verificar o curso (indice 2 da matriz)
                        for (int k = 0; k < j; k++) {

                            if (matriz[i][1].equals(matriz[k][1]) && matriz[j][2].equals(matriz[k][2])) {
                                cursoRepetido = true; // 2 linhas com a mesma matricula no mesmo curso
                            }
                        }
                        if (!cursoRepetido) {
                            contadorCursos++;
                        }

                    }
                }
                if (contadorCursos > 1) {

                    System.out.println("Nome: " + matriz[i][0]);
                    System.out.println("Matricula: " + matriz[i][1]);
                    System.out.println("Numero de cursos: " + contadorCursos);

                    encontrou = true;
                }

            }

        }
        if (!encontrou) {
            System.out.println("Nao existem alunos inscritos em varios cursos!");
        }

    }

    //6.
    public static void contarFormando(String[][] matriz){
        //O mesmo formando pode aparecer mais de uma vez
        int totalFormandos=0;
        boolean repetido=false;
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][1].equals(matriz[j][1])){
                    repetido=true;
                }

            }
            if (!repetido){
                totalFormandos++;

            }

        }
        System.out.println("Total de formandos: " + totalFormandos);

        System.out.println("Total de inscrições: " + matriz.length);

    }



// menu de pesquisa
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
            System.out.println("0. Voltar....");

            System.out.print("Escolha uma opção:");
            opcao=input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    imprimirFormandos(matriz);
                    break;
                case 2:
                    System.out.print("Digite a matricula que quer consultar:");
                    String matricula =input.nextLine();
                    pesquisarPorMatricula(matriz, matricula);
                    break;

                case 3:
                    System.out.print("Digite o curso que quer consultar:");
                    String curso =input.nextLine();
                    pesquisarPorCurso(matriz, curso);
                    break;

                case 4:
                    alunoMaisVelho(matriz);
                    break;
                case 5:
                    alunosVariosCursos(matriz);
                    break;
                case 6:
                    contarFormando(matriz);
                    break;
                case 0:
                    System.out.println("Voltando para o menu principla");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
    }

//------------------------------------------------------------------
//-----------------------------------------------------------------
      public static String[][] criarFormandos (String[][] matriz, String caminhoFicheiro){
          Scanner input = new Scanner(System.in);

          System.out.println("\n--- Criar formando: ---");

          System.out.print("Nome: ");
          String nome = input.nextLine();

          System.out.print("Matricula: ");
          String matricula = input.nextLine();

          System.out.print("Curso: ");
          String curso = input.nextLine();

          System.out.print("Email: ");
          String email = input.nextLine();

          System.out.print("Idade: ");
          String idade = input.nextLine();


          // verificar se idade é nmeros

          try {

              if (Integer.parseInt(idade) < 0) {
                  System.out.println("Idade invalida!");
                  return matriz;
              }

          } catch (NumberFormatException e) {

              System.out.println("A idade tem de ser um numero!");
              return matriz;
          }

          //nova matriz com mais uma linha para o novo aluno
          String[][] novaMatriz = new String[matriz.length + 1][5];

          //add na nova os dados da antiga

          for (int i = 0; i < matriz.length; i++) {

              for (int j = 0; j < 5; j++) {

                  novaMatriz[i][j] = matriz[i][j];
              }
          }
          //add novo formando
          novaMatriz[matriz.length][0] = nome;
          novaMatriz[matriz.length][1] = matricula;
          novaMatriz[matriz.length][2] = curso;
          novaMatriz[matriz.length][3] = email;
          novaMatriz[matriz.length][4] = idade;

          guardarMatriz(novaMatriz,caminhoFicheiro);

          System.out.println("Formando criado com sucesso!");

          return novaMatriz;

      }


    public static void editarFormando(String[][] matriz, String caminhoFicheiro) {

        Scanner input=new Scanner(System.in);
        System.out.println("\n--- Editar formando ---");
    // Procurar pela matrícula
        System.out.print("Introduza a matricula: ");
        String matricula = input.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i][1].equals(matricula)) {

                encontrado = true;

                System.out.println("\nDados atuais:");
                System.out.println("Nome: " + matriz[i][0]);
                System.out.println("Curso: " + matriz[i][2]);
                System.out.println("Email: " + matriz[i][3]);
                System.out.println("Idade: " + matriz[i][4]);
            }
        }

        if (!encontrado) {

            System.out.println("Matricula nao encontrada!");

        } else {

            System.out.println("\nIntroduza os novos dados:");

            System.out.print("Novo nome: ");
            String nome = input.nextLine();

            System.out.print("Novo email: ");
            String email = input.nextLine();

            System.out.print("Nova idade: ");
            String idade = input.nextLine();

            // Validar idade
            try {

                if (Integer.parseInt(idade) < 0) {
                    System.out.println("Idade invalida!");
                    return;
                }

            } catch (NumberFormatException e) {

                System.out.println("A idade tem de ser um numero!");
                return;
            }

            // Atualizar todas as linhas que tem essa matrícula
            for (int i = 0; i < matriz.length; i++) {

                if (matriz[i][1].equals(matricula)) {

                    matriz[i][0] = nome;
                    matriz[i][3] = email;
                    matriz[i][4] = idade;
                }
            }

            guardarMatriz(matriz, caminhoFicheiro);

            System.out.println("Formando editado com sucesso!");
        }
    }

    public static String[][] eliminarFormando(String[][] matriz, String caminhoFicheiro) {
        Scanner input=new Scanner(System.in);

        System.out.println("\n--- Eliminar Formando ---");

        System.out.print("Introduza a matricula: ");
        String matricula = input.nextLine();

        int contador = 0;

        // Contar quantas linhas pertencem à matrícula
        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i][1].equals(matricula)) {
                contador++;
            }
        }

        if (contador == 0) {

            System.out.println("Matricula nao encontrada!");

            return matriz;
        }

        // Criar nova matriz sem as linhas da matrícula
        String[][] novaMatriz = new String[matriz.length - contador][5];

        int linhaNova = 0;

        for (int i = 0; i < matriz.length; i++) {

            if (!matriz[i][1].equals(matricula)) {

                for (int j = 0; j < 5; j++) {

                    novaMatriz[linhaNova][j] = matriz[i][j];
                }

                linhaNova++;
            }
        }

        guardarMatriz(novaMatriz, caminhoFicheiro);

        System.out.println("Formando eliminado com sucesso!");
        System.out.println("Inscricoes eliminadas: " + contador);

        return novaMatriz;
    }


}

