package br.com.exercicios;

public class Fatorial {

    public static void main(String[] args) {
        int numero = 5; // Insira o número desejado aqui
        long resultado = fatorial(numero);

        System.out.printf("O fatorial de %d é: %d", numero, resultado);
    }

    public static long fatorial(int numero) {
        if (numero <= 1) {
            return 1;
        } else {
            return numero * fatorial(numero - 1);
        }
    }
}

