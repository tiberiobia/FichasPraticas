package FichaPratica04;
//Implemente um programa que leia a opção do menu desejada (opções: 1. Criar, 2. Atualizar, 3. Eliminar, 4. Sair).
//Se uma das opções 1, 2 e 3 for escolhida, deverá apresentar um texto com a opção escolhida. Caso a escolha
//esteja fora das opções válidas, deverá informar o utilizador. De seguida, deverá apresentar novamente o menu
//para poder selecionar novas opções até que a opção 4 seja escolhida.

import java.util.Scanner;
public class Exerc05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Opções: ");
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");
            System.out.println("Digite o numero da opção que deseja: ");
            opcao= input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Criar");
                    break;
                case 2:
                    System.out.println("Atualizar");
                    break;
                case 3:
                    System.out.println("Eliminar");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Escolha invalida");
                    break;
            }


        } while (opcao!=4);

        input.close();

    }
}
