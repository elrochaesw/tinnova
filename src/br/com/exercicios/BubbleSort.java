package br.com.exercicios;

public class BubbleSort {

    public static void main(String[] args) {
        int[] vetor = {5, 3, 2, 4, 7, 1, 0, 6};

        bubbleSort(vetor);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Trocar os elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}