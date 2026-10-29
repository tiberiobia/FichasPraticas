package FichaPratica02;
//Implemente um programa de menu (opções do menu: 1. Criar; 2. Atualizar; 3. Eliminar; 4. Sair). Se uma das opções
//1, 2 ou 3 for escolhida, imprima na tela a opção selecionada, se for a 4 não deve fazer nada. Caso a opção for
//inválida, deve informar o utilizador.
import java.util.Scanner;
public class Exerc12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        System.out.println("menu");
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");
        System.out.print("escolha uma opção:");
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
            default:
                System.out.println("Opção invalida");
        }




    }
}
