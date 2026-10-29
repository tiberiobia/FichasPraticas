package FichaPraticaExtra01;

public class Exerc04 {
    public static void main(String[] args) {
        //4.1
        for(int i=1;i<=4;i++){
            for (int j=1;j<10;j++){
                System.out.print("x");

            }
            System.out.println();
        }
        System.out.println();

        //4.2
        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("x");

            }
            System.out.println();
        }
        System.out.println();

        //4.3
        int totalLinhas=5;
        for(int i=1;i<=totalLinhas;i++){
            for (int j=1;j<=totalLinhas-i;j++){
                System.out.print(" ");

            }
            for(int k=1;k<=(i*2-1);k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();




    }
}
