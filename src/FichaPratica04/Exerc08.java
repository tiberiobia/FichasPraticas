package FichaPratica04;
//Implemente uma função que determina se um número (passado por argumento) é triangular, a função deve
//retornar true se triangular ou false se não triangular (Um número triangular é um número que pode ser
//        representado pela soma de números inteiros consecutivos. Exemplo: 6 = 1+2+3 ou 15=1+2+3+4+5).

public class Exerc08 {
    public static void main(String[] args) {

        System.out.println(triangular(6));
        System.out.println(triangular(10));

    }

    public static boolean triangular(int num) {


        if (num < 1) return false;
        int soma = 0;
        int i = 1;
        while (soma < num) {
            soma += 1;
            i++;

        }
        return soma == num;
    }
}
