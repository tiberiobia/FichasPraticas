package FichaPratica06;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String animal;

        System.out.print("Insira um animal: ");
        animal= input.next().toLowerCase();

        fazerBarulho(animal);

    }
    public static void fazerBarulho(String animal){
        switch (animal){
            case "cão":
                System.out.println("Au au au");
                break;
            case "gato":
                System.out.println("Mia mia mia");
                break;
            case "peixe":
                System.out.println("Glup glup glup");
                break;
            case "vaca":
                System.out.println("Muuu");
                break;
            case "porco":
                System.out.println("Oinc oinc");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
