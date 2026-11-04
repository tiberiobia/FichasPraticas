package FichaPratica06;

public class Exerc05 {

    /**
     * função que determina qual o maior número de um array
     * @param array array com números a ser avaliados
     * @return o maior número do array
     */
    public static int maior(int[]array){
        int maior = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }
    /**
     * função que determina qual o menor número de um array
     * @param array array com números a ser avaliados
     * @return o menor número do array
     */
    public static int menor(int[]array){
        int menor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }

    /**
     * Função para determinar se os números em um array estão em ordem crescente
     * @param array array com números a ser avaliados
     * @return true se for crescente || false se nao for crescente
     */
    public static boolean crescente(int[]array){
        boolean crescente=true;
        for (int i=1;i< array.length; i++){
            if(array[i]<array[i-1]){
                crescente= false;
            }
            break;

        }
        return (crescente);
    }





}
