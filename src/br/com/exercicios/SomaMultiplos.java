package br.com.exercicios;

public class SomaMultiplos {

    public static void main(String[] args) {
        // Número limite
        int limite = 100;
        int soma = somaMultiplos(limite);

        System.out.println("A soma dos números múltiplos de 3 ou 5 até " + limite + " é: " + soma);
    }

    public static int somaMultiplos(int limite) {
        int soma = 0;

        for (int i = 1; i < limite; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }

        return soma;
    }
}
