package FichaPratica04;
//Escreva um programa que indique se um número pedido ao utilizador é primo. (Chamamos de número primo um
//número natural que só possui dois divisores: 1 e ele mesmo)
import java.util.Scanner;
public class Exerc07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int contador=0;
        System.out.println("Digite o numero: ");
        num = input.nextInt();
        for (int i=1;i<num;i++){
            if (num%i==0){
                contador++;
            }
        }
        if (contador>=2){
            System.out.println("O numero não é primo");
        }else {
            System.out.println("O numero é primo");
        }

    }
}
