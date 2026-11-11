package FichaPraticaExtraFuncoes;
import java.util.Scanner;

public class Exerc10 {
    // area do terreno
    public static double calcularArea(int forma, double a, double b) {

        switch (forma) {

            case 1: // Quadrado
                return a * a;

            case 2: // Retangulo
                return a * b;

            case 3: // Triangulo
                return (a * b) / 2;

            case 4: // Circulo
                return Math.PI * a * a;

            default:
                return 0;
        }
    }

    // preco por metro quadrado
    public static void analisarMercado(double precoM2, String tipologia) {

        double minimo = 0;
        double maximo = 0;

        switch (tipologia) {

            case "URBANO":
                minimo = 450;
                maximo = 750;
                break;

            case "URBANIZAVEL":
                minimo = 150;
                maximo = 500;
                break;

            case "RUSTICO":
                minimo = 30;
                maximo = 60;
                break;
        }

        if (precoM2 >= minimo && precoM2 <= maximo) {

            System.out.println("O terreno esta dentro do valor de mercado.");

        } else if (precoM2 > maximo) {

            System.out.println("O terreno esta acima do valor de mercado.");
            System.out.println("Valor excedente: "
                    + (precoM2 - maximo) + " euros/m2");

        } else {

            System.out.println("O terreno esta abaixo do valor de mercado.");
            System.out.println("Valor abaixo do minimo: "
                    + (minimo - precoM2) + " euros/m2");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int forma;
        double a = 0;
        double b = 0;
        double area;
        double preco;
        double precoM2;
        String tipologia;


        System.out.println("===== CALCULO DO PRECO DE TERRENOS =====");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retangulo");
        System.out.println("3 - Triangulo");
        System.out.println("4 - Circulo");

        System.out.print("Escolha a forma do terreno: ");
        forma = input.nextInt();

        // dimensoes necessarias
        switch (forma) {

            case 1:
                System.out.print("Introduza o lado: ");
                a = input.nextDouble();
                break;

            case 2:
                System.out.print("Introduza o comprimento: ");
                a = input.nextDouble();

                System.out.print("Introduza a largura: ");
                b = input.nextDouble();
                break;

            case 3:
                System.out.print("Introduza a base: ");
                a = input.nextDouble();

                System.out.print("Introduza a altura: ");
                b = input.nextDouble();
                break;

            case 4:
                System.out.print("Introduza o raio: ");
                a = input.nextDouble();
                break;

            default:
                System.out.println("Forma invalida!");
                input.close();
                return;
        }


        area = calcularArea(forma, a, b);

        System.out.println("Area do terreno: " + area + " m2");

        //  preco do terreno
        System.out.print("Introduza o preco do terreno: ");
        preco = input.nextDouble();

        // tipologia
        System.out.println("===== TIPOLOGIA DO TERRENO =====");
        System.out.println("URBANO");
        System.out.println("URBANIZAVEL");
        System.out.println("RUSTICO");

        System.out.print("Introduza a tipologia: ");
        tipologia = input.next().toUpperCase();

        // preco por metro quadrado
        precoM2 = preco / area;

        System.out.printf("Preco por m2: %.2f euros/m2%n", precoM2);


        analisarMercado(precoM2, tipologia);

        input.close();
    }
}
