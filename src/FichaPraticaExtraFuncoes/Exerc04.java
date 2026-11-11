package FichaPraticaExtraFuncoes;

public class Exerc04 {
    public static void imprimirTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        imprimirTabuada(5);
    }
}
