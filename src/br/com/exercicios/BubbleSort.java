package br.com.exercicios;

/**
 * Classe que realiza a ordenação por bubble sort.
 * @author Evandro Rocha.
 * @email evandro.esw@gmail.com
 */
public class BubbleSort {

    /**
     * Método de ordenação.
     * Você deve utilizá-lo para realizar as somas.
     * @param vetor array de inteiros.
     * @author Evandro Rocha.
     */
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;

        // Varredura do vetor.
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (vetor[j] > vetor[j+1]) {

                    // Troca dos elementos.
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
    }
}