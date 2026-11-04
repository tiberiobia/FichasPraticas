package FichaPratica05;

import java.util.Scanner;

//Implemente um programa que permita adicionar comissões mensais a um array de tamanho 12 (uma posição
//para cada mês) e calcular o seu total anual.
public class Exerc02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       double[] comissoes=new double[12];
       double totalAno=0.0;

       String[] meses={"Janeiro","Fevereiro","março","abril","maio","junho","julho",
                        "agosto","setembro","outubro","novembro","dezembro"};

       for (int i=0;i< comissoes.length;i++){
           System.out.print("Insira a comissão de " + meses[i]+":");
           comissoes[i]=input.nextDouble();
           totalAno+=comissoes[i];
       }
        System.out.println("O total anual de comissões é: " +totalAno );
    }
}
