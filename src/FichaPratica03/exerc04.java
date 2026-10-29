package FichaPratica03;
import java.util.Scanner;
public class exerc04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero:" );
        num= input.nextInt();
        for (int i=0;i<=num;i++){
            System.out.println(i);
        }
    }
}
