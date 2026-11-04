package FichaPratica06;

public class Ex03 {

    /**
     * Função que avalia se um número é ou não par
     * @param num Número a ser avaliado
     * @return true se par || false se impar
     */
    public static boolean par(int num) {
        return num % 2 == 0;
    }

    /**
     * Função que avalia se um número é positivo
     * @param num Número a ser avaliado
     * @return true se positivo || false se negativo
     */
    public static boolean positivo(int num){return num>=0;}

    /**
     * Função que avalia se um número é primo
     * @param num Numero a ser avaliado
     * @return True se o numero for primo || false se o o numero nao for primo
     */
    public static boolean primo(int num){
        if (num<=1){
            return false;
        }
        if(num%2==0){
            return false;
        }
        for(int i=3;i*i<=num;i+=2){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }

    /**
     * Função que determina se um número é perfeito
     * @param num Número a ser avaliado
     * @return true se o número for perfeito|| false se imperfeito
     */
    public static boolean perfeito(int num){
        int soma=0;
        if (num<=1){
            return false;
        }
        for (int i=0;i<=num/2;i++){
            if (num%i==0){
                soma+=i;
            }

        }
        return (soma==num);
    }

    public static boolean triangular(int num){
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
