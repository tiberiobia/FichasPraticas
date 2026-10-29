package FichaPratica03;
import java.util.Scanner;
public class Exerc05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String texto;
        System.out.print("Digite um numero:" );
        num= input.nextInt();
        texto= input.nextLine();

        System.out.print("Digite o texto; ");
        texto= input.nextLine();
        for (int i=1;i<=num;i++){
            System.out.println(texto);
        }
    }
}
