package FichaPraticaExtraFuncoes;

public class Exerc01 {
    public static int numeroMaisPequeno(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int resultado = numeroMaisPequeno(8, 3, 5);
        System.out.println("O número mais pequeno é: " + resultado);
    }

}
