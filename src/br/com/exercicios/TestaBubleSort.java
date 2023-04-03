package br.com.exercicios;

/**
 * Classe que testa a classe BubbleSort.
 * @author Evandro Rocha.
 * @email evandro.esw@gmail.com
 */
public class TestaBubleSort {

    public static void main(String[] args) {
        // Instancia da classe BubbleSort.
        BubbleSort sort = new BubbleSort();

        // Declaralção e atribuição do vetor.
        int[] vetor = {5, 3, 2, 4, 7, 1, 0, 6};

        // Chamada do método de ordenação.
        sort.bubbleSort(vetor);

        // Saída da execução do método bubbleSort(vetor) da classe BubbleSort
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
