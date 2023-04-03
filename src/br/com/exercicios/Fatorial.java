package br.com.exercicios;

/**
 * Classe que realiza o cálculo do fatorial.
 * @author Evandro Rocha.
 * @email evandro.esw@gmail.com
 */
public class Fatorial {

    /**
     * Método que calcula o Fatorial.
     * Você deve utilizá-lo para realizar o cálculo fatorial.
     * @param numero número para realizar o fatorial sobre ele.
     * @author Evandro Rocha.
     */
    public long calculaFatorial(int numero) {
        if (numero <= 1) {
            return 1;
        } else {
            return numero * calculaFatorial(numero - 1);
        }
    }
}

