package FichaPraticaExtra01;

public class Exerc05 {
    public static void main(String[] args) {
        //5.1
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);

            }
            System.out.println();
        }

        System.out.println("...");

        //5.2
        int totalLinhas = 5;
        for (int i = 1; i <= totalLinhas; i++) {
            for (int j = 1; j <= totalLinhas - i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= (i * 2 - 1); k++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        //5.3
        int totalLinhas2 = 5;
        int impares = 1;
        for (int i = 1; i <= totalLinhas2; i++) {
            for (int j = 1; j <= totalLinhas2 - i; j++) {
                System.out.print(" ");

            }
            int imp = i;

            boolean diminuir=true;
            for (int k = i; k <= impares; k++) {

                if (imp == 1) {
                    diminuir=false;
                }

                if(diminuir){
                    System.out.print(imp);
                    imp--;
                }else {
                    System.out.print(imp);
                    imp++;
                }

            }
            impares += 3;
            System.out.println();
        }
        System.out.println();

    }

}
